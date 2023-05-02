package com.rojatech.socialapp.avatar.greeting;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private MessageSource messsageSource;
	
	public GreetingController(MessageSource messsageSource) {
		this.messsageSource = messsageSource;
	}

	@GetMapping("/greet")
	public String greet() {
		return "Welcome";
	}
	
	@GetMapping("/greet-int")
	public String greetInt() {
		Locale locale = LocaleContextHolder.getLocale();
		return messsageSource.getMessage("good.morning.message", null, "Default Message", locale);
	}
}
