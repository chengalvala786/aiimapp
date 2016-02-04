package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbldegree database table.
 * 
 */
@Entity
@Table(name="tbldegree")
@NamedQuery(name="Tbldegree.findAll", query="SELECT t FROM Tbldegree t")
public class Tbldegree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="deg_id")
	private int degId;

	@Column(name="deg_desc")
	private String degDesc;

	@Column(name="deg_name")
	private String degName;

	public Tbldegree() {
	}

	public int getDegId() {
		return this.degId;
	}

	public void setDegId(int degId) {
		this.degId = degId;
	}

	public String getDegDesc() {
		return this.degDesc;
	}

	public void setDegDesc(String degDesc) {
		this.degDesc = degDesc;
	}

	public String getDegName() {
		return this.degName;
	}

	public void setDegName(String degName) {
		this.degName = degName;
	}

}