package org.acme.ff.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class InputDto {

	@NotNull(message = "Mandatory parameter. Can't be null")
	private BigDecimal a;

	@NotNull(message = "Mandatory parameter. Can't be null")
	private BigDecimal b;

	public InputDto(BigDecimal a, BigDecimal b) {
		this.a = a;
		this.b = b;
	}

	public BigDecimal getA() {
		return a;
	}

	public void setA(BigDecimal a) {
		this.a = a;
	}

	public BigDecimal getB() {
		return b;
	}

	public void setB(BigDecimal b) {
		this.b = b;
	}
}
