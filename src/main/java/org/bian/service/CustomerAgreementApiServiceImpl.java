/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerAgreementApiServiceImpl implements CustomerAgreementApiService {

	public AgreementWithIdsAndEvaluationResult evaluate(Agreement request){
		return JsonReader.read("evaluate-AgreementWithIdsAndEvaluationResult.json",new TypeReference<AgreementWithIdsAndEvaluationResult>(){});
	}
	
	public AgreementWithIds initiate(Agreement request){
		return JsonReader.read("initiate-AgreementWithIds.json",new TypeReference<AgreementWithIds>(){});
	}
	
	public LegalTermsWithIds initiateLegalTerms(String crReferenceId, LegalTerms request){
		return JsonReader.read("initiate-LegalTermsWithIds.json",new TypeReference<LegalTermsWithIds>(){});
	}
	
	public PolicyTermsWithIds initiatePolicyTerms(String crReferenceId, PolicyTerms request){
		return JsonReader.read("initiate-PolicyTermsWithIds.json",new TypeReference<PolicyTermsWithIds>(){});
	}
	
	public RegulatoryTermsWithIds initiateRegulatoryTerms(String crReferenceId, RegulatoryTerms request){
		return JsonReader.read("initiate-RegulatoryTermsWithIds.json",new TypeReference<RegulatoryTermsWithIds>(){});
	}
	
	public AgreementWithIds requestPost(Agreement request){
		return JsonReader.read("requestPost-AgreementWithIds.json",new TypeReference<AgreementWithIds>(){});
	}
	
	public AgreementWithIds requestPut(String crReferenceId, Agreement request){
		return JsonReader.read("requestPut-AgreementWithIds.json",new TypeReference<AgreementWithIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public AgreementWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-AgreementWithIds.json",new TypeReference<AgreementWithIds>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public LegalTermsWithIds retrieveLegalTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-LegalTermsWithIds.json",new TypeReference<LegalTermsWithIds>(){});
	}
	
	public PolicyTermsWithIds retrievePolicyTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PolicyTermsWithIds.json",new TypeReference<PolicyTermsWithIds>(){});
	}
	
	public RegulatoryTermsWithIds retrieveRegulatoryTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RegulatoryTermsWithIds.json",new TypeReference<RegulatoryTermsWithIds>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public AgreementWithIds update(String crReferenceId, Agreement request){
		return JsonReader.read("update-AgreementWithIds.json",new TypeReference<AgreementWithIds>(){});
	}
	
}
