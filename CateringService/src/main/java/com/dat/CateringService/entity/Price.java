package com.dat.CateringService.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="price")
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int price_ID;
	
	@Column(name="total_price")
	private int total_price;
	
	@Column(name="DAT_price")
	private int DAT_price;
	
	@Column(name="staff_price")
	private int staff_price;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="delete_date")
	private Date delete_date;
	
	@Column(name="delete_by")
	private String delete_by;

	public Price() {
		super();
	}

	public Price(int price_ID, int total_price, int dAT_price, int staff_price) {
		super();
		this.price_ID = price_ID;
		this.total_price = total_price;
		DAT_price = dAT_price;
		this.staff_price = staff_price;
	}

	public Price(int price_ID, int total_price, int dAT_price, int staff_price, Date created_date, String created_by,
			Date delete_date, String delete_by) {
		super();
		this.price_ID = price_ID;
		this.total_price = total_price;
		DAT_price = dAT_price;
		this.staff_price = staff_price;
		this.created_date = created_date;
		this.created_by = created_by;
		this.delete_date = delete_date;
		this.delete_by = delete_by;
	}

	public int getPrice_ID() {
		return price_ID;
	}

	public void setPrice_ID(int price_ID) {
		this.price_ID = price_ID;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getDAT_price() {
		return DAT_price;
	}

	public void setDAT_price(int dAT_price) {
		DAT_price = dAT_price;
	}

	public int getStaff_price() {
		return staff_price;
	}

	public void setStaff_price(int staff_price) {
		this.staff_price = staff_price;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getDelete_date() {
		return delete_date;
	}

	public void setDelete_date(Date delete_date) {
		this.delete_date = delete_date;
	}

	public String getDelete_by() {
		return delete_by;
	}

	public void setDelete_by(String delete_by) {
		this.delete_by = delete_by;
	}
}
