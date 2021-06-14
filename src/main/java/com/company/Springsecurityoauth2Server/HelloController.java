package com.company.Springsecurityoauth2Server;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest/hello")
public class HelloController {

	 @GetMapping("/principal")
	    public Principal user(Principal principal) {
	        return principal;
	    }
	 
	 @GetMapping
	    public String hello() {
	        return "Hello World";
	    }
}
