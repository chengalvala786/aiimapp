package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblstate database table.
 * 
 */
@Entity
@Table(name="tblstate")
@NamedQuery(name="Tblstate.findAll", query="SELECT t FROM Tblstate t")
public class Tblstate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="State")
	private String state;

	public Tblstate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}