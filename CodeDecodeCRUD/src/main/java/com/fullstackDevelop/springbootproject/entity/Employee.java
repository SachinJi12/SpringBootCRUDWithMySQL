package com.fullstackDevelop.springbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp")

// these will auto inject getter/setter for all the fields from lombok
@Getter
@Setter
public class Employee {
	
	// set the id s Id and put in auto generated 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;

}
