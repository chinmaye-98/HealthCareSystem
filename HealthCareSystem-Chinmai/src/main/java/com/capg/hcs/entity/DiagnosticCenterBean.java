package com.capg.hcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HealthCare_Spring")

public class DiagnosticCenterBean {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int center_id;
	
	private String center_name;
	
	private String center_location;
	
	
	  private String test_1;
	  private String test;
		 private String test_3;
	  public String getTest_1() {
		return test_1;
	}

	public void setTest_1(String test_1) {
		this.test_1 = test_1;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getTest_3() {
		return test_3;
	}

	public void setTest_3(String test_3) {
		this.test_3 = test_3;
	}


	 
	public int getCenter_id() {
		return center_id;
	}

	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}

	public String getCenter_name() {
		return center_name;
	}

	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	
	public String getCenter_location() {
		return center_location;
	}

	public void setCenter_location(String center_location) {
		this.center_location = center_location;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
