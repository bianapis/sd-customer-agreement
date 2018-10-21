package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.DateTimePeriod;

import javax.validation.Valid;
  
/**
 * Agreement
 */
public class Agreement   {
  private String customerReference = null;

  private String legalEntityReference = null;

  private String agreementType = null;

  private String agreementJurisdiction = null;

  private DateTimePeriod agreementValidFromToDate = null;

  private String agreementSignaturiesResponsibleParties = null;

  private String documentReference = null;

  private String salesProductAgreementReference = null;

  private String partyLifecycleManagementReference = null;

  private String customerPrecedentsReference = null;

  private String customerAgreementRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return legalEntityReference
  **/

  public String getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(String legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return agreementType
  **/

  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return agreementJurisdiction
  **/

  public String getAgreementJurisdiction() {
    return agreementJurisdiction;
  }

  public void setAgreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
  }


  /**
   * Get agreementValidFromToDate
   * @return agreementValidFromToDate
  **/

  public DateTimePeriod getAgreementValidFromToDate() {
    return agreementValidFromToDate;
  }

  public void setAgreementValidFromToDate(DateTimePeriod agreementValidFromToDate) {
    this.agreementValidFromToDate = agreementValidFromToDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return agreementSignaturiesResponsibleParties
  **/

  public String getAgreementSignaturiesResponsibleParties() {
    return agreementSignaturiesResponsibleParties;
  }

  public void setAgreementSignaturiesResponsibleParties(String agreementSignaturiesResponsibleParties) {
    this.agreementSignaturiesResponsibleParties = agreementSignaturiesResponsibleParties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return salesProductAgreementReference
  **/

  public String getSalesProductAgreementReference() {
    return salesProductAgreementReference;
  }

  public void setSalesProductAgreementReference(String salesProductAgreementReference) {
    this.salesProductAgreementReference = salesProductAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return partyLifecycleManagementReference
  **/

  public String getPartyLifecycleManagementReference() {
    return partyLifecycleManagementReference;
  }

  public void setPartyLifecycleManagementReference(String partyLifecycleManagementReference) {
    this.partyLifecycleManagementReference = partyLifecycleManagementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerPrecedentsReference
  **/

  public String getCustomerPrecedentsReference() {
    return customerPrecedentsReference;
  }

  public void setCustomerPrecedentsReference(String customerPrecedentsReference) {
    this.customerPrecedentsReference = customerPrecedentsReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerAgreementRecord
  **/

  public String getCustomerAgreementRecord() {
    return customerAgreementRecord;
  }

  public void setCustomerAgreementRecord(String customerAgreementRecord) {
    this.customerAgreementRecord = customerAgreementRecord;
  }


}

