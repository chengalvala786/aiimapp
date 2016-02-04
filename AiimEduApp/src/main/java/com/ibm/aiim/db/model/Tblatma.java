package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tblatma database table.
 * 
 */
@Entity
@Table(name="tblatma")
@NamedQuery(name="Tblatma.findAll", query="SELECT t FROM Tblatma t")
public class Tblatma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int srno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="atma_date")
	private Date atmaDate;

	@Column(name="atma_over_ptile")
	private String atmaOverPtile;

	@Column(name="atma_over_score")
	private String atmaOverScore;

	@Column(name="atma_reg")
	private String atmaReg;

	@Lob
	@Column(name="atma_scorecard")
	private byte[] atmaScorecard;

	private String atmasize;

	private String atmatype;

	private String email;

	public Tblatma() {
	}

	public int getSrno() {
		return this.srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public Date getAtmaDate() {
		return this.atmaDate;
	}

	public void setAtmaDate(Date atmaDate) {
		this.atmaDate = atmaDate;
	}

	public String getAtmaOverPtile() {
		return this.atmaOverPtile;
	}

	public void setAtmaOverPtile(String atmaOverPtile) {
		this.atmaOverPtile = atmaOverPtile;
	}

	public String getAtmaOverScore() {
		return this.atmaOverScore;
	}

	public void setAtmaOverScore(String atmaOverScore) {
		this.atmaOverScore = atmaOverScore;
	}

	public String getAtmaReg() {
		return this.atmaReg;
	}

	public void setAtmaReg(String atmaReg) {
		this.atmaReg = atmaReg;
	}

	public byte[] getAtmaScorecard() {
		return this.atmaScorecard;
	}

	public void setAtmaScorecard(byte[] atmaScorecard) {
		this.atmaScorecard = atmaScorecard;
	}

	public String getAtmasize() {
		return this.atmasize;
	}

	public void setAtmasize(String atmasize) {
		this.atmasize = atmasize;
	}

	public String getAtmatype() {
		return this.atmatype;
	}

	public void setAtmatype(String atmatype) {
		this.atmatype = atmatype;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}