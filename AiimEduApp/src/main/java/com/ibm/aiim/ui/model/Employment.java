
package com.ibm.aiim.ui.model;

import java.util.HashMap;
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
    "we_from_month",
    "we_to_month",
    "we_from_year",
    "we_to_year",
    "totalMonths",
    "cmpName",
    "cmpAd1",
    "cmpAd2",
    "cmpState",
    "cmpCity",
    "cmpPinCode",
    "designation",
    "roles",		
    "ctc"
})
public class Employment {
	@JsonProperty("we_from_year")
    public String getWeFromYear() {
		return weFromYear;
	}
	@JsonProperty("we_from_year")
	public void setWeFromYear(String weFromYear) {
		this.weFromYear = weFromYear;
	}
	 @JsonProperty("we_to_year")
	public String getWeToYear() {
		return weToYear;
	}
	 @JsonProperty("we_to_year")
	public void setWeToYear(String weToYear) {
		this.weToYear = weToYear;
	}

	@JsonProperty("we_from_month")
    private String weFromMonth;
    @JsonProperty("we_to_month")
    private String weToMonth;
    @JsonProperty("we_from_year")
    private String weFromYear;
    @JsonProperty("we_to_year")
    private String weToYear;
    
    
    @JsonProperty("totalMonths")
    private String totalMonths;
    @JsonProperty("cmpName")
    private String cmpName;
    @JsonProperty("cmpAd1")
    private String cmpAd1;
    @JsonProperty("cmpAd2")
    private String cmpAd2;
    @JsonProperty("cmpState")
    private String cmpState;
    @JsonProperty("cmpCity")
    private String cmpCity;
    @JsonProperty("cmpPinCode")
    private String cmpPinCode;
    @JsonProperty("designation")
    private String designation;
    @JsonProperty("roles")
    private String roles;
    @JsonProperty("ctc")
    private String ctc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The weFromMonth
     */
    @JsonProperty("we_from_month")
    public String getWeFromMonth() {
        return weFromMonth;
    }

    /**
     * 
     * @param weFromMonth
     *     The we_from_month
     */
    @JsonProperty("we_from_month")
    public void setWeFromMonth(String weFromMonth) {
        this.weFromMonth = weFromMonth;
    }

    /**
     * 
     * @return
     *     The weToMonth
     */
    @JsonProperty("we_to_month")
    public String getWeToMonth() {
        return weToMonth;
    }

    /**
     * 
     * @param weToMonth
     *     The we_to_month
     */
    @JsonProperty("we_to_month")
    public void setWeToMonth(String weToMonth) {
        this.weToMonth = weToMonth;
    }

    /**
     * 
     * @return
     *     The totalMonths
     */
    @JsonProperty("totalMonths")
    public String getTotalMonths() {
        return totalMonths;
    }

    /**
     * 
     * @param totalMonths
     *     The totalMonths
     */
    @JsonProperty("totalMonths")
    public void setTotalMonths(String totalMonths) {
        this.totalMonths = totalMonths;
    }

    /**
     * 
     * @return
     *     The cmpName
     */
    @JsonProperty("cmpName")
    public String getCmpName() {
        return cmpName;
    }

    /**
     * 
     * @param cmpName
     *     The cmpName
     */
    @JsonProperty("cmpName")
    public void setCmpName(String cmpName) {
        this.cmpName = cmpName;
    }

    /**
     * 
     * @return
     *     The cmpAd1
     */
    @JsonProperty("cmpAd1")
    public String getCmpAd1() {
        return cmpAd1;
    }

    /**
     * 
     * @param cmpAd1
     *     The cmpAd1
     */
    @JsonProperty("cmpAd1")
    public void setCmpAd1(String cmpAd1) {
        this.cmpAd1 = cmpAd1;
    }

    /**
     * 
     * @return
     *     The cmpAd2
     */
    @JsonProperty("cmpAd2")
    public String getCmpAd2() {
        return cmpAd2;
    }

    /**
     * 
     * @param cmpAd2
     *     The cmpAd2
     */
    @JsonProperty("cmpAd2")
    public void setCmpAd2(String cmpAd2) {
        this.cmpAd2 = cmpAd2;
    }

    /**
     * 
     * @return
     *     The cmpState
     */
    @JsonProperty("cmpState")
    public String getCmpState() {
        return cmpState;
    }

    /**
     * 
     * @param cmpState
     *     The cmpState
     */
    @JsonProperty("cmpState")
    public void setCmpState(String cmpState) {
        this.cmpState = cmpState;
    }

    /**
     * 
     * @return
     *     The cmpCity
     */
    @JsonProperty("cmpCity")
    public String getCmpCity() {
        return cmpCity;
    }

    /**
     * 
     * @param cmpCity
     *     The cmpCity
     */
    @JsonProperty("cmpCity")
    public void setCmpCity(String cmpCity) {
        this.cmpCity = cmpCity;
    }

    /**
     * 
     * @return
     *     The cmpPinCode
     */
    @JsonProperty("cmpPinCode")
    public String getCmpPinCode() {
        return cmpPinCode;
    }

    /**
     * 
     * @param cmpPinCode
     *     The cmpPinCode
     */
    @JsonProperty("cmpPinCode")
    public void setCmpPinCode(String cmpPinCode) {
        this.cmpPinCode = cmpPinCode;
    }

    /**
     * 
     * @return
     *     The designation
     */
    @JsonProperty("designation")
    public String getDesignation() {
        return designation;
    }

    /**
     * 
     * @param designation
     *     The designation
     */
    @JsonProperty("designation")
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * 
     * @return
     *     The roles
     */
    @JsonProperty("roles")
    public String getRoles() {
        return roles;
    }

    /**
     * 
     * @param roles
     *     The roles
     */
    @JsonProperty("roles")
    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * 
     * @return
     *     The ctc
     */
    @JsonProperty("ctc")
    public String getCtc() {
        return ctc;
    }

    /**
     * 
     * @param ctc
     *     The ctc
     */
    @JsonProperty("ctc")
    public void setCtc(String ctc) {
        this.ctc = ctc;
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
