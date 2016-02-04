package com.ibm.aiim.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbltemp database table.
 * 
 */
@Entity
@Table(name="tbltemp")
public class Tbltemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int id;

	@Column(name="add_info")
	private String addInfo;

	@Column(name="addr_emp_1")
	private String addrEmp1;

	@Column(name="addr_emp_2")
	private String addrEmp2;

	@Column(name="addr_emp_3")
	private String addrEmp3;

	@Column(name="bach_college1")
	private String bachCollege1;

	@Column(name="bach_college2")
	private String bachCollege2;

	@Column(name="bach_college3")
	private String bachCollege3;

	@Column(name="bach_deg1")
	private String bachDeg1;

	@Column(name="bach_deg2")
	private String bachDeg2;

	@Column(name="bach_deg3")
	private String bachDeg3;

	@Column(name="bach_frm_1_1")
	private String bachFrm11;

	@Column(name="bach_frm_1_2")
	private String bachFrm12;

	@Column(name="bach_frm_1_3")
	private String bachFrm13;

	@Column(name="bach_frm_2_1")
	private String bachFrm21;

	@Column(name="bach_frm_2_2")
	private String bachFrm22;

	@Column(name="bach_frm_2_3")
	private String bachFrm23;

	@Column(name="bach_frm_3_1")
	private String bachFrm31;

	@Column(name="bach_frm_3_2")
	private String bachFrm32;

	@Column(name="bach_frm_3_3")
	private String bachFrm33;

	@Column(name="bach_frm_4_1")
	private String bachFrm41;

	@Column(name="bach_frm_4_2")
	private String bachFrm42;

	@Column(name="bach_frm_4_3")
	private String bachFrm43;

	@Column(name="bach_frm_5_1")
	private String bachFrm51;

	@Column(name="bach_frm_5_2")
	private String bachFrm52;

	@Column(name="bach_frm_5_3")
	private String bachFrm53;

	@Column(name="bach_let_grade_1")
	private String bachLetGrade1;

	@Column(name="bach_let_grade_2")
	private String bachLetGrade2;

	@Column(name="bach_let_grade_3")
	private String bachLetGrade3;

	@Column(name="bach_loc_univ1")
	private String bachLocUniv1;

	@Column(name="bach_loc_univ2")
	private String bachLocUniv2;

	@Column(name="bach_loc_univ3")
	private String bachLocUniv3;

	@Column(name="bach_location1")
	private String bachLocation1;

	@Column(name="bach_location2")
	private String bachLocation2;

	@Column(name="bach_location3")
	private String bachLocation3;

	@Column(name="bach_marks_1_1")
	private String bachMarks11;

	@Column(name="bach_marks_1_2")
	private String bachMarks12;

	@Column(name="bach_marks_1_3")
	private String bachMarks13;

	@Column(name="bach_marks_2_1")
	private String bachMarks21;

	@Column(name="bach_marks_2_2")
	private String bachMarks22;

	@Column(name="bach_marks_2_3")
	private String bachMarks23;

	@Column(name="bach_marks_3_1")
	private String bachMarks31;

	@Column(name="bach_marks_3_2")
	private String bachMarks32;

	@Column(name="bach_marks_3_3")
	private String bachMarks33;

	@Column(name="bach_marks_4_1")
	private String bachMarks41;

	@Column(name="bach_marks_4_2")
	private String bachMarks42;

	@Column(name="bach_marks_4_3")
	private String bachMarks43;

	@Column(name="bach_marks_5_1")
	private String bachMarks51;

	@Column(name="bach_marks_5_2")
	private String bachMarks52;

	@Column(name="bach_marks_5_3")
	private String bachMarks53;

	@Column(name="bach_marks_tot_1")
	private String bachMarksTot1;

	@Column(name="bach_marks_tot_2")
	private String bachMarksTot2;

	@Column(name="bach_marks_tot_3")
	private String bachMarksTot3;

	@Column(name="bach_max_marks_1_1")
	private String bachMaxMarks11;

	@Column(name="bach_max_marks_1_2")
	private String bachMaxMarks12;

	@Column(name="bach_max_marks_1_3")
	private String bachMaxMarks13;

	@Column(name="bach_max_marks_2_1")
	private String bachMaxMarks21;

	@Column(name="bach_max_marks_2_2")
	private String bachMaxMarks22;

	@Column(name="bach_max_marks_2_3")
	private String bachMaxMarks23;

	@Column(name="bach_max_marks_3_1")
	private String bachMaxMarks31;

	@Column(name="bach_max_marks_3_2")
	private String bachMaxMarks32;

	@Column(name="bach_max_marks_3_3")
	private String bachMaxMarks33;

	@Column(name="bach_max_marks_4_1")
	private String bachMaxMarks41;

	@Column(name="bach_max_marks_4_2")
	private String bachMaxMarks42;

	@Column(name="bach_max_marks_4_3")
	private String bachMaxMarks43;

	@Column(name="bach_max_marks_5_1")
	private String bachMaxMarks51;

	@Column(name="bach_max_marks_5_2")
	private String bachMaxMarks52;

	@Column(name="bach_max_marks_5_3")
	private String bachMaxMarks53;

	@Column(name="bach_max_marks_tot_1")
	private String bachMaxMarksTot1;

	@Column(name="bach_max_marks_tot_2")
	private String bachMaxMarksTot2;

	@Column(name="bach_max_marks_tot_3")
	private String bachMaxMarksTot3;

	@Column(name="bach_pcnt_1_1")
	private String bachPcnt11;

	@Column(name="bach_pcnt_1_2")
	private String bachPcnt12;

	@Column(name="bach_pcnt_1_3")
	private String bachPcnt13;

	@Column(name="bach_pcnt_2_1")
	private String bachPcnt21;

	@Column(name="bach_pcnt_2_2")
	private String bachPcnt22;

	@Column(name="bach_pcnt_2_3")
	private String bachPcnt23;

	@Column(name="bach_pcnt_3_1")
	private String bachPcnt31;

	@Column(name="bach_pcnt_3_2")
	private String bachPcnt32;

	@Column(name="bach_pcnt_3_3")
	private String bachPcnt33;

	@Column(name="bach_pcnt_4_1")
	private String bachPcnt41;

	@Column(name="bach_pcnt_4_2")
	private String bachPcnt42;

	@Column(name="bach_pcnt_4_3")
	private String bachPcnt43;

	@Column(name="bach_pcnt_5_1")
	private String bachPcnt51;

	@Column(name="bach_pcnt_5_2")
	private String bachPcnt52;

	@Column(name="bach_pcnt_5_3")
	private String bachPcnt53;

	@Column(name="bach_pcnt_tot_1")
	private String bachPcntTot1;

	@Column(name="bach_pcnt_tot_2")
	private String bachPcntTot2;

	@Column(name="bach_pcnt_tot_3")
	private String bachPcntTot3;

	@Column(name="bach_sub1")
	private String bachSub1;

	@Column(name="bach_sub2")
	private String bachSub2;

	@Column(name="bach_sub3")
	private String bachSub3;

	@Column(name="bach_to_1_1")
	private String bachTo11;

	@Column(name="bach_to_1_2")
	private String bachTo12;

	@Column(name="bach_to_1_3")
	private String bachTo13;

	@Column(name="bach_to_2_1")
	private String bachTo21;

	@Column(name="bach_to_2_2")
	private String bachTo22;

	@Column(name="bach_to_2_3")
	private String bachTo23;

	@Column(name="bach_to_3_1")
	private String bachTo31;

	@Column(name="bach_to_3_2")
	private String bachTo32;

	@Column(name="bach_to_3_3")
	private String bachTo33;

	@Column(name="bach_to_4_1")
	private String bachTo41;

	@Column(name="bach_to_4_2")
	private String bachTo42;

	@Column(name="bach_to_4_3")
	private String bachTo43;

	@Column(name="bach_to_5_1")
	private String bachTo51;

	@Column(name="bach_to_5_2")
	private String bachTo52;

	@Column(name="bach_to_5_3")
	private String bachTo53;

	@Column(name="bach_univ1")
	private String bachUniv1;

	@Column(name="bach_univ2")
	private String bachUniv2;

	@Column(name="bach_univ3")
	private String bachUniv3;

	@Column(name="cat_data_ptile")
	private String catDataPtile;

	@Column(name="cat_data_score")
	private String catDataScore;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cat_date")
	private Date catDate;

	@Column(name="cat_over_ptile")
	private String catOverPtile;

	@Column(name="cat_over_score")
	private String catOverScore;

	@Column(name="cat_quant_ptile")
	private String catQuantPtile;

	@Column(name="cat_quant_score")
	private String catQuantScore;

	@Lob
	@Column(name="cat_scorecard")
	private byte[] catScorecard;

	@Column(name="cat_verb_ptile")
	private String catVerbPtile;

	@Column(name="cat_verb_score")
	private String catVerbScore;

	private String catsize;

	private String cattype;
	
	@Column(name="city")
	private String city;
	@Column(name="add_src")
	private String add_src;

	public String getAdd_src() {
		return add_src;
	}

	public void setAdd_src(String add_src) {
		this.add_src = add_src;
	}

	@Column(name="cycle_no")
	private String cycleNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(name="deg_other_1")
	private String degOther1;

	@Column(name="deg_other_2")
	private String degOther2;

	@Column(name="deg_other_3")
	private String degOther3;

	@Column(name="desig_emp_1")
	private String desigEmp1;

	@Column(name="desig_emp_2")
	private String desigEmp2;

	@Column(name="desig_emp_3")
	private String desigEmp3;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_check")
	private Date dtCheck;

	private String email;

	@Column(name="email_emp_1")
	private String emailEmp1;

	@Column(name="email_emp_2")
	private String emailEmp2;

	@Column(name="email_emp_3")
	private String emailEmp3;

	@Column(name="ext_act")
	private String extAct;

	@Column(name="ext_duration")
	private String extDuration;

	@Column(name="ext_nature")
	private String extNature;

	@Column(name="first_name")
	private String firstName;

	@Column(name="frm_dt_1")
	private String frmDt1;

	@Column(name="frm_dt_2")
	private String frmDt2;

	@Column(name="frm_dt_3")
	private String frmDt3;

	@Column(name="gmat_awa_ptile")
	private String gmatAwaPtile;

	@Column(name="gmat_awa_score")
	private String gmatAwaScore;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gmat_date")
	private Date gmatDate;

	@Column(name="gmat_over_ptile")
	private String gmatOverPtile;

	@Column(name="gmat_over_score")
	private String gmatOverScore;

	@Column(name="gmat_quant_ptile")
	private String gmatQuantPtile;

	@Column(name="gmat_quant_score")
	private String gmatQuantScore;

	@Column(name="gmat_reg")
	private String gmatReg;

	@Lob
	@Column(name="gmat_scorecard")
	private byte[] gmatScorecard;

	@Column(name="gmat_verb_ptile")
	private String gmatVerbPtile;

	@Column(name="gmat_verb_score")
	private String gmatVerbScore;

	private String gmatsize;

	private String gmattype;

	@Column(name="int_city_1")
	private String intCity1;

	@Column(name="int_city_2")
	private String intCity2;

	@Column(name="int_city_3")
	private String intCity3;

	@Column(name="int_country_1")
	private String intCountry1;

	@Column(name="int_country_2")
	private String intCountry2;

	@Column(name="int_country_3")
	private String intCountry3;

	@Column(name="int_desc_1")
	private String intDesc1;

	@Column(name="int_desc_2")
	private String intDesc2;

	@Column(name="int_desc_3")
	private String intDesc3;

	@Column(name="int_dur_1")
	private String intDur1;

	@Column(name="int_dur_2")
	private String intDur2;

	@Column(name="int_dur_3")
	private String intDur3;

	@Column(name="int_purp_1")
	private String intPurp1;

	@Column(name="int_purp_2")
	private String intPurp2;

	@Column(name="int_purp_3")
	private String intPurp3;

	@Column(name="int_state_1")
	private String intState1;

	@Column(name="int_state_2")
	private String intState2;

	@Column(name="int_state_3")
	private String intState3;

	private String lang1;

	private String lang2;

	private String lang3;

	private String lang4;

	private String lang5;

	@Column(name="last_name")
	private String lastName;

	private int level;

	@Column(name="mailing_addr")
	private String mailingAddr;

	@Column(name="marital_status")
	private int maritalStatus;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="mstr_college1")
	private String mstrCollege1;

	@Column(name="mstr_college2")
	private String mstrCollege2;

	@Column(name="mstr_college3")
	private String mstrCollege3;

	@Column(name="mstr_deg1")
	private String mstrDeg1;

	@Column(name="mstr_deg2")
	private String mstrDeg2;

	@Column(name="mstr_deg3")
	private String mstrDeg3;

	@Column(name="mstr_frm_1_1")
	private String mstrFrm11;

	@Column(name="mstr_frm_1_2")
	private String mstrFrm12;

	@Column(name="mstr_frm_1_3")
	private String mstrFrm13;

	@Column(name="mstr_frm_2_1")
	private String mstrFrm21;

	@Column(name="mstr_frm_2_2")
	private String mstrFrm22;

	@Column(name="mstr_frm_2_3")
	private String mstrFrm23;

	@Column(name="mstr_frm_3_1")
	private String mstrFrm31;

	@Column(name="mstr_frm_3_2")
	private String mstrFrm32;

	@Column(name="mstr_frm_3_3")
	private String mstrFrm33;

	@Column(name="mstr_frm_4_1")
	private String mstrFrm41;

	@Column(name="mstr_frm_4_2")
	private String mstrFrm42;

	@Column(name="mstr_frm_4_3")
	private String mstrFrm43;

	@Column(name="mstr_frm_5_1")
	private String mstrFrm51;

	@Column(name="mstr_frm_5_2")
	private String mstrFrm52;

	@Column(name="mstr_frm_5_3")
	private String mstrFrm53;

	@Column(name="mstr_let_grade_1")
	private String mstrLetGrade1;

	@Column(name="mstr_let_grade_2")
	private String mstrLetGrade2;

	@Column(name="mstr_let_grade_3")
	private String mstrLetGrade3;

	@Column(name="mstr_loc_univ1")
	private String mstrLocUniv1;

	@Column(name="mstr_loc_univ2")
	private String mstrLocUniv2;

	@Column(name="mstr_loc_univ3")
	private String mstrLocUniv3;

	@Column(name="mstr_location1")
	private String mstrLocation1;

	@Column(name="mstr_location2")
	private String mstrLocation2;

	@Column(name="mstr_location3")
	private String mstrLocation3;

	@Column(name="mstr_marks_1_1")
	private String mstrMarks11;

	@Column(name="mstr_marks_1_2")
	private String mstrMarks12;

	@Column(name="mstr_marks_1_3")
	private String mstrMarks13;

	@Column(name="mstr_marks_2_1")
	private String mstrMarks21;

	@Column(name="mstr_marks_2_2")
	private String mstrMarks22;

	@Column(name="mstr_marks_2_3")
	private String mstrMarks23;

	@Column(name="mstr_marks_3_1")
	private String mstrMarks31;

	@Column(name="mstr_marks_3_2")
	private String mstrMarks32;

	@Column(name="mstr_marks_3_3")
	private String mstrMarks33;

	@Column(name="mstr_marks_4_1")
	private String mstrMarks41;

	@Column(name="mstr_marks_4_2")
	private String mstrMarks42;

	@Column(name="mstr_marks_4_3")
	private String mstrMarks43;

	@Column(name="mstr_marks_5_1")
	private String mstrMarks51;

	@Column(name="mstr_marks_5_2")
	private String mstrMarks52;

	@Column(name="mstr_marks_5_3")
	private String mstrMarks53;

	@Column(name="mstr_marks_tot_1")
	private String mstrMarksTot1;

	@Column(name="mstr_marks_tot_2")
	private String mstrMarksTot2;

	@Column(name="mstr_marks_tot_3")
	private String mstrMarksTot3;

	@Column(name="mstr_max_marks_1_1")
	private String mstrMaxMarks11;

	@Column(name="mstr_max_marks_1_2")
	private String mstrMaxMarks12;

	@Column(name="mstr_max_marks_1_3")
	private String mstrMaxMarks13;

	@Column(name="mstr_max_marks_2_1")
	private String mstrMaxMarks21;

	@Column(name="mstr_max_marks_2_2")
	private String mstrMaxMarks22;

	@Column(name="mstr_max_marks_2_3")
	private String mstrMaxMarks23;

	@Column(name="mstr_max_marks_3_1")
	private String mstrMaxMarks31;

	@Column(name="mstr_max_marks_3_2")
	private String mstrMaxMarks32;

	@Column(name="mstr_max_marks_3_3")
	private String mstrMaxMarks33;

	@Column(name="mstr_max_marks_4_1")
	private String mstrMaxMarks41;

	@Column(name="mstr_max_marks_4_2")
	private String mstrMaxMarks42;

	@Column(name="mstr_max_marks_4_3")
	private String mstrMaxMarks43;

	@Column(name="mstr_max_marks_5_1")
	private String mstrMaxMarks51;

	@Column(name="mstr_max_marks_5_2")
	private String mstrMaxMarks52;

	@Column(name="mstr_max_marks_5_3")
	private String mstrMaxMarks53;

	@Column(name="mstr_max_marks_tot_1")
	private String mstrMaxMarksTot1;

	@Column(name="mstr_max_marks_tot_2")
	private String mstrMaxMarksTot2;

	@Column(name="mstr_max_marks_tot_3")
	private String mstrMaxMarksTot3;

	@Column(name="mstr_pcnt_1_1")
	private String mstrPcnt11;

	@Column(name="mstr_pcnt_1_2")
	private String mstrPcnt12;

	@Column(name="mstr_pcnt_1_3")
	private String mstrPcnt13;

	@Column(name="mstr_pcnt_2_1")
	private String mstrPcnt21;

	@Column(name="mstr_pcnt_2_2")
	private String mstrPcnt22;

	@Column(name="mstr_pcnt_2_3")
	private String mstrPcnt23;

	@Column(name="mstr_pcnt_3_1")
	private String mstrPcnt31;

	@Column(name="mstr_pcnt_3_2")
	private String mstrPcnt32;

	@Column(name="mstr_pcnt_3_3")
	private String mstrPcnt33;

	@Column(name="mstr_pcnt_4_1")
	private String mstrPcnt41;

	@Column(name="mstr_pcnt_4_2")
	private String mstrPcnt42;

	@Column(name="mstr_pcnt_4_3")
	private String mstrPcnt43;

	@Column(name="mstr_pcnt_5_1")
	private String mstrPcnt51;

	@Column(name="mstr_pcnt_5_2")
	private String mstrPcnt52;

	@Column(name="mstr_pcnt_5_3")
	private String mstrPcnt53;

	@Column(name="mstr_pcnt_tot_1")
	private String mstrPcntTot1;

	@Column(name="mstr_pcnt_tot_2")
	private String mstrPcntTot2;

	@Column(name="mstr_pcnt_tot_3")
	private String mstrPcntTot3;

	@Column(name="mstr_sub1")
	private String mstrSub1;

	@Column(name="mstr_sub2")
	private String mstrSub2;

	@Column(name="mstr_sub3")
	private String mstrSub3;

	@Column(name="mstr_to_1_1")
	private String mstrTo11;

	@Column(name="mstr_to_1_2")
	private String mstrTo12;

	@Column(name="mstr_to_1_3")
	private String mstrTo13;

	@Column(name="mstr_to_2_1")
	private String mstrTo21;

	@Column(name="mstr_to_2_2")
	private String mstrTo22;

	@Column(name="mstr_to_2_3")
	private String mstrTo23;

	@Column(name="mstr_to_3_1")
	private String mstrTo31;

	@Column(name="mstr_to_3_2")
	private String mstrTo32;

	@Column(name="mstr_to_3_3")
	private String mstrTo33;

	@Column(name="mstr_to_4_1")
	private String mstrTo41;

	@Column(name="mstr_to_4_2")
	private String mstrTo42;

	@Column(name="mstr_to_4_3")
	private String mstrTo43;

	@Column(name="mstr_to_5_1")
	private String mstrTo51;

	@Column(name="mstr_to_5_2")
	private String mstrTo52;

	@Column(name="mstr_to_5_3")
	private String mstrTo53;

	@Column(name="mstr_univ1")
	private String mstrUniv1;

	@Column(name="mstr_univ2")
	private String mstrUniv2;

	@Column(name="mstr_univ3")
	private String mstrUniv3;

	@Column(name="name_emp_1")
	private String nameEmp1;

	@Column(name="name_emp_2")
	private String nameEmp2;

	@Column(name="name_emp_3")
	private String nameEmp3;

	private String nationality;

	@Column(name="num_mnths_1")
	private String numMnths1;

	@Column(name="num_mnths_2")
	private String numMnths2;

	@Column(name="num_mnths_3")
	private String numMnths3;

	@Column(name="page_no")
	private int pageNo;

	@Column(name="phone_emp_1")
	private String phoneEmp1;

	@Column(name="phone_emp_2")
	private String phoneEmp2;

	@Column(name="phone_emp_3")
	private String phoneEmp3;

	@Column(name="phone_home")
	private String phoneHome;

	@Column(name="phone_mobile")
	private String phoneMobile;

	@Column(name="phone_office")
	private String phoneOffice;
	
	
	@Column(name="country")
	private String country;
	
	@Column(name="address1")
	private String address1;
	
	
	@Column(name="address2")
	private String address2;
	
	

	
	
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Lob
	private byte[] photograph;

	private int photosize;

	private String phototype;
	
	
	private String pincode;
	
	
	@Column(name="category")
	private String category;
	


	@Column(name="pref_1")
	private String pref1;

	@Column(name="pref_2")
	private String pref2;

	@Column(name="prof_class_1")
	private String profClass1;

	@Column(name="prof_class_2")
	private String profClass2;

	@Column(name="prof_class_3")
	private String profClass3;

	@Column(name="prof_deg_1")
	private String profDeg1;

	@Column(name="prof_deg_2")
	private String profDeg2;

	@Column(name="prof_deg_3")
	private String profDeg3;

	@Column(name="prof_inst_1")
	private String profInst1;

	@Column(name="prof_inst_2")
	private String profInst2;

	@Column(name="prof_inst_3")
	private String profInst3;

	@Column(name="prof_loc_1")
	private String profLoc1;

	@Column(name="prof_loc_2")
	private String profLoc2;

	@Column(name="prof_loc_3")
	private String profLoc3;

	@Column(name="prof_marks_1")
	private String profMarks1;

	@Column(name="prof_marks_2")
	private String profMarks2;

	@Column(name="prof_marks_3")
	private String profMarks3;

	@Column(name="prof_max_1")
	private String profMax1;

	@Column(name="prof_max_2")
	private String profMax2;

	@Column(name="prof_max_3")
	private String profMax3;

	@Column(name="prof_mnth_1")
	private String profMnth1;

	@Column(name="prof_mnth_2")
	private String profMnth2;

	@Column(name="prof_mnth_3")
	private String profMnth3;

	@Column(name="prof_pcnt_1")
	private String profPcnt1;

	@Column(name="prof_pcnt_2")
	private String profPcnt2;

	@Column(name="prof_pcnt_3")
	private String profPcnt3;

	@Column(name="Pursuingdegree")
	private int pursuingdegree;

	private String regno;

	@Column(name="role_emp_1")
	private String roleEmp1;

	@Column(name="role_emp_2")
	private String roleEmp2;

	@Column(name="role_emp_3")
	private String roleEmp3;

	@Column(name="salary_emp_1")
	private String salaryEmp1;

	@Column(name="salary_emp_2")
	private String salaryEmp2;

	@Column(name="salary_emp_3")
	private String salaryEmp3;

	@Column(name="school_10")
	private String school10;

	@Column(name="school_10_class_div")
	private String school10ClassDiv;

	@Column(name="school_10_institute")
	private String school10Institute;

	@Column(name="school_10_localtion_inst")
	private String school10LocaltionInst;

	@Column(name="school_10_localtion_univ")
	private String school10LocaltionUniv;

	@Column(name="school_10_marks")
	private String school10Marks;

	@Column(name="school_10_max_marks")
	private String school10MaxMarks;

	@Column(name="school_10_passing")
	private String school10Passing;

	@Column(name="school_10_percentage")
	private String school10Percentage;

	@Column(name="school_10_univ")
	private String school10Univ;

	@Column(name="school_12")
	private String school12;

	@Column(name="school_12_class_div")
	private String school12ClassDiv;

	@Column(name="school_12_institute")
	private String school12Institute;

	@Column(name="school_12_localtion_inst")
	private String school12LocaltionInst;

	@Column(name="school_12_localtion_univ")
	private String school12LocaltionUniv;

	@Column(name="school_12_major1")
	private String school12Major1;

	@Column(name="school_12_major2")
	private String school12Major2;

	@Column(name="school_12_major3")
	private String school12Major3;

	@Column(name="school_12_marks")
	private String school12Marks;

	@Column(name="school_12_max_marks")
	private String school12MaxMarks;

	@Column(name="school_12_passing")
	private String school12Passing;

	@Column(name="school_12_percentage")
	private String school12Percentage;

	@Column(name="school_12_univ")
	private String school12Univ;

	private String sex;

	private String state;

	private String stream;

	private String terms;

	@Column(name="to_dt_1")
	private String toDt1;

	@Column(name="to_dt_2")
	private String toDt2;

	@Column(name="to_dt_3")
	private String toDt3;

	@Column(name="tot_exp")
	private String totExp;

	@Column(name="tot_mgr")
	private String totMgr;
	@Column(name="admissiontest")
	private String  admissiontest;
	@Column(name="admissiontestdate")
	private String admissiontestdate;
	@Column(name="score")
	private String score;
	@Column(name="register_no")
	private String register_no;
	@Column(name="pecentile")
	private String pecentile;
	@Column(name="tran_id")
	private String tran_id;

	
	
	public String getTran_id() {
		return tran_id;
	}

	public void setTran_id(String tran_id) {
		this.tran_id = tran_id;
	}

	public String getAdmissiontest() {
		return admissiontest;
	}

	public void setAdmissiontest(String admissiontest) {
		this.admissiontest = admissiontest;
	}

	public String getAdmissiontestdate() {
		return admissiontestdate;
	}

	public void setAdmissiontestdate(String admissiontestdate) {
		this.admissiontestdate = admissiontestdate;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getRegister_no() {
		return register_no;
	}

	public void setRegister_no(String register_no) {
		this.register_no = register_no;
	}

	public String getPecentile() {
		return pecentile;
	}

	public void setPecentile(String pecentile) {
		this.pecentile = pecentile;
	}

	public Tbltemp() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddInfo() {
		return this.addInfo;
	}

	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}

	public String getAddrEmp1() {
		return this.addrEmp1;
	}

	public void setAddrEmp1(String addrEmp1) {
		this.addrEmp1 = addrEmp1;
	}

	public String getAddrEmp2() {
		return this.addrEmp2;
	}

	public void setAddrEmp2(String addrEmp2) {
		this.addrEmp2 = addrEmp2;
	}

	public String getAddrEmp3() {
		return this.addrEmp3;
	}

	public void setAddrEmp3(String addrEmp3) {
		this.addrEmp3 = addrEmp3;
	}

	public String getBachCollege1() {
		return this.bachCollege1;
	}

	public void setBachCollege1(String bachCollege1) {
		this.bachCollege1 = bachCollege1;
	}

	public String getBachCollege2() {
		return this.bachCollege2;
	}

	public void setBachCollege2(String bachCollege2) {
		this.bachCollege2 = bachCollege2;
	}

	public String getBachCollege3() {
		return this.bachCollege3;
	}

	public void setBachCollege3(String bachCollege3) {
		this.bachCollege3 = bachCollege3;
	}

	public String getBachDeg1() {
		return this.bachDeg1;
	}

	public void setBachDeg1(String bachDeg1) {
		this.bachDeg1 = bachDeg1;
	}

	public String getBachDeg2() {
		return this.bachDeg2;
	}

	public void setBachDeg2(String bachDeg2) {
		this.bachDeg2 = bachDeg2;
	}

	public String getBachDeg3() {
		return this.bachDeg3;
	}

	public void setBachDeg3(String bachDeg3) {
		this.bachDeg3 = bachDeg3;
	}

	public String getBachFrm11() {
		return this.bachFrm11;
	}

	public void setBachFrm11(String bachFrm11) {
		this.bachFrm11 = bachFrm11;
	}

	public String getBachFrm12() {
		return this.bachFrm12;
	}

	public void setBachFrm12(String bachFrm12) {
		this.bachFrm12 = bachFrm12;
	}

	public String getBachFrm13() {
		return this.bachFrm13;
	}

	public void setBachFrm13(String bachFrm13) {
		this.bachFrm13 = bachFrm13;
	}

	public String getBachFrm21() {
		return this.bachFrm21;
	}

	public void setBachFrm21(String bachFrm21) {
		this.bachFrm21 = bachFrm21;
	}

	public String getBachFrm22() {
		return this.bachFrm22;
	}

	public void setBachFrm22(String bachFrm22) {
		this.bachFrm22 = bachFrm22;
	}

	public String getBachFrm23() {
		return this.bachFrm23;
	}

	public void setBachFrm23(String bachFrm23) {
		this.bachFrm23 = bachFrm23;
	}

	public String getBachFrm31() {
		return this.bachFrm31;
	}

	public void setBachFrm31(String bachFrm31) {
		this.bachFrm31 = bachFrm31;
	}

	public String getBachFrm32() {
		return this.bachFrm32;
	}

	public void setBachFrm32(String bachFrm32) {
		this.bachFrm32 = bachFrm32;
	}

	public String getBachFrm33() {
		return this.bachFrm33;
	}

	public void setBachFrm33(String bachFrm33) {
		this.bachFrm33 = bachFrm33;
	}

	public String getBachFrm41() {
		return this.bachFrm41;
	}

	public void setBachFrm41(String bachFrm41) {
		this.bachFrm41 = bachFrm41;
	}

	public String getBachFrm42() {
		return this.bachFrm42;
	}

	public void setBachFrm42(String bachFrm42) {
		this.bachFrm42 = bachFrm42;
	}

	public String getBachFrm43() {
		return this.bachFrm43;
	}

	public void setBachFrm43(String bachFrm43) {
		this.bachFrm43 = bachFrm43;
	}

	public String getBachFrm51() {
		return this.bachFrm51;
	}

	public void setBachFrm51(String bachFrm51) {
		this.bachFrm51 = bachFrm51;
	}

	public String getBachFrm52() {
		return this.bachFrm52;
	}

	public void setBachFrm52(String bachFrm52) {
		this.bachFrm52 = bachFrm52;
	}

	public String getBachFrm53() {
		return this.bachFrm53;
	}

	public void setBachFrm53(String bachFrm53) {
		this.bachFrm53 = bachFrm53;
	}

	public String getBachLetGrade1() {
		return this.bachLetGrade1;
	}

	public void setBachLetGrade1(String bachLetGrade1) {
		this.bachLetGrade1 = bachLetGrade1;
	}

	public String getBachLetGrade2() {
		return this.bachLetGrade2;
	}

	public void setBachLetGrade2(String bachLetGrade2) {
		this.bachLetGrade2 = bachLetGrade2;
	}

	public String getBachLetGrade3() {
		return this.bachLetGrade3;
	}

	public void setBachLetGrade3(String bachLetGrade3) {
		this.bachLetGrade3 = bachLetGrade3;
	}

	public String getBachLocUniv1() {
		return this.bachLocUniv1;
	}

	public void setBachLocUniv1(String bachLocUniv1) {
		this.bachLocUniv1 = bachLocUniv1;
	}

	public String getBachLocUniv2() {
		return this.bachLocUniv2;
	}

	public void setBachLocUniv2(String bachLocUniv2) {
		this.bachLocUniv2 = bachLocUniv2;
	}

	public String getBachLocUniv3() {
		return this.bachLocUniv3;
	}

	public void setBachLocUniv3(String bachLocUniv3) {
		this.bachLocUniv3 = bachLocUniv3;
	}

	public String getBachLocation1() {
		return this.bachLocation1;
	}

	public void setBachLocation1(String bachLocation1) {
		this.bachLocation1 = bachLocation1;
	}

	public String getBachLocation2() {
		return this.bachLocation2;
	}

	public void setBachLocation2(String bachLocation2) {
		this.bachLocation2 = bachLocation2;
	}

	public String getBachLocation3() {
		return this.bachLocation3;
	}

	public void setBachLocation3(String bachLocation3) {
		this.bachLocation3 = bachLocation3;
	}

	public String getBachMarks11() {
		return this.bachMarks11;
	}

	public void setBachMarks11(String bachMarks11) {
		this.bachMarks11 = bachMarks11;
	}

	public String getBachMarks12() {
		return this.bachMarks12;
	}

	public void setBachMarks12(String bachMarks12) {
		this.bachMarks12 = bachMarks12;
	}

	public String getBachMarks13() {
		return this.bachMarks13;
	}

	public void setBachMarks13(String bachMarks13) {
		this.bachMarks13 = bachMarks13;
	}

	public String getBachMarks21() {
		return this.bachMarks21;
	}

	public void setBachMarks21(String bachMarks21) {
		this.bachMarks21 = bachMarks21;
	}

	public String getBachMarks22() {
		return this.bachMarks22;
	}

	public void setBachMarks22(String bachMarks22) {
		this.bachMarks22 = bachMarks22;
	}

	public String getBachMarks23() {
		return this.bachMarks23;
	}

	public void setBachMarks23(String bachMarks23) {
		this.bachMarks23 = bachMarks23;
	}

	public String getBachMarks31() {
		return this.bachMarks31;
	}

	public void setBachMarks31(String bachMarks31) {
		this.bachMarks31 = bachMarks31;
	}

	public String getBachMarks32() {
		return this.bachMarks32;
	}

	public void setBachMarks32(String bachMarks32) {
		this.bachMarks32 = bachMarks32;
	}

	public String getBachMarks33() {
		return this.bachMarks33;
	}

	public void setBachMarks33(String bachMarks33) {
		this.bachMarks33 = bachMarks33;
	}

	public String getBachMarks41() {
		return this.bachMarks41;
	}

	public void setBachMarks41(String bachMarks41) {
		this.bachMarks41 = bachMarks41;
	}

	public String getBachMarks42() {
		return this.bachMarks42;
	}

	public void setBachMarks42(String bachMarks42) {
		this.bachMarks42 = bachMarks42;
	}

	public String getBachMarks43() {
		return this.bachMarks43;
	}

	public void setBachMarks43(String bachMarks43) {
		this.bachMarks43 = bachMarks43;
	}

	public String getBachMarks51() {
		return this.bachMarks51;
	}

	public void setBachMarks51(String bachMarks51) {
		this.bachMarks51 = bachMarks51;
	}

	public String getBachMarks52() {
		return this.bachMarks52;
	}

	public void setBachMarks52(String bachMarks52) {
		this.bachMarks52 = bachMarks52;
	}

	public String getBachMarks53() {
		return this.bachMarks53;
	}

	public void setBachMarks53(String bachMarks53) {
		this.bachMarks53 = bachMarks53;
	}

	public String getBachMarksTot1() {
		return this.bachMarksTot1;
	}

	public void setBachMarksTot1(String bachMarksTot1) {
		this.bachMarksTot1 = bachMarksTot1;
	}

	public String getBachMarksTot2() {
		return this.bachMarksTot2;
	}

	public void setBachMarksTot2(String bachMarksTot2) {
		this.bachMarksTot2 = bachMarksTot2;
	}

	public String getBachMarksTot3() {
		return this.bachMarksTot3;
	}

	public void setBachMarksTot3(String bachMarksTot3) {
		this.bachMarksTot3 = bachMarksTot3;
	}

	public String getBachMaxMarks11() {
		return this.bachMaxMarks11;
	}

	public void setBachMaxMarks11(String bachMaxMarks11) {
		this.bachMaxMarks11 = bachMaxMarks11;
	}

	public String getBachMaxMarks12() {
		return this.bachMaxMarks12;
	}

	public void setBachMaxMarks12(String bachMaxMarks12) {
		this.bachMaxMarks12 = bachMaxMarks12;
	}

	public String getBachMaxMarks13() {
		return this.bachMaxMarks13;
	}

	public void setBachMaxMarks13(String bachMaxMarks13) {
		this.bachMaxMarks13 = bachMaxMarks13;
	}

	public String getBachMaxMarks21() {
		return this.bachMaxMarks21;
	}

	public void setBachMaxMarks21(String bachMaxMarks21) {
		this.bachMaxMarks21 = bachMaxMarks21;
	}

	public String getBachMaxMarks22() {
		return this.bachMaxMarks22;
	}

	public void setBachMaxMarks22(String bachMaxMarks22) {
		this.bachMaxMarks22 = bachMaxMarks22;
	}

	public String getBachMaxMarks23() {
		return this.bachMaxMarks23;
	}

	public void setBachMaxMarks23(String bachMaxMarks23) {
		this.bachMaxMarks23 = bachMaxMarks23;
	}

	public String getBachMaxMarks31() {
		return this.bachMaxMarks31;
	}

	public void setBachMaxMarks31(String bachMaxMarks31) {
		this.bachMaxMarks31 = bachMaxMarks31;
	}

	public String getBachMaxMarks32() {
		return this.bachMaxMarks32;
	}

	public void setBachMaxMarks32(String bachMaxMarks32) {
		this.bachMaxMarks32 = bachMaxMarks32;
	}

	public String getBachMaxMarks33() {
		return this.bachMaxMarks33;
	}

	public void setBachMaxMarks33(String bachMaxMarks33) {
		this.bachMaxMarks33 = bachMaxMarks33;
	}

	public String getBachMaxMarks41() {
		return this.bachMaxMarks41;
	}

	public void setBachMaxMarks41(String bachMaxMarks41) {
		this.bachMaxMarks41 = bachMaxMarks41;
	}

	public String getBachMaxMarks42() {
		return this.bachMaxMarks42;
	}

	public void setBachMaxMarks42(String bachMaxMarks42) {
		this.bachMaxMarks42 = bachMaxMarks42;
	}

	public String getBachMaxMarks43() {
		return this.bachMaxMarks43;
	}

	public void setBachMaxMarks43(String bachMaxMarks43) {
		this.bachMaxMarks43 = bachMaxMarks43;
	}

	public String getBachMaxMarks51() {
		return this.bachMaxMarks51;
	}

	public void setBachMaxMarks51(String bachMaxMarks51) {
		this.bachMaxMarks51 = bachMaxMarks51;
	}

	public String getBachMaxMarks52() {
		return this.bachMaxMarks52;
	}

	public void setBachMaxMarks52(String bachMaxMarks52) {
		this.bachMaxMarks52 = bachMaxMarks52;
	}

	public String getBachMaxMarks53() {
		return this.bachMaxMarks53;
	}

	public void setBachMaxMarks53(String bachMaxMarks53) {
		this.bachMaxMarks53 = bachMaxMarks53;
	}

	public String getBachMaxMarksTot1() {
		return this.bachMaxMarksTot1;
	}

	public void setBachMaxMarksTot1(String bachMaxMarksTot1) {
		this.bachMaxMarksTot1 = bachMaxMarksTot1;
	}

	public String getBachMaxMarksTot2() {
		return this.bachMaxMarksTot2;
	}

	public void setBachMaxMarksTot2(String bachMaxMarksTot2) {
		this.bachMaxMarksTot2 = bachMaxMarksTot2;
	}

	public String getBachMaxMarksTot3() {
		return this.bachMaxMarksTot3;
	}

	public void setBachMaxMarksTot3(String bachMaxMarksTot3) {
		this.bachMaxMarksTot3 = bachMaxMarksTot3;
	}

	public String getBachPcnt11() {
		return this.bachPcnt11;
	}

	public void setBachPcnt11(String bachPcnt11) {
		this.bachPcnt11 = bachPcnt11;
	}

	public String getBachPcnt12() {
		return this.bachPcnt12;
	}

	public void setBachPcnt12(String bachPcnt12) {
		this.bachPcnt12 = bachPcnt12;
	}

	public String getBachPcnt13() {
		return this.bachPcnt13;
	}

	public void setBachPcnt13(String bachPcnt13) {
		this.bachPcnt13 = bachPcnt13;
	}

	public String getBachPcnt21() {
		return this.bachPcnt21;
	}

	public void setBachPcnt21(String bachPcnt21) {
		this.bachPcnt21 = bachPcnt21;
	}

	public String getBachPcnt22() {
		return this.bachPcnt22;
	}

	public void setBachPcnt22(String bachPcnt22) {
		this.bachPcnt22 = bachPcnt22;
	}

	public String getBachPcnt23() {
		return this.bachPcnt23;
	}

	public void setBachPcnt23(String bachPcnt23) {
		this.bachPcnt23 = bachPcnt23;
	}

	public String getBachPcnt31() {
		return this.bachPcnt31;
	}

	public void setBachPcnt31(String bachPcnt31) {
		this.bachPcnt31 = bachPcnt31;
	}

	public String getBachPcnt32() {
		return this.bachPcnt32;
	}

	public void setBachPcnt32(String bachPcnt32) {
		this.bachPcnt32 = bachPcnt32;
	}

	public String getBachPcnt33() {
		return this.bachPcnt33;
	}

	public void setBachPcnt33(String bachPcnt33) {
		this.bachPcnt33 = bachPcnt33;
	}

	public String getBachPcnt41() {
		return this.bachPcnt41;
	}

	public void setBachPcnt41(String bachPcnt41) {
		this.bachPcnt41 = bachPcnt41;
	}

	public String getBachPcnt42() {
		return this.bachPcnt42;
	}

	public void setBachPcnt42(String bachPcnt42) {
		this.bachPcnt42 = bachPcnt42;
	}

	public String getBachPcnt43() {
		return this.bachPcnt43;
	}

	public void setBachPcnt43(String bachPcnt43) {
		this.bachPcnt43 = bachPcnt43;
	}

	public String getBachPcnt51() {
		return this.bachPcnt51;
	}

	public void setBachPcnt51(String bachPcnt51) {
		this.bachPcnt51 = bachPcnt51;
	}

	public String getBachPcnt52() {
		return this.bachPcnt52;
	}

	public void setBachPcnt52(String bachPcnt52) {
		this.bachPcnt52 = bachPcnt52;
	}

	public String getBachPcnt53() {
		return this.bachPcnt53;
	}

	public void setBachPcnt53(String bachPcnt53) {
		this.bachPcnt53 = bachPcnt53;
	}

	public String getBachPcntTot1() {
		return this.bachPcntTot1;
	}

	public void setBachPcntTot1(String bachPcntTot1) {
		this.bachPcntTot1 = bachPcntTot1;
	}

	public String getBachPcntTot2() {
		return this.bachPcntTot2;
	}

	public void setBachPcntTot2(String bachPcntTot2) {
		this.bachPcntTot2 = bachPcntTot2;
	}

	public String getBachPcntTot3() {
		return this.bachPcntTot3;
	}

	public void setBachPcntTot3(String bachPcntTot3) {
		this.bachPcntTot3 = bachPcntTot3;
	}

	public String getBachSub1() {
		return this.bachSub1;
	}

	public void setBachSub1(String bachSub1) {
		this.bachSub1 = bachSub1;
	}

	public String getBachSub2() {
		return this.bachSub2;
	}

	public void setBachSub2(String bachSub2) {
		this.bachSub2 = bachSub2;
	}

	public String getBachSub3() {
		return this.bachSub3;
	}

	public void setBachSub3(String bachSub3) {
		this.bachSub3 = bachSub3;
	}

	public String getBachTo11() {
		return this.bachTo11;
	}

	public void setBachTo11(String bachTo11) {
		this.bachTo11 = bachTo11;
	}

	public String getBachTo12() {
		return this.bachTo12;
	}

	public void setBachTo12(String bachTo12) {
		this.bachTo12 = bachTo12;
	}

	public String getBachTo13() {
		return this.bachTo13;
	}

	public void setBachTo13(String bachTo13) {
		this.bachTo13 = bachTo13;
	}

	public String getBachTo21() {
		return this.bachTo21;
	}

	public void setBachTo21(String bachTo21) {
		this.bachTo21 = bachTo21;
	}

	public String getBachTo22() {
		return this.bachTo22;
	}

	public void setBachTo22(String bachTo22) {
		this.bachTo22 = bachTo22;
	}

	public String getBachTo23() {
		return this.bachTo23;
	}

	public void setBachTo23(String bachTo23) {
		this.bachTo23 = bachTo23;
	}

	public String getBachTo31() {
		return this.bachTo31;
	}

	public void setBachTo31(String bachTo31) {
		this.bachTo31 = bachTo31;
	}

	public String getBachTo32() {
		return this.bachTo32;
	}

	public void setBachTo32(String bachTo32) {
		this.bachTo32 = bachTo32;
	}

	public String getBachTo33() {
		return this.bachTo33;
	}

	public void setBachTo33(String bachTo33) {
		this.bachTo33 = bachTo33;
	}

	public String getBachTo41() {
		return this.bachTo41;
	}

	public void setBachTo41(String bachTo41) {
		this.bachTo41 = bachTo41;
	}

	public String getBachTo42() {
		return this.bachTo42;
	}

	public void setBachTo42(String bachTo42) {
		this.bachTo42 = bachTo42;
	}

	public String getBachTo43() {
		return this.bachTo43;
	}

	public void setBachTo43(String bachTo43) {
		this.bachTo43 = bachTo43;
	}

	public String getBachTo51() {
		return this.bachTo51;
	}

	public void setBachTo51(String bachTo51) {
		this.bachTo51 = bachTo51;
	}

	public String getBachTo52() {
		return this.bachTo52;
	}

	public void setBachTo52(String bachTo52) {
		this.bachTo52 = bachTo52;
	}

	public String getBachTo53() {
		return this.bachTo53;
	}

	public void setBachTo53(String bachTo53) {
		this.bachTo53 = bachTo53;
	}

	public String getBachUniv1() {
		return this.bachUniv1;
	}

	public void setBachUniv1(String bachUniv1) {
		this.bachUniv1 = bachUniv1;
	}

	public String getBachUniv2() {
		return this.bachUniv2;
	}

	public void setBachUniv2(String bachUniv2) {
		this.bachUniv2 = bachUniv2;
	}

	public String getBachUniv3() {
		return this.bachUniv3;
	}

	public void setBachUniv3(String bachUniv3) {
		this.bachUniv3 = bachUniv3;
	}

	public String getCatDataPtile() {
		return this.catDataPtile;
	}

	public void setCatDataPtile(String catDataPtile) {
		this.catDataPtile = catDataPtile;
	}

	public String getCatDataScore() {
		return this.catDataScore;
	}

	public void setCatDataScore(String catDataScore) {
		this.catDataScore = catDataScore;
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

	public String getCatQuantPtile() {
		return this.catQuantPtile;
	}

	public void setCatQuantPtile(String catQuantPtile) {
		this.catQuantPtile = catQuantPtile;
	}

	public String getCatQuantScore() {
		return this.catQuantScore;
	}

	public void setCatQuantScore(String catQuantScore) {
		this.catQuantScore = catQuantScore;
	}

	public byte[] getCatScorecard() {
		return this.catScorecard;
	}

	public void setCatScorecard(byte[] catScorecard) {
		this.catScorecard = catScorecard;
	}

	public String getCatVerbPtile() {
		return this.catVerbPtile;
	}

	public void setCatVerbPtile(String catVerbPtile) {
		this.catVerbPtile = catVerbPtile;
	}

	public String getCatVerbScore() {
		return this.catVerbScore;
	}

	public void setCatVerbScore(String catVerbScore) {
		this.catVerbScore = catVerbScore;
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

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCycleNo() {
		return this.cycleNo;
	}

	public void setCycleNo(String cycleNo) {
		this.cycleNo = cycleNo;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDegOther1() {
		return this.degOther1;
	}

	public void setDegOther1(String degOther1) {
		this.degOther1 = degOther1;
	}

	public String getDegOther2() {
		return this.degOther2;
	}

	public void setDegOther2(String degOther2) {
		this.degOther2 = degOther2;
	}

	public String getDegOther3() {
		return this.degOther3;
	}

	public void setDegOther3(String degOther3) {
		this.degOther3 = degOther3;
	}

	public String getDesigEmp1() {
		return this.desigEmp1;
	}

	public void setDesigEmp1(String desigEmp1) {
		this.desigEmp1 = desigEmp1;
	}

	public String getDesigEmp2() {
		return this.desigEmp2;
	}

	public void setDesigEmp2(String desigEmp2) {
		this.desigEmp2 = desigEmp2;
	}

	public String getDesigEmp3() {
		return this.desigEmp3;
	}

	public void setDesigEmp3(String desigEmp3) {
		this.desigEmp3 = desigEmp3;
	}

	public Date getDtCheck() {
		return this.dtCheck;
	}

	public void setDtCheck(Date dtCheck) {
		this.dtCheck = dtCheck;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailEmp1() {
		return this.emailEmp1;
	}

	public void setEmailEmp1(String emailEmp1) {
		this.emailEmp1 = emailEmp1;
	}

	public String getEmailEmp2() {
		return this.emailEmp2;
	}

	public void setEmailEmp2(String emailEmp2) {
		this.emailEmp2 = emailEmp2;
	}

	public String getEmailEmp3() {
		return this.emailEmp3;
	}

	public void setEmailEmp3(String emailEmp3) {
		this.emailEmp3 = emailEmp3;
	}

	public String getExtAct() {
		return this.extAct;
	}

	public void setExtAct(String extAct) {
		this.extAct = extAct;
	}

	public String getExtDuration() {
		return this.extDuration;
	}

	public void setExtDuration(String extDuration) {
		this.extDuration = extDuration;
	}

	public String getExtNature() {
		return this.extNature;
	}

	public void setExtNature(String extNature) {
		this.extNature = extNature;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFrmDt1() {
		return this.frmDt1;
	}

	public void setFrmDt1(String frmDt1) {
		this.frmDt1 = frmDt1;
	}

	public String getFrmDt2() {
		return this.frmDt2;
	}

	public void setFrmDt2(String frmDt2) {
		this.frmDt2 = frmDt2;
	}

	public String getFrmDt3() {
		return this.frmDt3;
	}

	public void setFrmDt3(String frmDt3) {
		this.frmDt3 = frmDt3;
	}

	public String getGmatAwaPtile() {
		return this.gmatAwaPtile;
	}

	public void setGmatAwaPtile(String gmatAwaPtile) {
		this.gmatAwaPtile = gmatAwaPtile;
	}

	public String getGmatAwaScore() {
		return this.gmatAwaScore;
	}

	public void setGmatAwaScore(String gmatAwaScore) {
		this.gmatAwaScore = gmatAwaScore;
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

	public String getGmatQuantPtile() {
		return this.gmatQuantPtile;
	}

	public void setGmatQuantPtile(String gmatQuantPtile) {
		this.gmatQuantPtile = gmatQuantPtile;
	}

	public String getGmatQuantScore() {
		return this.gmatQuantScore;
	}

	public void setGmatQuantScore(String gmatQuantScore) {
		this.gmatQuantScore = gmatQuantScore;
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

	public String getGmatVerbPtile() {
		return this.gmatVerbPtile;
	}

	public void setGmatVerbPtile(String gmatVerbPtile) {
		this.gmatVerbPtile = gmatVerbPtile;
	}

	public String getGmatVerbScore() {
		return this.gmatVerbScore;
	}

	public void setGmatVerbScore(String gmatVerbScore) {
		this.gmatVerbScore = gmatVerbScore;
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

	public String getIntCity1() {
		return this.intCity1;
	}

	public void setIntCity1(String intCity1) {
		this.intCity1 = intCity1;
	}

	public String getIntCity2() {
		return this.intCity2;
	}

	public void setIntCity2(String intCity2) {
		this.intCity2 = intCity2;
	}

	public String getIntCity3() {
		return this.intCity3;
	}

	public void setIntCity3(String intCity3) {
		this.intCity3 = intCity3;
	}

	public String getIntCountry1() {
		return this.intCountry1;
	}

	public void setIntCountry1(String intCountry1) {
		this.intCountry1 = intCountry1;
	}

	public String getIntCountry2() {
		return this.intCountry2;
	}

	public void setIntCountry2(String intCountry2) {
		this.intCountry2 = intCountry2;
	}

	public String getIntCountry3() {
		return this.intCountry3;
	}

	public void setIntCountry3(String intCountry3) {
		this.intCountry3 = intCountry3;
	}

	public String getIntDesc1() {
		return this.intDesc1;
	}

	public void setIntDesc1(String intDesc1) {
		this.intDesc1 = intDesc1;
	}

	public String getIntDesc2() {
		return this.intDesc2;
	}

	public void setIntDesc2(String intDesc2) {
		this.intDesc2 = intDesc2;
	}

	public String getIntDesc3() {
		return this.intDesc3;
	}

	public void setIntDesc3(String intDesc3) {
		this.intDesc3 = intDesc3;
	}

	public String getIntDur1() {
		return this.intDur1;
	}

	public void setIntDur1(String intDur1) {
		this.intDur1 = intDur1;
	}

	public String getIntDur2() {
		return this.intDur2;
	}

	public void setIntDur2(String intDur2) {
		this.intDur2 = intDur2;
	}

	public String getIntDur3() {
		return this.intDur3;
	}

	public void setIntDur3(String intDur3) {
		this.intDur3 = intDur3;
	}

	public String getIntPurp1() {
		return this.intPurp1;
	}

	public void setIntPurp1(String intPurp1) {
		this.intPurp1 = intPurp1;
	}

	public String getIntPurp2() {
		return this.intPurp2;
	}

	public void setIntPurp2(String intPurp2) {
		this.intPurp2 = intPurp2;
	}

	public String getIntPurp3() {
		return this.intPurp3;
	}

	public void setIntPurp3(String intPurp3) {
		this.intPurp3 = intPurp3;
	}

	public String getIntState1() {
		return this.intState1;
	}

	public void setIntState1(String intState1) {
		this.intState1 = intState1;
	}

	public String getIntState2() {
		return this.intState2;
	}

	public void setIntState2(String intState2) {
		this.intState2 = intState2;
	}

	public String getIntState3() {
		return this.intState3;
	}

	public void setIntState3(String intState3) {
		this.intState3 = intState3;
	}

	public String getLang1() {
		return this.lang1;
	}

	public void setLang1(String lang1) {
		this.lang1 = lang1;
	}

	public String getLang2() {
		return this.lang2;
	}

	public void setLang2(String lang2) {
		this.lang2 = lang2;
	}

	public String getLang3() {
		return this.lang3;
	}

	public void setLang3(String lang3) {
		this.lang3 = lang3;
	}

	public String getLang4() {
		return this.lang4;
	}

	public void setLang4(String lang4) {
		this.lang4 = lang4;
	}

	public String getLang5() {
		return this.lang5;
	}

	public void setLang5(String lang5) {
		this.lang5 = lang5;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMailingAddr() {
		return this.mailingAddr;
	}

	public void setMailingAddr(String mailingAddr) {
		this.mailingAddr = mailingAddr;
	}

	public int getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMstrCollege1() {
		return this.mstrCollege1;
	}

	public void setMstrCollege1(String mstrCollege1) {
		this.mstrCollege1 = mstrCollege1;
	}

	public String getMstrCollege2() {
		return this.mstrCollege2;
	}

	public void setMstrCollege2(String mstrCollege2) {
		this.mstrCollege2 = mstrCollege2;
	}

	public String getMstrCollege3() {
		return this.mstrCollege3;
	}

	public void setMstrCollege3(String mstrCollege3) {
		this.mstrCollege3 = mstrCollege3;
	}

	public String getMstrDeg1() {
		return this.mstrDeg1;
	}

	public void setMstrDeg1(String mstrDeg1) {
		this.mstrDeg1 = mstrDeg1;
	}

	public String getMstrDeg2() {
		return this.mstrDeg2;
	}

	public void setMstrDeg2(String mstrDeg2) {
		this.mstrDeg2 = mstrDeg2;
	}

	public String getMstrDeg3() {
		return this.mstrDeg3;
	}

	public void setMstrDeg3(String mstrDeg3) {
		this.mstrDeg3 = mstrDeg3;
	}

	public String getMstrFrm11() {
		return this.mstrFrm11;
	}

	public void setMstrFrm11(String mstrFrm11) {
		this.mstrFrm11 = mstrFrm11;
	}

	public String getMstrFrm12() {
		return this.mstrFrm12;
	}

	public void setMstrFrm12(String mstrFrm12) {
		this.mstrFrm12 = mstrFrm12;
	}

	public String getMstrFrm13() {
		return this.mstrFrm13;
	}

	public void setMstrFrm13(String mstrFrm13) {
		this.mstrFrm13 = mstrFrm13;
	}

	public String getMstrFrm21() {
		return this.mstrFrm21;
	}

	public void setMstrFrm21(String mstrFrm21) {
		this.mstrFrm21 = mstrFrm21;
	}

	public String getMstrFrm22() {
		return this.mstrFrm22;
	}

	public void setMstrFrm22(String mstrFrm22) {
		this.mstrFrm22 = mstrFrm22;
	}

	public String getMstrFrm23() {
		return this.mstrFrm23;
	}

	public void setMstrFrm23(String mstrFrm23) {
		this.mstrFrm23 = mstrFrm23;
	}

	public String getMstrFrm31() {
		return this.mstrFrm31;
	}

	public void setMstrFrm31(String mstrFrm31) {
		this.mstrFrm31 = mstrFrm31;
	}

	public String getMstrFrm32() {
		return this.mstrFrm32;
	}

	public void setMstrFrm32(String mstrFrm32) {
		this.mstrFrm32 = mstrFrm32;
	}

	public String getMstrFrm33() {
		return this.mstrFrm33;
	}

	public void setMstrFrm33(String mstrFrm33) {
		this.mstrFrm33 = mstrFrm33;
	}

	public String getMstrFrm41() {
		return this.mstrFrm41;
	}

	public void setMstrFrm41(String mstrFrm41) {
		this.mstrFrm41 = mstrFrm41;
	}

	public String getMstrFrm42() {
		return this.mstrFrm42;
	}

	public void setMstrFrm42(String mstrFrm42) {
		this.mstrFrm42 = mstrFrm42;
	}

	public String getMstrFrm43() {
		return this.mstrFrm43;
	}

	public void setMstrFrm43(String mstrFrm43) {
		this.mstrFrm43 = mstrFrm43;
	}

	public String getMstrFrm51() {
		return this.mstrFrm51;
	}

	public void setMstrFrm51(String mstrFrm51) {
		this.mstrFrm51 = mstrFrm51;
	}

	public String getMstrFrm52() {
		return this.mstrFrm52;
	}

	public void setMstrFrm52(String mstrFrm52) {
		this.mstrFrm52 = mstrFrm52;
	}

	public String getMstrFrm53() {
		return this.mstrFrm53;
	}

	public void setMstrFrm53(String mstrFrm53) {
		this.mstrFrm53 = mstrFrm53;
	}

	public String getMstrLetGrade1() {
		return this.mstrLetGrade1;
	}

	public void setMstrLetGrade1(String mstrLetGrade1) {
		this.mstrLetGrade1 = mstrLetGrade1;
	}

	public String getMstrLetGrade2() {
		return this.mstrLetGrade2;
	}

	public void setMstrLetGrade2(String mstrLetGrade2) {
		this.mstrLetGrade2 = mstrLetGrade2;
	}

	public String getMstrLetGrade3() {
		return this.mstrLetGrade3;
	}

	public void setMstrLetGrade3(String mstrLetGrade3) {
		this.mstrLetGrade3 = mstrLetGrade3;
	}

	public String getMstrLocUniv1() {
		return this.mstrLocUniv1;
	}

	public void setMstrLocUniv1(String mstrLocUniv1) {
		this.mstrLocUniv1 = mstrLocUniv1;
	}

	public String getMstrLocUniv2() {
		return this.mstrLocUniv2;
	}

	public void setMstrLocUniv2(String mstrLocUniv2) {
		this.mstrLocUniv2 = mstrLocUniv2;
	}

	public String getMstrLocUniv3() {
		return this.mstrLocUniv3;
	}

	public void setMstrLocUniv3(String mstrLocUniv3) {
		this.mstrLocUniv3 = mstrLocUniv3;
	}

	public String getMstrLocation1() {
		return this.mstrLocation1;
	}

	public void setMstrLocation1(String mstrLocation1) {
		this.mstrLocation1 = mstrLocation1;
	}

	public String getMstrLocation2() {
		return this.mstrLocation2;
	}

	public void setMstrLocation2(String mstrLocation2) {
		this.mstrLocation2 = mstrLocation2;
	}

	public String getMstrLocation3() {
		return this.mstrLocation3;
	}

	public void setMstrLocation3(String mstrLocation3) {
		this.mstrLocation3 = mstrLocation3;
	}

	public String getMstrMarks11() {
		return this.mstrMarks11;
	}

	public void setMstrMarks11(String mstrMarks11) {
		this.mstrMarks11 = mstrMarks11;
	}

	public String getMstrMarks12() {
		return this.mstrMarks12;
	}

	public void setMstrMarks12(String mstrMarks12) {
		this.mstrMarks12 = mstrMarks12;
	}

	public String getMstrMarks13() {
		return this.mstrMarks13;
	}

	public void setMstrMarks13(String mstrMarks13) {
		this.mstrMarks13 = mstrMarks13;
	}

	public String getMstrMarks21() {
		return this.mstrMarks21;
	}

	public void setMstrMarks21(String mstrMarks21) {
		this.mstrMarks21 = mstrMarks21;
	}

	public String getMstrMarks22() {
		return this.mstrMarks22;
	}

	public void setMstrMarks22(String mstrMarks22) {
		this.mstrMarks22 = mstrMarks22;
	}

	public String getMstrMarks23() {
		return this.mstrMarks23;
	}

	public void setMstrMarks23(String mstrMarks23) {
		this.mstrMarks23 = mstrMarks23;
	}

	public String getMstrMarks31() {
		return this.mstrMarks31;
	}

	public void setMstrMarks31(String mstrMarks31) {
		this.mstrMarks31 = mstrMarks31;
	}

	public String getMstrMarks32() {
		return this.mstrMarks32;
	}

	public void setMstrMarks32(String mstrMarks32) {
		this.mstrMarks32 = mstrMarks32;
	}

	public String getMstrMarks33() {
		return this.mstrMarks33;
	}

	public void setMstrMarks33(String mstrMarks33) {
		this.mstrMarks33 = mstrMarks33;
	}

	public String getMstrMarks41() {
		return this.mstrMarks41;
	}

	public void setMstrMarks41(String mstrMarks41) {
		this.mstrMarks41 = mstrMarks41;
	}

	public String getMstrMarks42() {
		return this.mstrMarks42;
	}

	public void setMstrMarks42(String mstrMarks42) {
		this.mstrMarks42 = mstrMarks42;
	}

	public String getMstrMarks43() {
		return this.mstrMarks43;
	}

	public void setMstrMarks43(String mstrMarks43) {
		this.mstrMarks43 = mstrMarks43;
	}

	public String getMstrMarks51() {
		return this.mstrMarks51;
	}

	public void setMstrMarks51(String mstrMarks51) {
		this.mstrMarks51 = mstrMarks51;
	}

	public String getMstrMarks52() {
		return this.mstrMarks52;
	}

	public void setMstrMarks52(String mstrMarks52) {
		this.mstrMarks52 = mstrMarks52;
	}

	public String getMstrMarks53() {
		return this.mstrMarks53;
	}

	public void setMstrMarks53(String mstrMarks53) {
		this.mstrMarks53 = mstrMarks53;
	}

	public String getMstrMarksTot1() {
		return this.mstrMarksTot1;
	}

	public void setMstrMarksTot1(String mstrMarksTot1) {
		this.mstrMarksTot1 = mstrMarksTot1;
	}

	public String getMstrMarksTot2() {
		return this.mstrMarksTot2;
	}

	public void setMstrMarksTot2(String mstrMarksTot2) {
		this.mstrMarksTot2 = mstrMarksTot2;
	}

	public String getMstrMarksTot3() {
		return this.mstrMarksTot3;
	}

	public void setMstrMarksTot3(String mstrMarksTot3) {
		this.mstrMarksTot3 = mstrMarksTot3;
	}

	public String getMstrMaxMarks11() {
		return this.mstrMaxMarks11;
	}

	public void setMstrMaxMarks11(String mstrMaxMarks11) {
		this.mstrMaxMarks11 = mstrMaxMarks11;
	}

	public String getMstrMaxMarks12() {
		return this.mstrMaxMarks12;
	}

	public void setMstrMaxMarks12(String mstrMaxMarks12) {
		this.mstrMaxMarks12 = mstrMaxMarks12;
	}

	public String getMstrMaxMarks13() {
		return this.mstrMaxMarks13;
	}

	public void setMstrMaxMarks13(String mstrMaxMarks13) {
		this.mstrMaxMarks13 = mstrMaxMarks13;
	}

	public String getMstrMaxMarks21() {
		return this.mstrMaxMarks21;
	}

	public void setMstrMaxMarks21(String mstrMaxMarks21) {
		this.mstrMaxMarks21 = mstrMaxMarks21;
	}

	public String getMstrMaxMarks22() {
		return this.mstrMaxMarks22;
	}

	public void setMstrMaxMarks22(String mstrMaxMarks22) {
		this.mstrMaxMarks22 = mstrMaxMarks22;
	}

	public String getMstrMaxMarks23() {
		return this.mstrMaxMarks23;
	}

	public void setMstrMaxMarks23(String mstrMaxMarks23) {
		this.mstrMaxMarks23 = mstrMaxMarks23;
	}

	public String getMstrMaxMarks31() {
		return this.mstrMaxMarks31;
	}

	public void setMstrMaxMarks31(String mstrMaxMarks31) {
		this.mstrMaxMarks31 = mstrMaxMarks31;
	}

	public String getMstrMaxMarks32() {
		return this.mstrMaxMarks32;
	}

	public void setMstrMaxMarks32(String mstrMaxMarks32) {
		this.mstrMaxMarks32 = mstrMaxMarks32;
	}

	public String getMstrMaxMarks33() {
		return this.mstrMaxMarks33;
	}

	public void setMstrMaxMarks33(String mstrMaxMarks33) {
		this.mstrMaxMarks33 = mstrMaxMarks33;
	}

	public String getMstrMaxMarks41() {
		return this.mstrMaxMarks41;
	}

	public void setMstrMaxMarks41(String mstrMaxMarks41) {
		this.mstrMaxMarks41 = mstrMaxMarks41;
	}

	public String getMstrMaxMarks42() {
		return this.mstrMaxMarks42;
	}

	public void setMstrMaxMarks42(String mstrMaxMarks42) {
		this.mstrMaxMarks42 = mstrMaxMarks42;
	}

	public String getMstrMaxMarks43() {
		return this.mstrMaxMarks43;
	}

	public void setMstrMaxMarks43(String mstrMaxMarks43) {
		this.mstrMaxMarks43 = mstrMaxMarks43;
	}

	public String getMstrMaxMarks51() {
		return this.mstrMaxMarks51;
	}

	public void setMstrMaxMarks51(String mstrMaxMarks51) {
		this.mstrMaxMarks51 = mstrMaxMarks51;
	}

	public String getMstrMaxMarks52() {
		return this.mstrMaxMarks52;
	}

	public void setMstrMaxMarks52(String mstrMaxMarks52) {
		this.mstrMaxMarks52 = mstrMaxMarks52;
	}

	public String getMstrMaxMarks53() {
		return this.mstrMaxMarks53;
	}

	public void setMstrMaxMarks53(String mstrMaxMarks53) {
		this.mstrMaxMarks53 = mstrMaxMarks53;
	}

	public String getMstrMaxMarksTot1() {
		return this.mstrMaxMarksTot1;
	}

	public void setMstrMaxMarksTot1(String mstrMaxMarksTot1) {
		this.mstrMaxMarksTot1 = mstrMaxMarksTot1;
	}

	public String getMstrMaxMarksTot2() {
		return this.mstrMaxMarksTot2;
	}

	public void setMstrMaxMarksTot2(String mstrMaxMarksTot2) {
		this.mstrMaxMarksTot2 = mstrMaxMarksTot2;
	}

	public String getMstrMaxMarksTot3() {
		return this.mstrMaxMarksTot3;
	}

	public void setMstrMaxMarksTot3(String mstrMaxMarksTot3) {
		this.mstrMaxMarksTot3 = mstrMaxMarksTot3;
	}

	public String getMstrPcnt11() {
		return this.mstrPcnt11;
	}

	public void setMstrPcnt11(String mstrPcnt11) {
		this.mstrPcnt11 = mstrPcnt11;
	}

	public String getMstrPcnt12() {
		return this.mstrPcnt12;
	}

	public void setMstrPcnt12(String mstrPcnt12) {
		this.mstrPcnt12 = mstrPcnt12;
	}

	public String getMstrPcnt13() {
		return this.mstrPcnt13;
	}

	public void setMstrPcnt13(String mstrPcnt13) {
		this.mstrPcnt13 = mstrPcnt13;
	}

	public String getMstrPcnt21() {
		return this.mstrPcnt21;
	}

	public void setMstrPcnt21(String mstrPcnt21) {
		this.mstrPcnt21 = mstrPcnt21;
	}

	public String getMstrPcnt22() {
		return this.mstrPcnt22;
	}

	public void setMstrPcnt22(String mstrPcnt22) {
		this.mstrPcnt22 = mstrPcnt22;
	}

	public String getMstrPcnt23() {
		return this.mstrPcnt23;
	}

	public void setMstrPcnt23(String mstrPcnt23) {
		this.mstrPcnt23 = mstrPcnt23;
	}

	public String getMstrPcnt31() {
		return this.mstrPcnt31;
	}

	public void setMstrPcnt31(String mstrPcnt31) {
		this.mstrPcnt31 = mstrPcnt31;
	}

	public String getMstrPcnt32() {
		return this.mstrPcnt32;
	}

	public void setMstrPcnt32(String mstrPcnt32) {
		this.mstrPcnt32 = mstrPcnt32;
	}

	public String getMstrPcnt33() {
		return this.mstrPcnt33;
	}

	public void setMstrPcnt33(String mstrPcnt33) {
		this.mstrPcnt33 = mstrPcnt33;
	}

	public String getMstrPcnt41() {
		return this.mstrPcnt41;
	}

	public void setMstrPcnt41(String mstrPcnt41) {
		this.mstrPcnt41 = mstrPcnt41;
	}

	public String getMstrPcnt42() {
		return this.mstrPcnt42;
	}

	public void setMstrPcnt42(String mstrPcnt42) {
		this.mstrPcnt42 = mstrPcnt42;
	}

	public String getMstrPcnt43() {
		return this.mstrPcnt43;
	}

	public void setMstrPcnt43(String mstrPcnt43) {
		this.mstrPcnt43 = mstrPcnt43;
	}

	public String getMstrPcnt51() {
		return this.mstrPcnt51;
	}

	public void setMstrPcnt51(String mstrPcnt51) {
		this.mstrPcnt51 = mstrPcnt51;
	}

	public String getMstrPcnt52() {
		return this.mstrPcnt52;
	}

	public void setMstrPcnt52(String mstrPcnt52) {
		this.mstrPcnt52 = mstrPcnt52;
	}

	public String getMstrPcnt53() {
		return this.mstrPcnt53;
	}

	public void setMstrPcnt53(String mstrPcnt53) {
		this.mstrPcnt53 = mstrPcnt53;
	}

	public String getMstrPcntTot1() {
		return this.mstrPcntTot1;
	}

	public void setMstrPcntTot1(String mstrPcntTot1) {
		this.mstrPcntTot1 = mstrPcntTot1;
	}

	public String getMstrPcntTot2() {
		return this.mstrPcntTot2;
	}

	public void setMstrPcntTot2(String mstrPcntTot2) {
		this.mstrPcntTot2 = mstrPcntTot2;
	}

	public String getMstrPcntTot3() {
		return this.mstrPcntTot3;
	}

	public void setMstrPcntTot3(String mstrPcntTot3) {
		this.mstrPcntTot3 = mstrPcntTot3;
	}

	public String getMstrSub1() {
		return this.mstrSub1;
	}

	public void setMstrSub1(String mstrSub1) {
		this.mstrSub1 = mstrSub1;
	}

	public String getMstrSub2() {
		return this.mstrSub2;
	}

	public void setMstrSub2(String mstrSub2) {
		this.mstrSub2 = mstrSub2;
	}

	public String getMstrSub3() {
		return this.mstrSub3;
	}

	public void setMstrSub3(String mstrSub3) {
		this.mstrSub3 = mstrSub3;
	}

	public String getMstrTo11() {
		return this.mstrTo11;
	}

	public void setMstrTo11(String mstrTo11) {
		this.mstrTo11 = mstrTo11;
	}

	public String getMstrTo12() {
		return this.mstrTo12;
	}

	public void setMstrTo12(String mstrTo12) {
		this.mstrTo12 = mstrTo12;
	}

	public String getMstrTo13() {
		return this.mstrTo13;
	}

	public void setMstrTo13(String mstrTo13) {
		this.mstrTo13 = mstrTo13;
	}

	public String getMstrTo21() {
		return this.mstrTo21;
	}

	public void setMstrTo21(String mstrTo21) {
		this.mstrTo21 = mstrTo21;
	}

	public String getMstrTo22() {
		return this.mstrTo22;
	}

	public void setMstrTo22(String mstrTo22) {
		this.mstrTo22 = mstrTo22;
	}

	public String getMstrTo23() {
		return this.mstrTo23;
	}

	public void setMstrTo23(String mstrTo23) {
		this.mstrTo23 = mstrTo23;
	}

	public String getMstrTo31() {
		return this.mstrTo31;
	}

	public void setMstrTo31(String mstrTo31) {
		this.mstrTo31 = mstrTo31;
	}

	public String getMstrTo32() {
		return this.mstrTo32;
	}

	public void setMstrTo32(String mstrTo32) {
		this.mstrTo32 = mstrTo32;
	}

	public String getMstrTo33() {
		return this.mstrTo33;
	}

	public void setMstrTo33(String mstrTo33) {
		this.mstrTo33 = mstrTo33;
	}

	public String getMstrTo41() {
		return this.mstrTo41;
	}

	public void setMstrTo41(String mstrTo41) {
		this.mstrTo41 = mstrTo41;
	}

	public String getMstrTo42() {
		return this.mstrTo42;
	}

	public void setMstrTo42(String mstrTo42) {
		this.mstrTo42 = mstrTo42;
	}

	public String getMstrTo43() {
		return this.mstrTo43;
	}

	public void setMstrTo43(String mstrTo43) {
		this.mstrTo43 = mstrTo43;
	}

	public String getMstrTo51() {
		return this.mstrTo51;
	}

	public void setMstrTo51(String mstrTo51) {
		this.mstrTo51 = mstrTo51;
	}

	public String getMstrTo52() {
		return this.mstrTo52;
	}

	public void setMstrTo52(String mstrTo52) {
		this.mstrTo52 = mstrTo52;
	}

	public String getMstrTo53() {
		return this.mstrTo53;
	}

	public void setMstrTo53(String mstrTo53) {
		this.mstrTo53 = mstrTo53;
	}

	public String getMstrUniv1() {
		return this.mstrUniv1;
	}

	public void setMstrUniv1(String mstrUniv1) {
		this.mstrUniv1 = mstrUniv1;
	}

	public String getMstrUniv2() {
		return this.mstrUniv2;
	}

	public void setMstrUniv2(String mstrUniv2) {
		this.mstrUniv2 = mstrUniv2;
	}

	public String getMstrUniv3() {
		return this.mstrUniv3;
	}

	public void setMstrUniv3(String mstrUniv3) {
		this.mstrUniv3 = mstrUniv3;
	}

	public String getNameEmp1() {
		return this.nameEmp1;
	}

	public void setNameEmp1(String nameEmp1) {
		this.nameEmp1 = nameEmp1;
	}

	public String getNameEmp2() {
		return this.nameEmp2;
	}

	public void setNameEmp2(String nameEmp2) {
		this.nameEmp2 = nameEmp2;
	}

	public String getNameEmp3() {
		return this.nameEmp3;
	}

	public void setNameEmp3(String nameEmp3) {
		this.nameEmp3 = nameEmp3;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNumMnths1() {
		return this.numMnths1;
	}

	public void setNumMnths1(String numMnths1) {
		this.numMnths1 = numMnths1;
	}

	public String getNumMnths2() {
		return this.numMnths2;
	}

	public void setNumMnths2(String numMnths2) {
		this.numMnths2 = numMnths2;
	}

	public String getNumMnths3() {
		return this.numMnths3;
	}

	public void setNumMnths3(String numMnths3) {
		this.numMnths3 = numMnths3;
	}

	public int getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getPhoneEmp1() {
		return this.phoneEmp1;
	}

	public void setPhoneEmp1(String phoneEmp1) {
		this.phoneEmp1 = phoneEmp1;
	}

	public String getPhoneEmp2() {
		return this.phoneEmp2;
	}

	public void setPhoneEmp2(String phoneEmp2) {
		this.phoneEmp2 = phoneEmp2;
	}

	public String getPhoneEmp3() {
		return this.phoneEmp3;
	}

	public void setPhoneEmp3(String phoneEmp3) {
		this.phoneEmp3 = phoneEmp3;
	}

	public String getPhoneHome() {
		return this.phoneHome;
	}

	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}

	public String getPhoneMobile() {
		return this.phoneMobile;
	}

	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public String getPhoneOffice() {
		return this.phoneOffice;
	}

	public void setPhoneOffice(String phoneOffice) {
		this.phoneOffice = phoneOffice;
	}

	public byte[] getPhotograph() {
		return this.photograph;
	}

	public void setPhotograph(byte[] photograph) {
		this.photograph = photograph;
	}

	public int getPhotosize() {
		return this.photosize;
	}

	public void setPhotosize(int photosize) {
		this.photosize = photosize;
	}

	public String getPhototype() {
		return this.phototype;
	}

	public void setPhototype(String phototype) {
		this.phototype = phototype;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPref1() {
		return this.pref1;
	}

	public void setPref1(String pref1) {
		this.pref1 = pref1;
	}

	public String getPref2() {
		return this.pref2;
	}

	public void setPref2(String pref2) {
		this.pref2 = pref2;
	}

	public String getProfClass1() {
		return this.profClass1;
	}

	public void setProfClass1(String profClass1) {
		this.profClass1 = profClass1;
	}

	public String getProfClass2() {
		return this.profClass2;
	}

	public void setProfClass2(String profClass2) {
		this.profClass2 = profClass2;
	}

	public String getProfClass3() {
		return this.profClass3;
	}

	public void setProfClass3(String profClass3) {
		this.profClass3 = profClass3;
	}

	public String getProfDeg1() {
		return this.profDeg1;
	}

	public void setProfDeg1(String profDeg1) {
		this.profDeg1 = profDeg1;
	}

	public String getProfDeg2() {
		return this.profDeg2;
	}

	public void setProfDeg2(String profDeg2) {
		this.profDeg2 = profDeg2;
	}

	public String getProfDeg3() {
		return this.profDeg3;
	}

	public void setProfDeg3(String profDeg3) {
		this.profDeg3 = profDeg3;
	}

	public String getProfInst1() {
		return this.profInst1;
	}

	public void setProfInst1(String profInst1) {
		this.profInst1 = profInst1;
	}

	public String getProfInst2() {
		return this.profInst2;
	}

	public void setProfInst2(String profInst2) {
		this.profInst2 = profInst2;
	}

	public String getProfInst3() {
		return this.profInst3;
	}

	public void setProfInst3(String profInst3) {
		this.profInst3 = profInst3;
	}

	public String getProfLoc1() {
		return this.profLoc1;
	}

	public void setProfLoc1(String profLoc1) {
		this.profLoc1 = profLoc1;
	}

	public String getProfLoc2() {
		return this.profLoc2;
	}

	public void setProfLoc2(String profLoc2) {
		this.profLoc2 = profLoc2;
	}

	public String getProfLoc3() {
		return this.profLoc3;
	}

	public void setProfLoc3(String profLoc3) {
		this.profLoc3 = profLoc3;
	}

	public String getProfMarks1() {
		return this.profMarks1;
	}

	public void setProfMarks1(String profMarks1) {
		this.profMarks1 = profMarks1;
	}

	public String getProfMarks2() {
		return this.profMarks2;
	}

	public void setProfMarks2(String profMarks2) {
		this.profMarks2 = profMarks2;
	}

	public String getProfMarks3() {
		return this.profMarks3;
	}

	public void setProfMarks3(String profMarks3) {
		this.profMarks3 = profMarks3;
	}

	public String getProfMax1() {
		return this.profMax1;
	}

	public void setProfMax1(String profMax1) {
		this.profMax1 = profMax1;
	}

	public String getProfMax2() {
		return this.profMax2;
	}

	public void setProfMax2(String profMax2) {
		this.profMax2 = profMax2;
	}

	public String getProfMax3() {
		return this.profMax3;
	}

	public void setProfMax3(String profMax3) {
		this.profMax3 = profMax3;
	}

	public String getProfMnth1() {
		return this.profMnth1;
	}

	public void setProfMnth1(String profMnth1) {
		this.profMnth1 = profMnth1;
	}

	public String getProfMnth2() {
		return this.profMnth2;
	}

	public void setProfMnth2(String profMnth2) {
		this.profMnth2 = profMnth2;
	}

	public String getProfMnth3() {
		return this.profMnth3;
	}

	public void setProfMnth3(String profMnth3) {
		this.profMnth3 = profMnth3;
	}

	public String getProfPcnt1() {
		return this.profPcnt1;
	}

	public void setProfPcnt1(String profPcnt1) {
		this.profPcnt1 = profPcnt1;
	}

	public String getProfPcnt2() {
		return this.profPcnt2;
	}

	public void setProfPcnt2(String profPcnt2) {
		this.profPcnt2 = profPcnt2;
	}

	public String getProfPcnt3() {
		return this.profPcnt3;
	}

	public void setProfPcnt3(String profPcnt3) {
		this.profPcnt3 = profPcnt3;
	}

	public int getPursuingdegree() {
		return this.pursuingdegree;
	}

	public void setPursuingdegree(int pursuingdegree) {
		this.pursuingdegree = pursuingdegree;
	}

	public String getRegno() {
		return this.regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getRoleEmp1() {
		return this.roleEmp1;
	}

	public void setRoleEmp1(String roleEmp1) {
		this.roleEmp1 = roleEmp1;
	}

	public String getRoleEmp2() {
		return this.roleEmp2;
	}

	public void setRoleEmp2(String roleEmp2) {
		this.roleEmp2 = roleEmp2;
	}

	public String getRoleEmp3() {
		return this.roleEmp3;
	}

	public void setRoleEmp3(String roleEmp3) {
		this.roleEmp3 = roleEmp3;
	}

	public String getSalaryEmp1() {
		return this.salaryEmp1;
	}

	public void setSalaryEmp1(String salaryEmp1) {
		this.salaryEmp1 = salaryEmp1;
	}

	public String getSalaryEmp2() {
		return this.salaryEmp2;
	}

	public void setSalaryEmp2(String salaryEmp2) {
		this.salaryEmp2 = salaryEmp2;
	}

	public String getSalaryEmp3() {
		return this.salaryEmp3;
	}

	public void setSalaryEmp3(String salaryEmp3) {
		this.salaryEmp3 = salaryEmp3;
	}

	public String getSchool10() {
		return this.school10;
	}

	public void setSchool10(String school10) {
		this.school10 = school10;
	}

	public String getSchool10ClassDiv() {
		return this.school10ClassDiv;
	}

	public void setSchool10ClassDiv(String school10ClassDiv) {
		this.school10ClassDiv = school10ClassDiv;
	}

	public String getSchool10Institute() {
		return this.school10Institute;
	}

	public void setSchool10Institute(String school10Institute) {
		this.school10Institute = school10Institute;
	}

	public String getSchool10LocaltionInst() {
		return this.school10LocaltionInst;
	}

	public void setSchool10LocaltionInst(String school10LocaltionInst) {
		this.school10LocaltionInst = school10LocaltionInst;
	}

	public String getSchool10LocaltionUniv() {
		return this.school10LocaltionUniv;
	}

	public void setSchool10LocaltionUniv(String school10LocaltionUniv) {
		this.school10LocaltionUniv = school10LocaltionUniv;
	}

	public String getSchool10Marks() {
		return this.school10Marks;
	}

	public void setSchool10Marks(String school10Marks) {
		this.school10Marks = school10Marks;
	}

	public String getSchool10MaxMarks() {
		return this.school10MaxMarks;
	}

	public void setSchool10MaxMarks(String school10MaxMarks) {
		this.school10MaxMarks = school10MaxMarks;
	}

	public String getSchool10Passing() {
		return this.school10Passing;
	}

	public void setSchool10Passing(String school10Passing) {
		this.school10Passing = school10Passing;
	}

	public String getSchool10Percentage() {
		return this.school10Percentage;
	}

	public void setSchool10Percentage(String school10Percentage) {
		this.school10Percentage = school10Percentage;
	}

	public String getSchool10Univ() {
		return this.school10Univ;
	}

	public void setSchool10Univ(String school10Univ) {
		this.school10Univ = school10Univ;
	}

	public String getSchool12() {
		return this.school12;
	}

	public void setSchool12(String school12) {
		this.school12 = school12;
	}

	public String getSchool12ClassDiv() {
		return this.school12ClassDiv;
	}

	public void setSchool12ClassDiv(String school12ClassDiv) {
		this.school12ClassDiv = school12ClassDiv;
	}

	public String getSchool12Institute() {
		return this.school12Institute;
	}

	public void setSchool12Institute(String school12Institute) {
		this.school12Institute = school12Institute;
	}

	public String getSchool12LocaltionInst() {
		return this.school12LocaltionInst;
	}

	public void setSchool12LocaltionInst(String school12LocaltionInst) {
		this.school12LocaltionInst = school12LocaltionInst;
	}

	public String getSchool12LocaltionUniv() {
		return this.school12LocaltionUniv;
	}

	public void setSchool12LocaltionUniv(String school12LocaltionUniv) {
		this.school12LocaltionUniv = school12LocaltionUniv;
	}

	public String getSchool12Major1() {
		return this.school12Major1;
	}

	public void setSchool12Major1(String school12Major1) {
		this.school12Major1 = school12Major1;
	}

	public String getSchool12Major2() {
		return this.school12Major2;
	}

	public void setSchool12Major2(String school12Major2) {
		this.school12Major2 = school12Major2;
	}

	public String getSchool12Major3() {
		return this.school12Major3;
	}

	public void setSchool12Major3(String school12Major3) {
		this.school12Major3 = school12Major3;
	}

	public String getSchool12Marks() {
		return this.school12Marks;
	}

	public void setSchool12Marks(String school12Marks) {
		this.school12Marks = school12Marks;
	}

	public String getSchool12MaxMarks() {
		return this.school12MaxMarks;
	}

	public void setSchool12MaxMarks(String school12MaxMarks) {
		this.school12MaxMarks = school12MaxMarks;
	}

	public String getSchool12Passing() {
		return this.school12Passing;
	}

	public void setSchool12Passing(String school12Passing) {
		this.school12Passing = school12Passing;
	}

	public String getSchool12Percentage() {
		return this.school12Percentage;
	}

	public void setSchool12Percentage(String school12Percentage) {
		this.school12Percentage = school12Percentage;
	}

	public String getSchool12Univ() {
		return this.school12Univ;
	}

	public void setSchool12Univ(String school12Univ) {
		this.school12Univ = school12Univ;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getTerms() {
		return this.terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public String getToDt1() {
		return this.toDt1;
	}

	public void setToDt1(String toDt1) {
		this.toDt1 = toDt1;
	}

	public String getToDt2() {
		return this.toDt2;
	}

	public void setToDt2(String toDt2) {
		this.toDt2 = toDt2;
	}

	public String getToDt3() {
		return this.toDt3;
	}

	public void setToDt3(String toDt3) {
		this.toDt3 = toDt3;
	}

	public String getTotExp() {
		return this.totExp;
	}

	public void setTotExp(String totExp) {
		this.totExp = totExp;
	}

	public String getTotMgr() {
		return this.totMgr;
	}

	public void setTotMgr(String totMgr) {
		this.totMgr = totMgr;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}