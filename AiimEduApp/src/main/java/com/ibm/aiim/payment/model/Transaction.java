package com.ibm.aiim.payment.model;

import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")

public class Transaction {
	
	private String mmp_txn;
	private String mer_txn;
	private String amt ;
	private String prod;
	private Date date;
	private String bank_txn;
	private String f_code;
	private String udf2; 
	
	public String getUdf2() {
		return udf2;
	}
	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}
	public String getMmp_txn() {
		return mmp_txn;
	}
	public void setMmp_txn(String mmp_txn) {
		this.mmp_txn = mmp_txn;
	}
	public String getMer_txn() {
		return mer_txn;
	}
	public void setMer_txn(String mer_txn) {
		this.mer_txn = mer_txn;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBank_txn() {
		return bank_txn;
	}
	public void setBank_txn(String bank_txn) {
		this.bank_txn = bank_txn;
	}
	public String getF_code() {
		return f_code;
	}
	public void setF_code(String f_code) {
		this.f_code = f_code;
	}
	

}
