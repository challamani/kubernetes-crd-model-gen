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
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecRateLimitingExternalServiceHeaderValueMatch;
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecRateLimitingExternalServiceRequestHeaders;
import java.io.IOException;

/**
 * V2IngressGatewaySpecRateLimitingExternalServiceDimensions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpecRateLimitingExternalServiceDimensions {
  public static final String SERIALIZED_NAME_DESTINATION_CLUSTER = "destinationCluster";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CLUSTER)
  private Object destinationCluster;

  public static final String SERIALIZED_NAME_HEADER_VALUE_MATCH = "headerValueMatch";
  @SerializedName(SERIALIZED_NAME_HEADER_VALUE_MATCH)
  private V2IngressGatewaySpecRateLimitingExternalServiceHeaderValueMatch headerValueMatch;

  public static final String SERIALIZED_NAME_REMOTE_ADDRESS = "remoteAddress";
  @SerializedName(SERIALIZED_NAME_REMOTE_ADDRESS)
  private Object remoteAddress;

  public static final String SERIALIZED_NAME_REQUEST_HEADERS = "requestHeaders";
  @SerializedName(SERIALIZED_NAME_REQUEST_HEADERS)
  private V2IngressGatewaySpecRateLimitingExternalServiceRequestHeaders requestHeaders;

  public static final String SERIALIZED_NAME_SOURCE_CLUSTER = "sourceCluster";
  @SerializedName(SERIALIZED_NAME_SOURCE_CLUSTER)
  private Object sourceCluster;


  public V2IngressGatewaySpecRateLimitingExternalServiceDimensions destinationCluster(Object destinationCluster) {
    
    this.destinationCluster = destinationCluster;
    return this;
  }

   /**
   * Rate limit on destination envoy cluster.
   * @return destinationCluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rate limit on destination envoy cluster.")

  public Object getDestinationCluster() {
    return destinationCluster;
  }


  public void setDestinationCluster(Object destinationCluster) {
    this.destinationCluster = destinationCluster;
  }


  public V2IngressGatewaySpecRateLimitingExternalServiceDimensions headerValueMatch(V2IngressGatewaySpecRateLimitingExternalServiceHeaderValueMatch headerValueMatch) {
    
    this.headerValueMatch = headerValueMatch;
    return this;
  }

   /**
   * Get headerValueMatch
   * @return headerValueMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2IngressGatewaySpecRateLimitingExternalServiceHeaderValueMatch getHeaderValueMatch() {
    return headerValueMatch;
  }


  public void setHeaderValueMatch(V2IngressGatewaySpecRateLimitingExternalServiceHeaderValueMatch headerValueMatch) {
    this.headerValueMatch = headerValueMatch;
  }


  public V2IngressGatewaySpecRateLimitingExternalServiceDimensions remoteAddress(Object remoteAddress) {
    
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Rate limit on remote address of client.
   * @return remoteAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rate limit on remote address of client.")

  public Object getRemoteAddress() {
    return remoteAddress;
  }


  public void setRemoteAddress(Object remoteAddress) {
    this.remoteAddress = remoteAddress;
  }


  public V2IngressGatewaySpecRateLimitingExternalServiceDimensions requestHeaders(V2IngressGatewaySpecRateLimitingExternalServiceRequestHeaders requestHeaders) {
    
    this.requestHeaders = requestHeaders;
    return this;
  }

   /**
   * Get requestHeaders
   * @return requestHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2IngressGatewaySpecRateLimitingExternalServiceRequestHeaders getRequestHeaders() {
    return requestHeaders;
  }


  public void setRequestHeaders(V2IngressGatewaySpecRateLimitingExternalServiceRequestHeaders requestHeaders) {
    this.requestHeaders = requestHeaders;
  }


  public V2IngressGatewaySpecRateLimitingExternalServiceDimensions sourceCluster(Object sourceCluster) {
    
    this.sourceCluster = sourceCluster;
    return this;
  }

   /**
   * Rate limit on source envoy cluster.
   * @return sourceCluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rate limit on source envoy cluster.")

  public Object getSourceCluster() {
    return sourceCluster;
  }


  public void setSourceCluster(Object sourceCluster) {
    this.sourceCluster = sourceCluster;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpecRateLimitingExternalServiceDimensions v2IngressGatewaySpecRateLimitingExternalServiceDimensions = (V2IngressGatewaySpecRateLimitingExternalServiceDimensions) o;
    return Objects.equals(this.destinationCluster, v2IngressGatewaySpecRateLimitingExternalServiceDimensions.destinationCluster) &&
        Objects.equals(this.headerValueMatch, v2IngressGatewaySpecRateLimitingExternalServiceDimensions.headerValueMatch) &&
        Objects.equals(this.remoteAddress, v2IngressGatewaySpecRateLimitingExternalServiceDimensions.remoteAddress) &&
        Objects.equals(this.requestHeaders, v2IngressGatewaySpecRateLimitingExternalServiceDimensions.requestHeaders) &&
        Objects.equals(this.sourceCluster, v2IngressGatewaySpecRateLimitingExternalServiceDimensions.sourceCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationCluster, headerValueMatch, remoteAddress, requestHeaders, sourceCluster);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpecRateLimitingExternalServiceDimensions {\n");
    sb.append("    destinationCluster: ").append(toIndentedString(destinationCluster)).append("\n");
    sb.append("    headerValueMatch: ").append(toIndentedString(headerValueMatch)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    sourceCluster: ").append(toIndentedString(sourceCluster)).append("\n");
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
