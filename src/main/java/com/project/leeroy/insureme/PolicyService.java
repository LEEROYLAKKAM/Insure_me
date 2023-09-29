package com.project.leeroy.insureme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyRepository;


	public Policy CreatePolicy() {

		Policy policy = generateDummyPolicy();

		return policyRepository.save(policy);


	}

	public Policy updatePolicy() {

		return null;
	}

	public Policy deletePolicy() {

		return null;
	}

	public Policy searchPolicy() {

		return null;
	}


	public Policy generateDummyPolicy() {
		return new Policy(1, "Leeroy", "Individual", 10000, "14-Mar-2023", "14-Mar-2024");
	}

	public Policy registerPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepository.save(policy);
	}

	public Policy getPolicyDetails(int policyId) {
		// TODO Auto-generated method stub
		return policyRepository.findById(policyId).get();
	}

}