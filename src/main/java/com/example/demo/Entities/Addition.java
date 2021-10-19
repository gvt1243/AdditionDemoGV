package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Addition {

	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int num1 ;
	private int num2 ;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
