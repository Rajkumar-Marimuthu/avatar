package com.rojatech.socialapp.avatar.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public Message filtering() {
		return new Message("value1", "value2", "value3");
	}
	
	@GetMapping("/filtering-list")
	public List<Message> filteringList() {
		return Arrays.asList(new Message("value1", "value2", "value3"),
				new Message("value4", "value5", "value6"));
	}
}
