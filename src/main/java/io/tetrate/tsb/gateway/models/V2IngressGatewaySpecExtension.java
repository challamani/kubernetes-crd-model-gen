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

/**
 * V2IngressGatewaySpecExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T22:11:16.316Z[Etc/UTC]")
public class V2IngressGatewaySpecExtension {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Object config;

  public static final String SERIALIZED_NAME_FQN = "fqn";
  @SerializedName(SERIALIZED_NAME_FQN)
  private String fqn;


  public V2IngressGatewaySpecExtension config(Object config) {
    
    this.config = config;
    return this;
  }

   /**
   * Configuration parameters sent to the WASM plugin execution.
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configuration parameters sent to the WASM plugin execution.")

  public Object getConfig() {
    return config;
  }


  public void setConfig(Object config) {
    this.config = config;
  }


  public V2IngressGatewaySpecExtension fqn(String fqn) {
    
    this.fqn = fqn;
    return this;
  }

   /**
   * Fqn of the extension to be executed.
   * @return fqn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fqn of the extension to be executed.")

  public String getFqn() {
    return fqn;
  }


  public void setFqn(String fqn) {
    this.fqn = fqn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2IngressGatewaySpecExtension v2IngressGatewaySpecExtension = (V2IngressGatewaySpecExtension) o;
    return Objects.equals(this.config, v2IngressGatewaySpecExtension.config) &&
        Objects.equals(this.fqn, v2IngressGatewaySpecExtension.fqn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, fqn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2IngressGatewaySpecExtension {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
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

