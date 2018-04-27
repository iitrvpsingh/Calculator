package com.example.calculator.entity;


public class ArithmeticEntity {

	private int operandA;

	private int operandB;

	private String operator;

	private int result;

	public ArithmeticEntity(int operendA, int operandB, int result, String operator) {
		super();
		this.operandA = operendA;
		this.operandB = operandB;
		this.result = result;
		this.operator = operator;
	}
	
	

	public ArithmeticEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getOperendA() {
		return operandA;
	}

	public void setOperendA(int operendA) {
		this.operandA = operendA;
	}

	public int getOperandB() {
		return operandB;
	}

	public void setOperandB(int operandB) {
		this.operandB = operandB;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
