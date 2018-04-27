package com.example.calculator.service;import java.util.List;

import com.example.calculator.entity.ArithmeticEntity;

public interface ArithmeticServ {
	String basicArithmeticOperation(Integer op1, Integer op2, String operator);
	
	List<ArithmeticEntity> getAllOperation();
}
