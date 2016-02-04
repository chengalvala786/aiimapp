package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tblcmat database table.
 * 
 */
@Entity
@Table(name="tblcmat")
@NamedQuery(name="Tblcmat.findAll", query="SELECT t FROM Tblcmat t")
public class Tblcmat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int srno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cmat_date")
	private Date cmatDate;

	@Column(name="cmat_over_ptile")
	private String cmatOverPtile;

	@Column(name="cmat_over_score")
	private String cmatOverScore;

	@Column(name="cmat_reg")
	private String cmatReg;

	@Lob
	@Column(name="cmat_scorecard")
	private byte[] cmatScorecard;

	private String cmatsize;

	private String cmattype;

	private String email;

	public Tblcmat() {
	}

	public int getSrno() {
		return this.srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public Date getCmatDate() {
		return this.cmatDate;
	}

	public void setCmatDate(Date cmatDate) {
		this.cmatDate = cmatDate;
	}

	public String getCmatOverPtile() {
		return this.cmatOverPtile;
	}

	public void setCmatOverPtile(String cmatOverPtile) {
		this.cmatOverPtile = cmatOverPtile;
	}

	public String getCmatOverScore() {
		return this.cmatOverScore;
	}

	public void setCmatOverScore(String cmatOverScore) {
		this.cmatOverScore = cmatOverScore;
	}

	public String getCmatReg() {
		return this.cmatReg;
	}

	public void setCmatReg(String cmatReg) {
		this.cmatReg = cmatReg;
	}

	public byte[] getCmatScorecard() {
		return this.cmatScorecard;
	}

	public void setCmatScorecard(byte[] cmatScorecard) {
		this.cmatScorecard = cmatScorecard;
	}

	public String getCmatsize() {
		return this.cmatsize;
	}

	public void setCmatsize(String cmatsize) {
		this.cmatsize = cmatsize;
	}

	public String getCmattype() {
		return this.cmattype;
	}

	public void setCmattype(String cmattype) {
		this.cmattype = cmattype;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}