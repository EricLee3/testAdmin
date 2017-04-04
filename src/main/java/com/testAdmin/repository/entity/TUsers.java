package com.testAdmin.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="users")
@Table(name="users")
@Data @Getter @Setter
@ToString
public class TUsers {
	@Id
	@SequenceGenerator(name="seq", sequenceName="users_no_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	long no;
	
	@Column(unique=true)
	@NotNull
	String ac;
	
	public void setAc(String ac)  {
		this.ac=ac.toLowerCase();
	}
	
	@Column
	@NotNull
	String pw;
	
	@Column
	@NotNull
	String role;
}