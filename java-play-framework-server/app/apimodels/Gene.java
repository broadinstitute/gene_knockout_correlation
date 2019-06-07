package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Gene
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-06-07T15:59:07.572Z")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Gene   {
  @JsonProperty("gene_symbol")
  private String geneSymbol = null;

  @JsonProperty("ensembl_gene")
  private List<String> ensemblGene = null;

  @JsonProperty("entrez_gene_id")
  private Integer entrezGeneId = null;

  @JsonProperty("synonym")
  private List<String> synonym = null;

  public Gene geneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
    return this;
  }

   /**
   * Get geneSymbol
   * @return geneSymbol
  **/
    public String getGeneSymbol() {
    return geneSymbol;
  }

  public void setGeneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
  }

  public Gene ensemblGene(List<String> ensemblGene) {
    this.ensemblGene = ensemblGene;
    return this;
  }

  public Gene addEnsemblGeneItem(String ensemblGeneItem) {
    if (ensemblGene == null) {
      ensemblGene = new ArrayList<>();
    }
    ensemblGene.add(ensemblGeneItem);
    return this;
  }

   /**
   * Get ensemblGene
   * @return ensemblGene
  **/
    public List<String> getEnsemblGene() {
    return ensemblGene;
  }

  public void setEnsemblGene(List<String> ensemblGene) {
    this.ensemblGene = ensemblGene;
  }

  public Gene entrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
    public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public Gene synonym(List<String> synonym) {
    this.synonym = synonym;
    return this;
  }

  public Gene addSynonymItem(String synonymItem) {
    if (synonym == null) {
      synonym = new ArrayList<>();
    }
    synonym.add(synonymItem);
    return this;
  }

   /**
   * Get synonym
   * @return synonym
  **/
    public List<String> getSynonym() {
    return synonym;
  }

  public void setSynonym(List<String> synonym) {
    this.synonym = synonym;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gene gene = (Gene) o;
    return Objects.equals(geneSymbol, gene.geneSymbol) &&
        Objects.equals(ensemblGene, gene.ensemblGene) &&
        Objects.equals(entrezGeneId, gene.entrezGeneId) &&
        Objects.equals(synonym, gene.synonym);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geneSymbol, ensemblGene, entrezGeneId, synonym);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gene {\n");
    
    sb.append("    geneSymbol: ").append(toIndentedString(geneSymbol)).append("\n");
    sb.append("    ensemblGene: ").append(toIndentedString(ensemblGene)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    synonym: ").append(toIndentedString(synonym)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

