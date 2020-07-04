package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Chezi;
import com.accp.service.service;

@Controller
@RequestMapping("/chezi")
public class dwcontroller {
	@Autowired
	service ser;
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/chushihua")
	@ResponseBody
	public List<Chezi> chushihua(){
		return ser.chushihua();
	}
}
