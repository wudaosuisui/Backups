package com.fairyonline.example.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fairyonline.example.entity.Example;
import com.fairyonline.example.service.ExampleServiceImpl;

@Controller
@Repository
@RequestMapping("/example")/*更改成对应的名字*/
public class ExampleControllerImpl {
	@Resource
	private ExampleServiceImpl exampleServiceImple;
	
	@RequestMapping("/Add")
	public String Add() {
		System.out.println("get add");
		Example example = new Example();
		exampleServiceImple.Add(example);
		return "Xiaoye/AddVertes";
	}
}
