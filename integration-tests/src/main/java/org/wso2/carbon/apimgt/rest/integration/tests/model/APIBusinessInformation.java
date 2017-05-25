/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * APIBusinessInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-09T06:36:48.873Z")
public class APIBusinessInformation {
  @SerializedName("businessOwner")
  private String businessOwner = null;

  @SerializedName("businessOwnerEmail")
  private String businessOwnerEmail = null;

  @SerializedName("technicalOwner")
  private String technicalOwner = null;

  @SerializedName("technicalOwnerEmail")
  private String technicalOwnerEmail = null;

  public APIBusinessInformation businessOwner(String businessOwner) {
    this.businessOwner = businessOwner;
    return this;
  }

   /**
   * Get businessOwner
   * @return businessOwner
  **/
  @ApiModelProperty(example = "businessowner", value = "")
  public String getBusinessOwner() {
    return businessOwner;
  }

  public void setBusinessOwner(String businessOwner) {
    this.businessOwner = businessOwner;
  }

  public APIBusinessInformation businessOwnerEmail(String businessOwnerEmail) {
    this.businessOwnerEmail = businessOwnerEmail;
    return this;
  }

   /**
   * Get businessOwnerEmail
   * @return businessOwnerEmail
  **/
  @ApiModelProperty(example = "businessowner@wso2.com", value = "")
  public String getBusinessOwnerEmail() {
    return businessOwnerEmail;
  }

  public void setBusinessOwnerEmail(String businessOwnerEmail) {
    this.businessOwnerEmail = businessOwnerEmail;
  }

  public APIBusinessInformation technicalOwner(String technicalOwner) {
    this.technicalOwner = technicalOwner;
    return this;
  }

   /**
   * Get technicalOwner
   * @return technicalOwner
  **/
  @ApiModelProperty(example = "technicalowner", value = "")
  public String getTechnicalOwner() {
    return technicalOwner;
  }

  public void setTechnicalOwner(String technicalOwner) {
    this.technicalOwner = technicalOwner;
  }

  public APIBusinessInformation technicalOwnerEmail(String technicalOwnerEmail) {
    this.technicalOwnerEmail = technicalOwnerEmail;
    return this;
  }

   /**
   * Get technicalOwnerEmail
   * @return technicalOwnerEmail
  **/
  @ApiModelProperty(example = "technicalowner@wso2.com", value = "")
  public String getTechnicalOwnerEmail() {
    return technicalOwnerEmail;
  }

  public void setTechnicalOwnerEmail(String technicalOwnerEmail) {
    this.technicalOwnerEmail = technicalOwnerEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIBusinessInformation apIBusinessInformation = (APIBusinessInformation) o;
    return Objects.equals(this.businessOwner, apIBusinessInformation.businessOwner) &&
        Objects.equals(this.businessOwnerEmail, apIBusinessInformation.businessOwnerEmail) &&
        Objects.equals(this.technicalOwner, apIBusinessInformation.technicalOwner) &&
        Objects.equals(this.technicalOwnerEmail, apIBusinessInformation.technicalOwnerEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessOwner, businessOwnerEmail, technicalOwner, technicalOwnerEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIBusinessInformation {\n");
    
    sb.append("    businessOwner: ").append(toIndentedString(businessOwner)).append("\n");
    sb.append("    businessOwnerEmail: ").append(toIndentedString(businessOwnerEmail)).append("\n");
    sb.append("    technicalOwner: ").append(toIndentedString(technicalOwner)).append("\n");
    sb.append("    technicalOwnerEmail: ").append(toIndentedString(technicalOwnerEmail)).append("\n");
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

