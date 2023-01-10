package com.ksolves.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "house_no")
	private String houseNo;
	
	@Column(name = "street_no")
	private String streetNo;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "locality")
	private String locality;
	
	@Column(name = "pincode")
	private Integer pincode;
}
