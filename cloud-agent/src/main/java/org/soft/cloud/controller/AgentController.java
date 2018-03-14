package org.soft.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Configuration
public class AgentController {

	private String AGENT_CALL = "http://cloud-police/call/1001";

	@Autowired
	RestTemplate restTemplate;


	@RequestMapping(value = "/agent", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String agent() {
		
		return restTemplate.getForObject(AGENT_CALL, String.class);
	}
}
