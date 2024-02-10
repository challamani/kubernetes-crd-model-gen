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
import io.tetrate.tsb.gateway.models.V2IngressGatewaySpecRoute;
import java.io.IOException;

/**
 * V2IngressGatewaySpecTlsPassthrough
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpecTlsPassthrough {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private V2IngressGatewaySpecRoute route;


  public V2IngressGatewaySpecTlsPassthrough hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Hostname with which the service can be expected to be accessed by clients.
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hostname with which the service can be expected to be accessed by clients.")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public V2IngressGatewaySpecTlsPassthrough name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name assigned to the server.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A name assigned to the server.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V2IngressGatewaySpecTlsPassthrough port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port where the server is exposed.
   * minimum: 0
   * maximum: 4294967295
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The port where the server is exposed.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public V2IngressGatewaySpecTlsPassthrough route(V2IngressGatewaySpecRoute route) {
    
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2IngressGatewaySpecRoute getRoute() {
    return route;
  }


  public void setRoute(V2IngressGatewaySpecRoute route) {
    this.route = route;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpecTlsPassthrough v2IngressGatewaySpecTlsPassthrough = (V2IngressGatewaySpecTlsPassthrough) o;
    return Objects.equals(this.hostname, v2IngressGatewaySpecTlsPassthrough.hostname) &&
        Objects.equals(this.name, v2IngressGatewaySpecTlsPassthrough.name) &&
        Objects.equals(this.port, v2IngressGatewaySpecTlsPassthrough.port) &&
        Objects.equals(this.route, v2IngressGatewaySpecTlsPassthrough.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, name, port, route);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpecTlsPassthrough {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

