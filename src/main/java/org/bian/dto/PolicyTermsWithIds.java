package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PolicyTermsWithIds
 */
public class PolicyTermsWithIds   {
  private String customerAgreementReference = null;

  private String customerAgreementPolicyTermReference = null;

  private Object customerAgreementPolicyTermRecord = null;

  private String bankPolicyGuidelineType = null;

  private String applicableBankPolicyRuleReference = null;

  private String applicableBankPolicyRuleInterpretation = null;


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
   * @return customerAgreementPolicyTermReference
  **/

  public String getCustomerAgreementPolicyTermReference() {
    return customerAgreementPolicyTermReference;
  }

  public void setCustomerAgreementPolicyTermReference(String customerAgreementPolicyTermReference) {
    this.customerAgreementPolicyTermReference = customerAgreementPolicyTermReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerAgreementPolicyTermRecord
  **/

  public Object getCustomerAgreementPolicyTermRecord() {
    return customerAgreementPolicyTermRecord;
  }

  public void setCustomerAgreementPolicyTermRecord(Object customerAgreementPolicyTermRecord) {
    this.customerAgreementPolicyTermRecord = customerAgreementPolicyTermRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return bankPolicyGuidelineType
  **/

  public String getBankPolicyGuidelineType() {
    return bankPolicyGuidelineType;
  }

  public void setBankPolicyGuidelineType(String bankPolicyGuidelineType) {
    this.bankPolicyGuidelineType = bankPolicyGuidelineType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return applicableBankPolicyRuleReference
  **/

  public String getApplicableBankPolicyRuleReference() {
    return applicableBankPolicyRuleReference;
  }

  public void setApplicableBankPolicyRuleReference(String applicableBankPolicyRuleReference) {
    this.applicableBankPolicyRuleReference = applicableBankPolicyRuleReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return applicableBankPolicyRuleInterpretation
  **/

  public String getApplicableBankPolicyRuleInterpretation() {
    return applicableBankPolicyRuleInterpretation;
  }

  public void setApplicableBankPolicyRuleInterpretation(String applicableBankPolicyRuleInterpretation) {
    this.applicableBankPolicyRuleInterpretation = applicableBankPolicyRuleInterpretation;
  }


}

