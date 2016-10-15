package com.shop.beans;
// Generated 2016-10-6 15:56:43 by Hibernate Tools 5.2.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", catalog = "shop")
public class Orders implements java.io.Serializable {

	private int ordersId;
	private User user;
	private String orderNumber;
	private Date ordersTime;
	private char isDeal;
	private Set<Ordersbook> ordersbooks = new HashSet<Ordersbook>(0);
	

	public Orders() {
	}

	public Orders(int ordersId, User user, String orderNumber, Date ordersTime, char isDeal) {
		this.ordersId = ordersId;
		this.user = user;
		this.orderNumber = orderNumber;
		this.ordersTime = ordersTime;
		this.isDeal = isDeal;
	}

	public Orders(int ordersId, User user, String orderNumber, Date ordersTime, char isDeal,
			Set<Ordersbook> ordersbooks, Set<Ordersbook> ordersbooks_1) {
		this.ordersId = ordersId;
		this.user = user;
		this.orderNumber = orderNumber;
		this.ordersTime = ordersTime;
		this.isDeal = isDeal;
		this.ordersbooks = ordersbooks;
		
	}

	@Id

	@Column(name = "ordersId", unique = true, nullable = false)
	public int getOrdersId() {
		return this.ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "orderNumber", nullable = false, length = 21)
	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ordersTime", nullable = false, length = 19)
	public Date getOrdersTime() {
		return this.ordersTime;
	}

	public void setOrdersTime(Date ordersTime) {
		this.ordersTime = ordersTime;
	}

	@Column(name = "isDeal", nullable = false, length = 1)
	public char getIsDeal() {
		return this.isDeal;
	}

	public void setIsDeal(char isDeal) {
		this.isDeal = isDeal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<Ordersbook> getOrdersbooks() {
		return this.ordersbooks;
	}

	public void setOrdersbooks(Set<Ordersbook> ordersbooks) {
		this.ordersbooks = ordersbooks;
	}

	

}
