package org.acme.ff.api;

import java.math.BigDecimal;

import org.acme.ff.dto.InputDto;
import org.acme.ff.dto.OutputDto;
import org.acme.ff.service.DemoService;
import org.acme.ff.service.DemoServiceImpl;
import org.acme.ff.service.DemoServiceImpl2;
import org.ff4j.FF4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureFlagsDemoWebApi {
	
    private final static Logger logger = LoggerFactory.getLogger(FeatureFlagsDemoWebApi.class);

	@Autowired
	private DemoServiceImpl service;

	@Autowired
	private DemoServiceImpl2 service2;

	@Autowired
	private FF4j ff4j;

	private DemoService getService() {
		return ff4j.check("impl2enabled") ? service2 : service;
	}

	@GetMapping("{a}/{b}")
	public ResponseEntity<OutputDto> getResource(@PathVariable("a") BigDecimal a,
												 @PathVariable("b") BigDecimal b ) {
		InputDto input = new InputDto(a, b);
		return ResponseEntity.ok(getService().process(input));
	}

}
