package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RegulatoryTerms
 */
public class RegulatoryTerms   {
  private Object customerAgreementRegulatoryTermRecord = null;

  private String regulatoryAuthority = null;

  private String applicableRegulationReference = null;

  private String applicableRegulationInterpretation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerAgreementRegulatoryTermRecord
  **/

  public Object getCustomerAgreementRegulatoryTermRecord() {
    return customerAgreementRegulatoryTermRecord;
  }

  public void setCustomerAgreementRegulatoryTermRecord(Object customerAgreementRegulatoryTermRecord) {
    this.customerAgreementRegulatoryTermRecord = customerAgreementRegulatoryTermRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return regulatoryAuthority
  **/

  public String getRegulatoryAuthority() {
    return regulatoryAuthority;
  }

  public void setRegulatoryAuthority(String regulatoryAuthority) {
    this.regulatoryAuthority = regulatoryAuthority;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return applicableRegulationReference
  **/

  public String getApplicableRegulationReference() {
    return applicableRegulationReference;
  }

  public void setApplicableRegulationReference(String applicableRegulationReference) {
    this.applicableRegulationReference = applicableRegulationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return applicableRegulationInterpretation
  **/

  public String getApplicableRegulationInterpretation() {
    return applicableRegulationInterpretation;
  }

  public void setApplicableRegulationInterpretation(String applicableRegulationInterpretation) {
    this.applicableRegulationInterpretation = applicableRegulationInterpretation;
  }


}

