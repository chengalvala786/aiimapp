package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tblusers database table.
 * 
 */
@Entity
@Table(name="tblusers")
public class Tbluser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String activationkey;

	@Column(name="cycle_year")
	private String cycleYear;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(name="del_record")
	private String delRecord;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_created")
	private Date dtCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_updated")
	private Date dtUpdated;

	private String email;

	@Column(name="first_name")
	private String firstName;

	private String ipaddr;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="mobile_no")
	private String mobileNo;
	@Column(name="app_rw_id")
	private String app_rw_id;
	


	private String passwd;

	private String regno;

	private String sex;

	private String status;

	public Tbluser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivationkey() {
		return this.activationkey;
	}

	public void setActivationkey(String activationkey) {
		this.activationkey = activationkey;
	}

	public String getCycleYear() {
		return this.cycleYear;
	}

	public void setCycleYear(String cycleYear) {
		this.cycleYear = cycleYear;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public String getApp_rw_id() {
		return app_rw_id;
	}

	public void setApp_rw_id(String app_rw_id) {
		this.app_rw_id = app_rw_id;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDelRecord() {
		return this.delRecord;
	}

	public void setDelRecord(String delRecord) {
		this.delRecord = delRecord;
	}

	public Date getDtCreated() {
		return this.dtCreated;
	}

	public void setDtCreated(Date dtCreated) {
		this.dtCreated = dtCreated;
	}

	public Date getDtUpdated() {
		return this.dtUpdated;
	}

	public void setDtUpdated(Date dtUpdated) {
		this.dtUpdated = dtUpdated;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIpaddr() {
		return this.ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getRegno() {
		return this.regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}