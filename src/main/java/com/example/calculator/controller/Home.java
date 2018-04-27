package com.example.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.calculator.entity.ArithmeticEntity;
import com.example.calculator.service.ArithmeticServ;

@Controller
public class Home {

	@Autowired
	private ArithmeticServ arithmeticServ;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public String test(@RequestParam(value = "op1") Integer op1, @RequestParam(value = "op2") Integer op2,
			@RequestParam(value = "operator") String operator) {

		if (null != op1 && null != op2 && null != operator) {
			return arithmeticServ.basicArithmeticOperation(op1, op2, operator);
		}
		throw new RuntimeException("Api Error");

	}

	@RequestMapping(value = "/allOperation", method = RequestMethod.GET)
	@ResponseBody
	public List<ArithmeticEntity> allOperation() {
		return arithmeticServ.getAllOperation();
	}
}
