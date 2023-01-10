package com.ksolves.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mvcuser")
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "mobile_no")
	private Long mobileNo;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity = Address.class)
	@JoinColumn(name="address_id",referencedColumnName="id")
	private Address address;
	}
