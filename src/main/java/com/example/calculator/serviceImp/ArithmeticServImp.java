package com.example.calculator.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.calculator.dao.ArithmeticDAO;
import com.example.calculator.entity.ArithmeticEntity;
import com.example.calculator.service.ArithmeticServ;

@Service
public class ArithmeticServImp implements ArithmeticServ {

	@Autowired
	private ArithmeticDAO arithmeticDao;

	@Override
	public String basicArithmeticOperation(Integer op1, Integer op2, String operator) {
		int result = 0;
		ArithmeticEntity arithmeticEntity = null;
		switch (operator) {

		case "sum":
			result = op1 + op2;
			arithmeticEntity = new ArithmeticEntity(op1, op2, result, operator);
			arithmeticDao.addArithmetic(arithmeticEntity);
			return "Addition of " + op1 + " and" + op2 + " = " + result;

		case "sub":
			result = op1 - op2;
			arithmeticEntity = new ArithmeticEntity(op1, op2, result, operator);
			arithmeticDao.addArithmetic(arithmeticEntity);
			return "Subtraction of " + op1 + " and" + op2 + " = " + result;

		case "mul":
			result = op1 * op2;
			arithmeticEntity = new ArithmeticEntity(op1, op2, result, operator);
			arithmeticDao.addArithmetic(arithmeticEntity);
			return "Multiply of " + op1 + " and" + op2 + " = " + result;

		case "div":
			if (op2 == 0) {
				return "can't divide by Zero";
			}
			result = op1 / op2;
			arithmeticEntity = new ArithmeticEntity(op1, op2, result, operator);
			arithmeticDao.addArithmetic(arithmeticEntity);
			return "Division of " + op1 + " and" + op2 + " = " + result;

		}
		throw new RuntimeException("Invalid operator..");

	}

	@Override
	public List<ArithmeticEntity> getAllOperation() {
		return arithmeticDao.getAllOperation();
	}

}
