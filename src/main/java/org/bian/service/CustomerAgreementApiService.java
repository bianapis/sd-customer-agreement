/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerAgreementApiService {

	AgreementWithIdsAndEvaluationResult evaluate(Agreement request);
	
	AgreementWithIds initiate(Agreement request);
	
	LegalTermsWithIds initiateLegalTerms(String crReferenceId, LegalTerms request);
	
	PolicyTermsWithIds initiatePolicyTerms(String crReferenceId, PolicyTerms request);
	
	RegulatoryTermsWithIds initiateRegulatoryTerms(String crReferenceId, RegulatoryTerms request);
	
	AgreementWithIds requestPost(Agreement request);
	
	AgreementWithIds requestPut(String crReferenceId, Agreement request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	AgreementWithIds retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	LegalTermsWithIds retrieveLegalTerms(String crReferenceId, String bqReferenceId);
	
	PolicyTermsWithIds retrievePolicyTerms(String crReferenceId, String bqReferenceId);
	
	RegulatoryTermsWithIds retrieveRegulatoryTerms(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	AgreementWithIds update(String crReferenceId, Agreement request);
	
}
