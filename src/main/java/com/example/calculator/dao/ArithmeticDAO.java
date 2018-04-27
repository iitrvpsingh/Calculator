package com.example.calculator.dao;

import java.util.List;

import com.example.calculator.entity.ArithmeticEntity;

public interface ArithmeticDAO {

	void addArithmetic(ArithmeticEntity arithmeticEntity);

	List<ArithmeticEntity> getAllOperation();

}
