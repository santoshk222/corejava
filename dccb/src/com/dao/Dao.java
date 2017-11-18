package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;import java.util.concurrent.ExecutionException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.control.HibernateUtilities;
import com.model.SuperAdmin;

public class Dao {
	SessionFactory sessionFactory=HibernateUtilities.getsSessionFactory();
	Session session;
	
	public Dao(Session session) {
		super();
		this.session = session;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public Dao() {
		super();
	}
	public void savesa(SuperAdmin sa) {
		session=sessionFactory.openSession();
		try{
			session.beginTransaction();
			session.save(sa);
			session.getTransaction().commit();
		}catch(Exception e)
		{
			System.out.println("Error: "+e.getStackTrace());
		}finally {
			session.close();
		}
		
	}
	
	public SuperAdmin getSAlog(SuperAdmin sa) {
		session=sessionFactory.openSession();
		SuperAdmin sa2=new SuperAdmin(-1);
		try{
			session.beginTransaction();
			sa2=(SuperAdmin)session.createQuery("from SuperAdmin where email=:e ").setParameter("e", sa.getEmail()).uniqueResult();
			System.out.println("sa2: "+sa2.getSadmid());
			if(sa.getPassword().equals(sa2.getPassword())){
				return sa2;
			}else{
				sa2.setSadmid(-1);
				return sa2;
			}
		}catch(Exception exc){
			System.out.println("Error: "+exc.getMessage());
			return new SuperAdmin(-1);
			
		}finally {
			session.close();
		}
	}
	
	
	}
