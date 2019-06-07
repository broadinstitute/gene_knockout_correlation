package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Correlation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-06-07T15:59:07.572Z")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Correlation   {
  @JsonProperty("entrez_gene_id_1")
  private Integer entrezGeneId1 = null;

  @JsonProperty("entrez_gene_id_2")
  private Integer entrezGeneId2 = null;

  @JsonProperty("correlation")
  private BigDecimal correlation = null;

  public Correlation entrezGeneId1(Integer entrezGeneId1) {
    this.entrezGeneId1 = entrezGeneId1;
    return this;
  }

   /**
   * Get entrezGeneId1
   * @return entrezGeneId1
  **/
    public Integer getEntrezGeneId1() {
    return entrezGeneId1;
  }

  public void setEntrezGeneId1(Integer entrezGeneId1) {
    this.entrezGeneId1 = entrezGeneId1;
  }

  public Correlation entrezGeneId2(Integer entrezGeneId2) {
    this.entrezGeneId2 = entrezGeneId2;
    return this;
  }

   /**
   * Get entrezGeneId2
   * @return entrezGeneId2
  **/
    public Integer getEntrezGeneId2() {
    return entrezGeneId2;
  }

  public void setEntrezGeneId2(Integer entrezGeneId2) {
    this.entrezGeneId2 = entrezGeneId2;
  }

  public Correlation correlation(BigDecimal correlation) {
    this.correlation = correlation;
    return this;
  }

   /**
   * Get correlation
   * @return correlation
  **/
  @Valid
  public BigDecimal getCorrelation() {
    return correlation;
  }

  public void setCorrelation(BigDecimal correlation) {
    this.correlation = correlation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Correlation correlation = (Correlation) o;
    return Objects.equals(entrezGeneId1, correlation.entrezGeneId1) &&
        Objects.equals(entrezGeneId2, correlation.entrezGeneId2) &&
        Objects.equals(correlation, correlation.correlation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId1, entrezGeneId2, correlation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correlation {\n");
    
    sb.append("    entrezGeneId1: ").append(toIndentedString(entrezGeneId1)).append("\n");
    sb.append("    entrezGeneId2: ").append(toIndentedString(entrezGeneId2)).append("\n");
    sb.append("    correlation: ").append(toIndentedString(correlation)).append("\n");
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

