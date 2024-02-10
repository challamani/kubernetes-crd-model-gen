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
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecExtension;
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecHttp;
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecTcp;
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecTlsPassthrough;
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecWaf;
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecWorkloadSelector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * &#x60;IngressGateway&#x60; configures a workload to act as an ingress gateway into the mesh.
 */
@ApiModel(description = "`IngressGateway` configures a workload to act as an ingress gateway into the mesh.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpec {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private List<V2IngressGatewaySpecExtension> extension = null;

  public static final String SERIALIZED_NAME_FQN = "fqn";
  @SerializedName(SERIALIZED_NAME_FQN)
  private String fqn;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private List<V2IngressGatewaySpecHttp> http = null;

  public static final String SERIALIZED_NAME_TCP = "tcp";
  @SerializedName(SERIALIZED_NAME_TCP)
  private List<V2IngressGatewaySpecTcp> tcp = null;

  public static final String SERIALIZED_NAME_TLS_PASSTHROUGH = "tlsPassthrough";
  @SerializedName(SERIALIZED_NAME_TLS_PASSTHROUGH)
  private List<V2IngressGatewaySpecTlsPassthrough> tlsPassthrough = null;

  public static final String SERIALIZED_NAME_WAF = "waf";
  @SerializedName(SERIALIZED_NAME_WAF)
  private V2IngressGatewaySpecWaf waf;

  public static final String SERIALIZED_NAME_WORKLOAD_SELECTOR = "workloadSelector";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_SELECTOR)
  private V2IngressGatewaySpecWorkloadSelector workloadSelector;


  public V2IngressGatewaySpec description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the resource.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the resource.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V2IngressGatewaySpec displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * User friendly name for the resource.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User friendly name for the resource.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public V2IngressGatewaySpec etag(String etag) {
    
    this.etag = etag;
    return this;
  }

   /**
   * The etag for the resource.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The etag for the resource.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
  }


  public V2IngressGatewaySpec extension(List<V2IngressGatewaySpecExtension> extension) {
    
    this.extension = extension;
    return this;
  }

  public V2IngressGatewaySpec addExtensionItem(V2IngressGatewaySpecExtension extensionItem) {
    if (this.extension == null) {
      this.extension = new ArrayList<>();
    }
    this.extension.add(extensionItem);
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V2IngressGatewaySpecExtension> getExtension() {
    return extension;
  }


  public void setExtension(List<V2IngressGatewaySpecExtension> extension) {
    this.extension = extension;
  }


  public V2IngressGatewaySpec fqn(String fqn) {
    
    this.fqn = fqn;
    return this;
  }

   /**
   * Fully-qualified name of the resource.
   * @return fqn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fully-qualified name of the resource.")

  public String getFqn() {
    return fqn;
  }


  public void setFqn(String fqn) {
    this.fqn = fqn;
  }


  public V2IngressGatewaySpec http(List<V2IngressGatewaySpecHttp> http) {
    
    this.http = http;
    return this;
  }

  public V2IngressGatewaySpec addHttpItem(V2IngressGatewaySpecHttp httpItem) {
    if (this.http == null) {
      this.http = new ArrayList<>();
    }
    this.http.add(httpItem);
    return this;
  }

   /**
   * One or more HTTP or HTTPS servers exposed by the gateway.
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more HTTP or HTTPS servers exposed by the gateway.")

  public List<V2IngressGatewaySpecHttp> getHttp() {
    return http;
  }


  public void setHttp(List<V2IngressGatewaySpecHttp> http) {
    this.http = http;
  }


  public V2IngressGatewaySpec tcp(List<V2IngressGatewaySpecTcp> tcp) {
    
    this.tcp = tcp;
    return this;
  }

  public V2IngressGatewaySpec addTcpItem(V2IngressGatewaySpecTcp tcpItem) {
    if (this.tcp == null) {
      this.tcp = new ArrayList<>();
    }
    this.tcp.add(tcpItem);
    return this;
  }

   /**
   * Get tcp
   * @return tcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V2IngressGatewaySpecTcp> getTcp() {
    return tcp;
  }


  public void setTcp(List<V2IngressGatewaySpecTcp> tcp) {
    this.tcp = tcp;
  }


  public V2IngressGatewaySpec tlsPassthrough(List<V2IngressGatewaySpecTlsPassthrough> tlsPassthrough) {
    
    this.tlsPassthrough = tlsPassthrough;
    return this;
  }

  public V2IngressGatewaySpec addTlsPassthroughItem(V2IngressGatewaySpecTlsPassthrough tlsPassthroughItem) {
    if (this.tlsPassthrough == null) {
      this.tlsPassthrough = new ArrayList<>();
    }
    this.tlsPassthrough.add(tlsPassthroughItem);
    return this;
  }

   /**
   * One or more TLS servers exposed by the gateway.
   * @return tlsPassthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more TLS servers exposed by the gateway.")

  public List<V2IngressGatewaySpecTlsPassthrough> getTlsPassthrough() {
    return tlsPassthrough;
  }


  public void setTlsPassthrough(List<V2IngressGatewaySpecTlsPassthrough> tlsPassthrough) {
    this.tlsPassthrough = tlsPassthrough;
  }


  public V2IngressGatewaySpec waf(V2IngressGatewaySpecWaf waf) {
    
    this.waf = waf;
    return this;
  }

   /**
   * Get waf
   * @return waf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2IngressGatewaySpecWaf getWaf() {
    return waf;
  }


  public void setWaf(V2IngressGatewaySpecWaf waf) {
    this.waf = waf;
  }


  public V2IngressGatewaySpec workloadSelector(V2IngressGatewaySpecWorkloadSelector workloadSelector) {
    
    this.workloadSelector = workloadSelector;
    return this;
  }

   /**
   * Get workloadSelector
   * @return workloadSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2IngressGatewaySpecWorkloadSelector getWorkloadSelector() {
    return workloadSelector;
  }


  public void setWorkloadSelector(V2IngressGatewaySpecWorkloadSelector workloadSelector) {
    this.workloadSelector = workloadSelector;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpec v2IngressGatewaySpec = (V2IngressGatewaySpec) o;
    return Objects.equals(this.description, v2IngressGatewaySpec.description) &&
        Objects.equals(this.displayName, v2IngressGatewaySpec.displayName) &&
        Objects.equals(this.etag, v2IngressGatewaySpec.etag) &&
        Objects.equals(this.extension, v2IngressGatewaySpec.extension) &&
        Objects.equals(this.fqn, v2IngressGatewaySpec.fqn) &&
        Objects.equals(this.http, v2IngressGatewaySpec.http) &&
        Objects.equals(this.tcp, v2IngressGatewaySpec.tcp) &&
        Objects.equals(this.tlsPassthrough, v2IngressGatewaySpec.tlsPassthrough) &&
        Objects.equals(this.waf, v2IngressGatewaySpec.waf) &&
        Objects.equals(this.workloadSelector, v2IngressGatewaySpec.workloadSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, etag, extension, fqn, http, tcp, tlsPassthrough, waf, workloadSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpec {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    tcp: ").append(toIndentedString(tcp)).append("\n");
    sb.append("    tlsPassthrough: ").append(toIndentedString(tlsPassthrough)).append("\n");
    sb.append("    waf: ").append(toIndentedString(waf)).append("\n");
    sb.append("    workloadSelector: ").append(toIndentedString(workloadSelector)).append("\n");
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
