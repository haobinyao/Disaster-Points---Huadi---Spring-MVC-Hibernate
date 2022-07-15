package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.DpDAO;
import com.luv2code.springdemo.entity.Dp;

@Service
public class DpServiceImpl implements DpService {
	// need to inject dao
	@Autowired
	private DpDAO dpDAO;
	
	@Override
	public List<Dp> getDps() {
		return dpDAO.getDps();
	}

	@Override
	@Transactional
	public void saveDp(Dp theDp) {
		
		dpDAO.saveDp(theDp);
	}

	@Override
	@Transactional
	public Dp getDp(int theId) {
		
		return dpDAO.getDp(theId);
	}

	@Override
	@Transactional
	public void deleteDp(int theId) {
		
		dpDAO.deleteDp(theId);
	}
}
