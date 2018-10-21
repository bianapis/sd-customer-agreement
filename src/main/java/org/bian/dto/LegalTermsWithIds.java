package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * LegalTermsWithIds
 */
public class LegalTermsWithIds   {
  private String customerAgreementReference = null;

  private String customerAgreementLegalTermReference = null;

  private Object customerAgreementLegalTermRecord = null;

  private String jurisdiction = null;

  private String applicableLawReference = null;

  private String applicableLawInterpretation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerAgreementLegalTermReference
  **/

  public String getCustomerAgreementLegalTermReference() {
    return customerAgreementLegalTermReference;
  }

  public void setCustomerAgreementLegalTermReference(String customerAgreementLegalTermReference) {
    this.customerAgreementLegalTermReference = customerAgreementLegalTermReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerAgreementLegalTermRecord
  **/

  public Object getCustomerAgreementLegalTermRecord() {
    return customerAgreementLegalTermRecord;
  }

  public void setCustomerAgreementLegalTermRecord(Object customerAgreementLegalTermRecord) {
    this.customerAgreementLegalTermRecord = customerAgreementLegalTermRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return jurisdiction
  **/

  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return applicableLawReference
  **/

  public String getApplicableLawReference() {
    return applicableLawReference;
  }

  public void setApplicableLawReference(String applicableLawReference) {
    this.applicableLawReference = applicableLawReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return applicableLawInterpretation
  **/

  public String getApplicableLawInterpretation() {
    return applicableLawInterpretation;
  }

  public void setApplicableLawInterpretation(String applicableLawInterpretation) {
    this.applicableLawInterpretation = applicableLawInterpretation;
  }


}

