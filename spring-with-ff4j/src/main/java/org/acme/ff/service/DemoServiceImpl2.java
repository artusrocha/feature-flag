package org.acme.ff.service;

import org.acme.ff.dto.InputDto;
import org.acme.ff.dto.Output2Dto;
import org.acme.ff.dto.OutputDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Service
public class DemoServiceImpl2 implements DemoService {

	private final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl2.class);

	public OutputDto process(@Valid @NotNull InputDto input) {

		logger.info( "<<< Impl 2 >>>" );

		Output2Dto output = new Output2Dto();
		output.setInput( input );
		output.setSum( input.getA().add( input.getB() ) );
		output.setSubtraction( input.getA().subtract( input.getB() ) );
		output.setMultiplication( input.getA().multiply( input.getB() ) );

		if( input.getB() != BigDecimal.ZERO )
			output.setDivision( input.getA().divide( input.getB() ) );

		return output;
	}
	
}
