/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class CustomerAgreementApiController {

	@Autowired
	CustomerAgreementApiService service;
	
	@AgreeTerms.Evaluate
	public BianResponse<AgreementWithIdsAndEvaluationResult> evaluate(@RequestBody BianRequest<Agreement> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@AgreeTerms.Initiate
	public BianResponse<AgreementWithIds> initiate(@RequestBody BianRequest<Agreement> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@BQ("legal-terms")
	@AgreeTerms.Initiate
	public BianResponse<LegalTermsWithIds> initiateLegalTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<LegalTerms> bianRequest) {
		return BianResponse.forSuccess(service.initiateLegalTerms(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("policy-terms")
	@AgreeTerms.Initiate
	public BianResponse<PolicyTermsWithIds> initiatePolicyTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PolicyTerms> bianRequest) {
		return BianResponse.forSuccess(service.initiatePolicyTerms(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("regulatory-terms")
	@AgreeTerms.Initiate
	public BianResponse<RegulatoryTermsWithIds> initiateRegulatoryTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RegulatoryTerms> bianRequest) {
		return BianResponse.forSuccess(service.initiateRegulatoryTerms(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RequestPost
	public BianResponse<AgreementWithIds> requestPost(@RequestBody BianRequest<Agreement> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@AgreeTerms.RequestPut
	public BianResponse<AgreementWithIds> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Agreement> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<AgreementWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("legal-terms")
	@AgreeTerms.Retrieve
	public BianResponse<LegalTermsWithIds> retrieveLegalTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLegalTerms(crReferenceId, bqReferenceId));
	}
	
	@BQ("policy-terms")
	@AgreeTerms.Retrieve
	public BianResponse<PolicyTermsWithIds> retrievePolicyTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePolicyTerms(crReferenceId, bqReferenceId));
	}
	
	@BQ("regulatory-terms")
	@AgreeTerms.Retrieve
	public BianResponse<RegulatoryTermsWithIds> retrieveRegulatoryTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRegulatoryTerms(crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<AgreementWithIds> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Agreement> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
