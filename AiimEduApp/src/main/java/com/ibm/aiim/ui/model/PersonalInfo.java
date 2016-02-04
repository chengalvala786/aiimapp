
package com.ibm.aiim.ui.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	 "languages",
    "fName",
    "lName",
    "country",
    "ad1",
    "ad2",
    "state",
    "city",
    "pincode",
    "mobileNumber",
    "mName",
    "gender",
    "dob",
    "maritalstatus",
    "languages",
    "emailId",
    "stdCode",
    "photo",
    "number",
    "password",
    "primaryLang",
    "nationality",
    "category"
    
    
})
public class PersonalInfo {
	@JsonProperty("languages")
    private List<Language> languages = new ArrayList<Language>();
    @JsonProperty("fName")
    private String fName;
    @JsonProperty("lName")
    private String lName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("ad1")
    private String ad1;
    @JsonProperty("ad2")
    private String ad2;
    @JsonProperty("state")
    private String state;
    @JsonProperty("city")
    private String city;
    @JsonProperty("pincode")
    private String pincode;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("regno")
    private String regno;
    @JsonProperty("status")
    private String status;
    @JsonProperty("dt_created")
    private String dt_created;
    
    
    @JsonProperty("dt_created")
    public String getDt_created() {
		return dt_created;
	}
    @JsonProperty("dt_created")
	public void setDt_created(String dt_created) {
		this.dt_created = dt_created;
	}
	@JsonProperty("status")
    public String getStatus() {
		return status;
	}
    @JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}
	@JsonProperty("regno") 
    public String getRegno() {
		return regno;
	}
    @JsonProperty("regno")
	public void setRegno(String regno) {
		this.regno = regno;
	}

	@JsonProperty("mName")
    private String mName;
    
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("category")
    private String category;
    @JsonProperty("category") 
    public String getCategory() {
		return category;
	}
    @JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("nationality")
    private String nationality;
    
    @JsonProperty("nationality")
    public String getNationality() {
		return nationality;
	}
    @JsonProperty("nationality")
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@JsonProperty("dob")
    private String dob;
	
    @JsonProperty("maritalstatus")
    private String maritalStatus;
  
    @JsonProperty("emailId")
    private String emailId;
    @JsonProperty("stdCode")
    private String stdCode;
    @JsonProperty("number")
    private String number;
    
    @JsonProperty("password")
    private String password;

	
    
    
    
    @JsonProperty("password")
    public String getPassword() {
		return password;
	}
    @JsonProperty("password")
    public void setPassword(String password) {
		this.password = password;
	}
    @JsonIgnore
	@JsonProperty("photo")
    private byte[] photo;
	
	private String photoType;
    
    public String getPhotoType() {
		return photoType;
	}
	public void setPhotoType(String photoType) {
		this.photoType = photoType;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	 @JsonIgnore
	@JsonProperty("photo")
    public byte[] getPhoto() {
		return photo;
	}
    @JsonIgnore
    @JsonProperty("photo")
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
    /**
     * 
     * @return
     *     The languages
     */
    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    /**
     * 
     * @param languages
     *     The languages
     */
    @JsonProperty("languages")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
	/**
     * 
     * @return
     *     The fName
     */
    @JsonProperty("fName")
    public String getFName() {
        return fName;
    }

    /**
     * 
     * @param fName
     *     The fName
     */
    @JsonProperty("fName")
    public void setFName(String fName) {
        this.fName = fName;
    }

    /**
     * 
     * @return
     *     The lName
     */
    @JsonProperty("lName")
    public String getLName() {
        return lName;
    }

    /**
     * 
     * @param lName
     *     The lName
     */
    @JsonProperty("lName")
    public void setLName(String lName) {
        this.lName = lName;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The ad1
     */
    @JsonProperty("ad1")
    public String getAd1() {
        return ad1;
    }

    /**
     * 
     * @param ad1
     *     The ad1
     */
    @JsonProperty("ad1")
    public void setAd1(String ad1) {
        this.ad1 = ad1;
    }

    /**
     * 
     * @return
     *     The ad2
     */
    @JsonProperty("ad2")
    public String getAd2() {
        return ad2;
    }

    /**
     * 
     * @param ad2
     *     The ad2
     */
    @JsonProperty("ad2")
    public void setAd2(String ad2) {
        this.ad2 = ad2;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The pincode
     */
    @JsonProperty("pincode")
    public String getPincode() {
        return pincode;
    }

    /**
     * 
     * @param pincode
     *     The pincode
     */
    @JsonProperty("pincode")
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * 
     * @return
     *     The mobileNumber
     */
    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * 
     * @param mobileNumber
     *     The mobileNumber
     */
    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * 
     * @return
     *     The mName
     */
    @JsonProperty("mName")
    public String getMName() {
        return mName;
    }

    /**
     * 
     * @param mName
     *     The mName
     */
    @JsonProperty("mName")
    public void setMName(String mName) {
        this.mName = mName;
    }

    /**
     * 
     * @return
     *     The gender
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The dob
     */
    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    /**
     * 
     * @param dob
     *     The dob
     */
    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * 
     * @return
     *     The maritalStatus
     */
    @JsonProperty("maritalstatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 
     * @param maritalStatus
     *     The maritalStatus
     */
    @JsonProperty("maritalstatus")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    

    /**
     * 
     * @return
     *     The emailId
     */
    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    /**
     * 
     * @param emailId
     *     The emailId
     */
    @JsonProperty("emailId")
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * 
     * @return
     *     The stdCode
     */
    @JsonProperty("stdCode")
    public String getStdCode() {
        return stdCode;
    }

    /**
     * 
     * @param stdCode
     *     The stdCode
     */
    @JsonProperty("stdCode")
    public void setStdCode(String stdCode) {
        this.stdCode = stdCode;
    }

    /**
     * 
     * @return
     *     The number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
