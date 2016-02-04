package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tblgmat database table.
 * 
 */
@Entity
@Table(name="tblgmat")
@NamedQuery(name="Tblgmat.findAll", query="SELECT t FROM Tblgmat t")
public class Tblgmat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int srno;

	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gmat_date")
	private Date gmatDate;

	@Column(name="gmat_over_ptile")
	private String gmatOverPtile;

	@Column(name="gmat_over_score")
	private String gmatOverScore;

	@Column(name="gmat_reg")
	private String gmatReg;

	@Lob
	@Column(name="gmat_scorecard")
	private byte[] gmatScorecard;

	private String gmatsize;

	private String gmattype;

	public Tblgmat() {
	}

	public int getSrno() {
		return this.srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getGmatDate() {
		return this.gmatDate;
	}

	public void setGmatDate(Date gmatDate) {
		this.gmatDate = gmatDate;
	}

	public String getGmatOverPtile() {
		return this.gmatOverPtile;
	}

	public void setGmatOverPtile(String gmatOverPtile) {
		this.gmatOverPtile = gmatOverPtile;
	}

	public String getGmatOverScore() {
		return this.gmatOverScore;
	}

	public void setGmatOverScore(String gmatOverScore) {
		this.gmatOverScore = gmatOverScore;
	}

	public String getGmatReg() {
		return this.gmatReg;
	}

	public void setGmatReg(String gmatReg) {
		this.gmatReg = gmatReg;
	}

	public byte[] getGmatScorecard() {
		return this.gmatScorecard;
	}

	public void setGmatScorecard(byte[] gmatScorecard) {
		this.gmatScorecard = gmatScorecard;
	}

	public String getGmatsize() {
		return this.gmatsize;
	}

	public void setGmatsize(String gmatsize) {
		this.gmatsize = gmatsize;
	}

	public String getGmattype() {
		return this.gmattype;
	}

	public void setGmattype(String gmattype) {
		this.gmattype = gmattype;
	}

}