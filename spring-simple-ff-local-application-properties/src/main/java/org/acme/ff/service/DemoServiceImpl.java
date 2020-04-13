package org.acme.ff.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.acme.ff.dto.InputDto;
import org.acme.ff.dto.OutputDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	private final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	public OutputDto process(@Valid @NotNull InputDto input) {

		logger.info( "<<< Impl 1 >>>" );

		OutputDto output = new OutputDto();
		output.setInput( input );
		output.setSum( input.getA().add( input.getB() ));
		output.setSubtraction( input.getA().subtract( input.getB() ) );

		
		return output;
	}
	
}
