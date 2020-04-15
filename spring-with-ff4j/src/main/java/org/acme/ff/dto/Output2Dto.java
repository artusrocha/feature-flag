package org.acme.ff.dto;

import java.math.BigDecimal;

public class Output2Dto extends OutputDto {

	private BigDecimal multiplication;

	private BigDecimal division;


	public BigDecimal getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(BigDecimal multiplication) {
		this.multiplication = multiplication;
	}

	public BigDecimal getDivision() {
		return division;
	}

	public void setDivision(BigDecimal division) {
		this.division = division;
	}
}
