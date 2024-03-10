package com.jspiders.hibernatejpa.dao;

import lombok.Data;

@Data
public class StudentDAO {
	
	private int id;
	private String name;
	private String email;
	private long mobile;
	private int age;

}
