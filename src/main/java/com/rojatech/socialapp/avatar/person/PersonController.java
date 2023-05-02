package com.rojatech.socialapp.avatar.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2("Bobby", "Charles");
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getPersonV1parms() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getPersonV2parms() {
		return new PersonV2("Bobby", "Charles");
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getPersonV1headers() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getPersonV2headers() {
		return new PersonV2("Bobby", "Charles");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getPersonV1accept() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getPersonV2accept() {
		return new PersonV2("Bobby", "Charles");	}
}
