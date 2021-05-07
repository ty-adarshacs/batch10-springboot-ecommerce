package com.te.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.springframework.stereotype.Repository;

import com.te.springboot.beans.Fitem;

@Repository
public class ItemDaoImp implements ItemDao{

	@Override
	public Fitem getItemData(Integer id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
		EntityManager manager = factory.createEntityManager();
		Fitem bean = manager.find(Fitem.class, id);
		return bean;
	}

	@Override
	@Override
	public boolean additem(Fitem itrmeInfon) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(Fitem.class);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

//	@Override
//	public boolean updateitem(Fitem info) {
////		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
//			EntityManager manager = factory.createEntityManager();
//			EntityTransaction transaction = manager.getTransaction();
//			transaction.begin();
//			Fitem tem = manager.find(Fitem.class, infoBean.getEmpId());
//
//			
//			transaction.commit();
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean deleteitem(Integer id) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Fitem infoBean = manager.find(Fitem .class, id);
			manager.remove(infoBean);
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();

			
		}
		return true;
	}

	@Override
	public List<Fitem> getAllDetails() {
		List<Fitem> fitem = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();

			Query query =  manager.createQuery("from Fitem");

			fitem  =  query.getResultList();

		} catch (Exception e) {
			fitem  = null;
			e.printStackTrace();
		}

		return fitem ;
	}

	@Override
	public boolean additem(FileItem infoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	

}
