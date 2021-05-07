package com.te.springboot.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

import lombok.Data;

@Data
@Entity
@Table(name = "fitem")
@XmlRootElement(name = "fitem")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("fitem")
public class Fitem implements Serializable{
	@Id
	@Column
	private int id;
	@Column
	private String fname;
	@Column
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
