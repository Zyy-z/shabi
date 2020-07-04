package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CheziMapper;
import com.accp.domain.Chezi;

@Service
@Transactional

public class service {
	@Autowired
	CheziMapper mapper;
	public List<Chezi> chushihua(){
		return mapper.selectByExample(null);
	}
}
