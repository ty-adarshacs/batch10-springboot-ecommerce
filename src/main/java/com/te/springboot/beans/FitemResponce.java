package com.te.springboot.beans;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("response")
@JsonPropertyOrder({"status" , "msg"})
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FitemResponce implements Serializable{
	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;
	
	
	private String  msg;
	
	@JsonProperty("employee_info")
	@XmlElement(name = "employee-info")
	private Fitem bean;
	
	
	private List<Fitem> fitems;


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Fitem getBean() {
		return bean;
	}


	public void setBean(Fitem bean) {
		this.bean = bean;
	}


	public List<Fitem> getFitems() {
		return fitems;
	}


	public void setFitems(List<Fitem> fitems) {
		this.fitems = fitems;
	}

}
