package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Dp;

// 3. create dp dao interface

public interface DpDAO {

	public List<Dp> getDps();

	public void saveDp(Dp theDp);

	public Dp getDp(int theId);

	public void deleteDp(int theId);
}
