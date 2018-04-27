package com.example.calculator.OperatorTypeEnum;

public enum OperatorType {
	SUM("sum"), SUBTRACT("sub"), MULTIPLY("mul"), DIVISION("div");

	private String value;

	OperatorType(String val) {
		this.value = val;
	}

	public String getValue() {
		return value;
	}

}
