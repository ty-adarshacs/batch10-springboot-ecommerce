package com.te.springboot.service;

import java.util.List;

import org.apache.tomcat.util.http.fileupload.FileItem;

import com.te.springboot.beans.Fitem;

public interface ItemService {
	public Fitem getItemData(Integer id);
   public boolean additem(FileItem infoBean);
//	
//	public boolean updateitem(Fitem info);
//	
	public boolean deleteitem(Integer id);
	
	public List<Fitem> getAllDetails();  

}
