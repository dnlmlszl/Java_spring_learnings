package com.lmdlearning.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {
	
	// URI versioning
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Charlie Firpo");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Charlie", "Firpo"));
	}
	
	// Request Parameter versioning
	@GetMapping(path="/person", params="version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("Charlie Firpo");
	}
	
	@GetMapping(path="/person", params="version=2")
	public PersonV2 getSecondVersionOfPersonRequestParameter() {
		return new PersonV2(new Name("Charlie", "Firpo"));
	}
	
	// Request Headers versioning
	@GetMapping(path="/person/header", headers="X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonRequestHeader() {
		return new PersonV1("Charlie Firpo");
	}
	
	@GetMapping(path="/person/header", headers="X-API-VERSION=2")
	public PersonV2 getSecondVersionOfPersonRequestHeader() {
		return new PersonV2(new Name("Charlie", "Firpo"));
	}
	
	// Media Type Versioning
	@GetMapping(path="/person/accept", produces="application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeader() {
		return new PersonV1("Charlie Firpo");
	}
	
	@GetMapping(path="/person/accept", produces="application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionOfPersonAcceptHeader() {
		return new PersonV2(new Name("Charlie", "Firpo"));
	}

}
