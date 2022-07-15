package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Dp;

public interface DpService {
	public List<Dp> getDps();

	public void saveDp(Dp theDp);

	public Dp getDp(int theId);

	public void deleteDp(int theId);
}
