package com.shop.beans;
// Generated 2016-10-6 15:56:43 by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Recommended generated by hbm2java
 */
@Entity
@Table(name = "recommended", catalog = "shop")
public class Recommended implements java.io.Serializable {

	private Integer recommendedId;
	private Book book;

	public Recommended() {
	}

	public Recommended(Book book) {
		this.book = book;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "recommendedId", unique = true, nullable = false)
	public Integer getRecommendedId() {
		return this.recommendedId;
	}

	public void setRecommendedId(Integer recommendedId) {
		this.recommendedId = recommendedId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookId", nullable = false)
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
