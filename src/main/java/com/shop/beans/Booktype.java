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
 * Booktype generated by hbm2java
 */
@Entity
@Table(name = "booktype", catalog = "shop")
public class Booktype implements java.io.Serializable {

	private int typeId;
	private String typeName;
	private Set<Book> books = new HashSet<Book>(0);
	
	public Booktype() {
	}

	public Booktype(int typeId, String typeName) {
		this.typeId = typeId;
		this.typeName = typeName;
	}

	public Booktype(int typeId, String typeName, Set<Book> books) {
		this.typeId = typeId;
		this.typeName = typeName;
		this.books = books;
		
	}

	@Id

	@Column(name = "typeId", unique = true, nullable = false)
	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Column(name = "typeName", nullable = false, length = 16)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "booktype")
	public Set<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	

}
