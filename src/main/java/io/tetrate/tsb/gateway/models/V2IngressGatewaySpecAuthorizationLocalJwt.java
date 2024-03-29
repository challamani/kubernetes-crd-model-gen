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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JWT configuration to identity the subject.
 */
@ApiModel(description = "JWT configuration to identity the subject.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpecAuthorizationLocalJwt {
  public static final String SERIALIZED_NAME_ISS = "iss";
  @SerializedName(SERIALIZED_NAME_ISS)
  private String iss;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private Map<String, String> other = null;

  public static final String SERIALIZED_NAME_SUB = "sub";
  @SerializedName(SERIALIZED_NAME_SUB)
  private String sub;


  public V2IngressGatewaySpecAuthorizationLocalJwt iss(String iss) {
    
    this.iss = iss;
    return this;
  }

   /**
   * Get iss
   * @return iss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIss() {
    return iss;
  }


  public void setIss(String iss) {
    this.iss = iss;
  }


  public V2IngressGatewaySpecAuthorizationLocalJwt other(Map<String, String> other) {
    
    this.other = other;
    return this;
  }

  public V2IngressGatewaySpecAuthorizationLocalJwt putOtherItem(String key, String otherItem) {
    if (this.other == null) {
      this.other = new HashMap<>();
    }
    this.other.put(key, otherItem);
    return this;
  }

   /**
   * A set of arbitrary claims that are required to qualify the subject.
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of arbitrary claims that are required to qualify the subject.")

  public Map<String, String> getOther() {
    return other;
  }


  public void setOther(Map<String, String> other) {
    this.other = other;
  }


  public V2IngressGatewaySpecAuthorizationLocalJwt sub(String sub) {
    
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSub() {
    return sub;
  }


  public void setSub(String sub) {
    this.sub = sub;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpecAuthorizationLocalJwt v2IngressGatewaySpecAuthorizationLocalJwt = (V2IngressGatewaySpecAuthorizationLocalJwt) o;
    return Objects.equals(this.iss, v2IngressGatewaySpecAuthorizationLocalJwt.iss) &&
        Objects.equals(this.other, v2IngressGatewaySpecAuthorizationLocalJwt.other) &&
        Objects.equals(this.sub, v2IngressGatewaySpecAuthorizationLocalJwt.sub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iss, other, sub);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpecAuthorizationLocalJwt {\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
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

