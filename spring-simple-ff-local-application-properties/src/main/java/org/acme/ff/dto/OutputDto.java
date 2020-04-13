package org.acme.ff.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class OutputDto {
	
	private InputDto input;

	private BigDecimal sum;

	private BigDecimal subtraction;

	public InputDto getInput() {
		return input;
	}

	public void setInput(InputDto input) {
		this.input = input;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public BigDecimal getSubtraction() {
		return subtraction;
	}

	public void setSubtraction(BigDecimal subtraction) {
		this.subtraction = subtraction;
	}
}
