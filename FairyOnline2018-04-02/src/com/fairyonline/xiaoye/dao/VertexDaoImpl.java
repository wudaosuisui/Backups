package com.fairyonline.xiaoye.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.fairyonline.xiaoye.entity.Vertex;

@Repository
public class VertexDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	/*save*/
	public void save(Vertex vertex) {
		Session session = sessionFactory.getCurrentSession();//获取sessio
		Transaction tra = session.beginTransaction();//开启事务
		session.save(vertex);
		session.flush();
		tra.commit();
	}
	/*get*/
	
	/*get List*/
	public List<Vertex> getList(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from Vertex");
		return q.list();
	}
}







