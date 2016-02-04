
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
	"name",
	"obtained",
	"subject",
	"college",
	"university",
	"from_month",
	"maxmarks",
	
	"marks",
	"division",
	"to_month"
	
	
})
public class Gd {

	@JsonProperty("name")
	private String name;
	@JsonProperty("obtained")
	private String obtained;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("college")
	private String college;
	@JsonProperty("university")
	private String university;
	@JsonProperty("from_month")
	private String fromMonth;
	@JsonProperty("from_year")
	private String fromYear;
	@JsonProperty("marks")
	private String marks;
	@JsonProperty("maxmarks")
	private String maxmarks;
	
	

	@JsonProperty("division")
	private String division;
	@JsonProperty("to_month")
	private String toMonth;
	@JsonProperty("to_year")
	private String toYear;

	@JsonProperty("maxmarks")
	public String getMaxmarks() {
		return maxmarks;
	}
	@JsonProperty("maxmarks")
	public void setMaxmarks(String maxmarks) {
		this.maxmarks = maxmarks;
	}
	
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("from_year")
	public String getFromYear() {
		return fromYear;
	}
	@JsonProperty("from_year")
	public void setFromYear(String fromYear) {
		this.fromYear = fromYear;
	}



	@JsonProperty("to_year")
	public String getToYear() {
		return toYear;
	}
	@JsonProperty("to_year")
	public void setToYear(String toYear) {
		this.toYear = toYear;
	}


	/**
	 * 
	 * @return
	 *     The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *     The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 *     The obtained
	 */
	@JsonProperty("obtained")
	public String getObtained() {
		return obtained;
	}

	/**
	 * 
	 * @param obtained
	 *     The obtained
	 */
	@JsonProperty("obtained")
	public void setObtained(String obtained) {
		this.obtained = obtained;
	}

	/**
	 * 
	 * @return
	 *     The subject
	 */
	@JsonProperty("subject")
	public String getSubject() {
		return subject;
	}

	/**
	 * 
	 * @param subject
	 *     The subject
	 */
	@JsonProperty("subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 
	 * @return
	 *     The college
	 */
	@JsonProperty("college")
	public String getCollege() {
		return college;
	}

	/**
	 * 
	 * @param college
	 *     The college
	 */
	@JsonProperty("college")
	public void setCollege(String college) {
		this.college = college;
	}

	/**
	 * 
	 * @return
	 *     The university
	 */
	@JsonProperty("university")
	public String getUniversity() {
		return university;
	}

	/**
	 * 
	 * @param university
	 *     The university
	 */
	@JsonProperty("university")
	public void setUniversity(String university) {
		this.university = university;
	}

	/**
	 * 
	 * @return
	 *     The fromMonth
	 */
	@JsonProperty("from_month")
	public String getFromMonth() {
		return fromMonth;
	}

	/**
	 * 
	 * @param fromMonth
	 *     The from_month
	 */
	@JsonProperty("from_month")
	public void setFromMonth(String fromMonth) {
		this.fromMonth = fromMonth;
	}

	/**
	 * 
	 * @return
	 *     The marks
	 */
	@JsonProperty("marks")
	public String getMarks() {
		return marks;
	}

	/**
	 * 
	 * @param marks
	 *     The marks
	 */
	@JsonProperty("marks")
	public void setMarks(String marks) {
		this.marks = marks;
	}

	/**
	 * 
	 * @return
	 *     The division
	 */
	@JsonProperty("division")
	public String getDivision() {
		return division;
	}

	/**
	 * 
	 * @param division
	 *     The division
	 */
	@JsonProperty("division")
	public void setDivision(String division) {
		this.division = division;
	}

	/**
	 * 
	 * @return
	 *     The toMonth
	 */
	@JsonProperty("to_month")
	public String getToMonth() {
		return toMonth;
	}

	/**
	 * 
	 * @param toMonth
	 *     The to_month
	 */
	@JsonProperty("to_month")
	public void setToMonth(String toMonth) {
		this.toMonth = toMonth;
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
