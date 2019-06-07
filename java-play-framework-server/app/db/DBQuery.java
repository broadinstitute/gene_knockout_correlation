package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import apimodels.Correlation;
import apimodels.Gene;

public class DBQuery {

	public static ArrayList<Gene> getGenes() {
		ArrayList<Gene> list = new ArrayList<Gene>();
		String query = "SELECT entrez_gene_id, hgnc_symbol, synonyms, ensembl_gene_id FROM meta_gene;";
		Connection con = null;
		try {
			con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while (res.next()) {
				Gene gene = new Gene();
				gene.setEntrezGeneId(res.getInt("entrez_gene_id"));
				gene.setGeneSymbol(res.getString("hgnc_symbol"));
				String[] synonyms = res.getString("synonyms").split(",");
				gene.setSynonym(Arrays.asList(synonyms));
				String[] ensembl = res.getString("ensembl_gene_id").split(",");
				gene.setEnsemblGene(Arrays.asList(ensembl));
				list.add(gene);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
	
	
	public static ArrayList<Correlation> getCorrelations(int queryGeneId) {
		ArrayList<Correlation> list = new ArrayList<Correlation>();
		String query = "select entrez_gene_id_1, entrez_gene_id_2, correlation FROM cor where entrez_gene_id_1 = "+queryGeneId+";";
		Connection con = null;
		try {
			con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while (res.next()) {
				Correlation cor = new Correlation();
				cor.setEntrezGeneId1(res.getInt("entrez_gene_id_1"));
				cor.setEntrezGeneId2(res.getInt("entrez_gene_id_2"));
				cor.setCorrelation(res.getBigDecimal("correlation"));
				list.add(cor);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
			
		return list;
	}

	static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("org.sqlite.JDBC");
		return DriverManager.getConnection("jdbc:sqlite:depmap.gene.correlations.sqlite");
	}

}
