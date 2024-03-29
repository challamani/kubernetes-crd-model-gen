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
 * V2IngressGatewaySpecAuthenticationJwt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpecAuthenticationJwt {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";
  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences = null;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_JWKS = "jwks";
  @SerializedName(SERIALIZED_NAME_JWKS)
  private String jwks;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwksUri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri;


  public V2IngressGatewaySpecAuthenticationJwt audiences(List<String> audiences) {
    
    this.audiences = audiences;
    return this;
  }

  public V2IngressGatewaySpecAuthenticationJwt addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * Get audiences
   * @return audiences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAudiences() {
    return audiences;
  }


  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }


  public V2IngressGatewaySpecAuthenticationJwt issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Identifies the issuer that issued the JWT.
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the issuer that issued the JWT.")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public V2IngressGatewaySpecAuthenticationJwt jwks(String jwks) {
    
    this.jwks = jwks;
    return this;
  }

   /**
   * JSON Web Key Set of public keys to validate signature of the JWT.
   * @return jwks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON Web Key Set of public keys to validate signature of the JWT.")

  public String getJwks() {
    return jwks;
  }


  public void setJwks(String jwks) {
    this.jwks = jwks;
  }


  public V2IngressGatewaySpecAuthenticationJwt jwksUri(String jwksUri) {
    
    this.jwksUri = jwksUri;
    return this;
  }

   /**
   * Get jwksUri
   * @return jwksUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJwksUri() {
    return jwksUri;
  }


  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpecAuthenticationJwt v2IngressGatewaySpecAuthenticationJwt = (V2IngressGatewaySpecAuthenticationJwt) o;
    return Objects.equals(this.audiences, v2IngressGatewaySpecAuthenticationJwt.audiences) &&
        Objects.equals(this.issuer, v2IngressGatewaySpecAuthenticationJwt.issuer) &&
        Objects.equals(this.jwks, v2IngressGatewaySpecAuthenticationJwt.jwks) &&
        Objects.equals(this.jwksUri, v2IngressGatewaySpecAuthenticationJwt.jwksUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, issuer, jwks, jwksUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpecAuthenticationJwt {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
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

