package com.shop.beans;
// Generated 2016-10-6 15:56:43 by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sex generated by hbm2java
 */
@Entity
@Table(name = "sex", catalog = "shop")
public class Sex implements java.io.Serializable {

	private int sexid;
	private String sexType;
	private Set<User> users = new HashSet<User>(0);
	

	public Sex() {
	}

	public Sex(int sexid, String sexType) {
		this.sexid = sexid;
		this.sexType = sexType;
	}

	public Sex(int sexid, String sexType, Set<User> users) {
		this.sexid = sexid;
		this.sexType = sexType;
		this.users = users;
		
	}

	@Id

	@Column(name = "sexid", unique = true, nullable = false)
	public int getSexid() {
		return this.sexid;
	}

	public void setSexid(int sexid) {
		this.sexid = sexid;
	}

	@Column(name = "sexType", nullable = false, length = 4)
	public String getSexType() {
		return this.sexType;
	}

	public void setSexType(String sexType) {
		this.sexType = sexType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sex")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	
}
