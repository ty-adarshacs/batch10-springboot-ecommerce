package com.te.springboot.service;

import java.util.List;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.beans.Fitem;
import com.te.springboot.dao.ItemDao;

@Service
public class ItemServiceImp implements ItemService{

    @Autowired
    ItemDao dao;
	public Fitem getItemData(Integer id) {
		
		return dao.getItemData(id);
	}
	@Override
	public boolean additem(FileItem infoBean) {
		// TODO Auto-generated method stub
		return dao.additem(infoBean);
	}
//	@Override
//	public boolean updateitem(Fitem info) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
	public boolean deleteitem(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteitem(id);
	}
	@Override
	public List<Fitem> getAllDetails() {
		// TODO Auto-generated method stub
		return dao.getAllDetails();
	}
	
	

}
