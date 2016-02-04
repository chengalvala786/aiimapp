package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tblcat database table.
 * 
 */
@Entity
@Table(name="tblcat")
@NamedQuery(name="Tblcat.findAll", query="SELECT t FROM Tblcat t")
public class Tblcat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int srno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cat_date")
	private Date catDate;

	@Column(name="cat_over_ptile")
	private String catOverPtile;

	@Column(name="cat_over_score")
	private String catOverScore;

	@Column(name="cat_reg")
	private String catReg;

	@Lob
	@Column(name="cat_scorecard")
	private byte[] catScorecard;

	private String catsize;

	private String cattype;

	private String email;

	public Tblcat() {
	}

	public int getSrno() {
		return this.srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public Date getCatDate() {
		return this.catDate;
	}

	public void setCatDate(Date catDate) {
		this.catDate = catDate;
	}

	public String getCatOverPtile() {
		return this.catOverPtile;
	}

	public void setCatOverPtile(String catOverPtile) {
		this.catOverPtile = catOverPtile;
	}

	public String getCatOverScore() {
		return this.catOverScore;
	}

	public void setCatOverScore(String catOverScore) {
		this.catOverScore = catOverScore;
	}

	public String getCatReg() {
		return this.catReg;
	}

	public void setCatReg(String catReg) {
		this.catReg = catReg;
	}

	public byte[] getCatScorecard() {
		return this.catScorecard;
	}

	public void setCatScorecard(byte[] catScorecard) {
		this.catScorecard = catScorecard;
	}

	public String getCatsize() {
		return this.catsize;
	}

	public void setCatsize(String catsize) {
		this.catsize = catsize;
	}

	public String getCattype() {
		return this.cattype;
	}

	public void setCattype(String cattype) {
		this.cattype = cattype;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}