package com.feasible.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.feasible.model.Employee;

public class EmployeeDao {

	public void SaveEmployee(Employee emp) 	{		
		Transaction trn =null;
		SessionFactory sf = new Configuration().configure("/com/feasible/util/Hibernate.cfg.xml").buildSessionFactory();
		Session p = sf.openSession();
		
		
		try {
			trn = p.beginTransaction();
			p.save(emp);
			trn.commit();
		}
		catch(HibernateException e){
			if (trn!=null) {
				trn.rollback();
			}
		}
	}

	public void UpdateEmployee(Employee emp) 	{		
		Transaction trn =null;
		SessionFactory sf = new Configuration().configure("/com/feasible/util/Hibernate.cfg.xml").buildSessionFactory();
		Session p = sf.openSession();
		
		try {
			trn = p.beginTransaction();
			p.saveOrUpdate(emp);
			trn.commit();
		}
		catch(HibernateException e){
			if (trn!=null) {
				trn.rollback();
			}
		}
	}
	public Employee GetEmployeeById(long Id) 	{		
		Transaction trn =null;
		Employee emp = null;
		SessionFactory sf = new Configuration().configure("/com/feasible/util/Hibernate.cfg.xml").buildSessionFactory();
		Session p = sf.openSession();
		
		try {
			trn = p.beginTransaction();
			p.load(Employee.class, Id);
			trn.commit();
		}
		catch(HibernateException e){
			if (trn!=null) {
				trn.rollback();
			}
		}
	return emp;
	}

	public List<Employee> GetAllEmployees() 	{		
		Transaction trn =null;
		List<Employee> emplist = null;
		SessionFactory sf = new Configuration().configure("/com/feasible/util/Hibernate.cfg.xml").buildSessionFactory();
		Session p = sf.openSession();
		
		try {
			trn = p.beginTransaction();
			emplist = p.createQuery("from Employee").list();
			trn.commit();
		}
		catch(HibernateException e){
			if (trn!=null) {
				trn.rollback();
			}
		}
	return emplist;
	}
	public void DeleteEmployee(Employee emp) 	{		
		Transaction trn =null;
		SessionFactory sf = new Configuration().configure("/com/feasible/util/Hibernate.cfg.xml").buildSessionFactory();
		Session p = sf.openSession();
		
		
		try {
			trn = p.beginTransaction();
			p.delete(emp);
			trn.commit();
		}
		catch(HibernateException e){
			if (trn!=null) {
				trn.rollback();
			}
		}
	}
	
}
