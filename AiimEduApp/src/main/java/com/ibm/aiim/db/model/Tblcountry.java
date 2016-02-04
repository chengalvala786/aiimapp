package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblcountries database table.
 * 
 */
@Entity
@Table(name="tblcountries")
@NamedQuery(name="Tblcountry.findAll", query="SELECT t FROM Tblcountry t")
public class Tblcountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String country;

	@Column(name="is_def")
	private String isDef;

	public Tblcountry() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIsDef() {
		return this.isDef;
	}

	public void setIsDef(String isDef) {
		this.isDef = isDef;
	}

}