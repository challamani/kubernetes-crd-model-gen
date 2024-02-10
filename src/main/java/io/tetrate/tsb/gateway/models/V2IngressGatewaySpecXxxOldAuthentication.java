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
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecAuthenticationJwt;
import java.io.IOException;

/**
 * V2IngressGatewaySpecXxxOldAuthentication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpecXxxOldAuthentication {
  public static final String SERIALIZED_NAME_JWT = "jwt";
  @SerializedName(SERIALIZED_NAME_JWT)
  private V2IngressGatewaySpecAuthenticationJwt jwt;


  public V2IngressGatewaySpecXxxOldAuthentication jwt(V2IngressGatewaySpecAuthenticationJwt jwt) {
    
    this.jwt = jwt;
    return this;
  }

   /**
   * Get jwt
   * @return jwt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2IngressGatewaySpecAuthenticationJwt getJwt() {
    return jwt;
  }


  public void setJwt(V2IngressGatewaySpecAuthenticationJwt jwt) {
    this.jwt = jwt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpecXxxOldAuthentication v2IngressGatewaySpecXxxOldAuthentication = (V2IngressGatewaySpecXxxOldAuthentication) o;
    return Objects.equals(this.jwt, v2IngressGatewaySpecXxxOldAuthentication.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpecXxxOldAuthentication {\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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

