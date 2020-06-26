package com.google.proj.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "leader")
public class TeamLeader implements Serializable
{
	@Id
	@GenericGenerator(name = "l_auto", strategy = "increment")
	@GeneratedValue(generator = "l_auto")
	@Column(name = "l_id")
	private int id;
	
	@Column(name = "l_name")
	private String name;
	
	@Column(name = "l_age")
	private int age;
	
	public TeamLeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TeamLeader [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
