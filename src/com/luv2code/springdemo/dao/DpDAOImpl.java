package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Dp;

@Repository
public class DpDAOImpl implements DpDAO {
	// 4. realize getDps function

	// need to inject the session factory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Dp> getDps() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query && sort by hazard level
		Query<Dp> theQuery = currentSession.createQuery("from Dp order by type", Dp.class);
		
		// execute query and get result list
		List<Dp> customers = theQuery.getResultList();
		
		// return results
		return customers;
	}

	@Override
	public void saveDp(Dp theDp) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save the dp
		// ** save if new, update if existing
		currentSession.saveOrUpdate(theDp);
	}

	@Override
	public Dp getDp(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// retrieve and read from database using the primary key (id)
		Dp theDp = currentSession.get(Dp.class, theId);
		
		return theDp;
	}

	@Override
	public void deleteDp(int theId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Dp where id=:dpId");
		theQuery.setParameter("dpId", theId);
		
		theQuery.executeUpdate();
	}

}
