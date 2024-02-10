/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tetrate.tsb.gateway.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WAF settings to be enabled for traffic passing through the HttpServer.
 */
@ApiModel(description = "WAF settings to be enabled for traffic passing through the HttpServer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpecWaf {
  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<String> rules = null;


  public V2IngressGatewaySpecWaf rules(List<String> rules) {
    
    this.rules = rules;
    return this;
  }

  public V2IngressGatewaySpecWaf addRulesItem(String rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules to be leveraged by WAF.
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rules to be leveraged by WAF.")

  public List<String> getRules() {
    return rules;
  }


  public void setRules(List<String> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpecWaf v2IngressGatewaySpecWaf = (V2IngressGatewaySpecWaf) o;
    return Objects.equals(this.rules, v2IngressGatewaySpecWaf.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpecWaf {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
