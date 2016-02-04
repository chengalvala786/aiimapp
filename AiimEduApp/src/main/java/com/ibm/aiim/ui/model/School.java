
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
    "schoolName",
    "passingMonth",
    "percentage",
    "stdDivision",
    "passingYear"
    
})
public class School {

    @JsonProperty("schoolName")
    private String schoolName;
    @JsonProperty("passingMonth")
    private String passingMonth;
    
    @JsonProperty("passingYear")
    private String passingYear;
  
	@JsonProperty("percentage")
    private String percentage;
    @JsonProperty("stdDivision")
    private String stdDivision;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The schoolName
     */
    
    
    @JsonProperty("passingYear")
    public String getPassingYear() {
		return passingYear;
	}
    @JsonProperty("passingYear")
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}

    
    @JsonProperty("schoolName")
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 
     * @param schoolName
     *     The schoolName
     */
    @JsonProperty("schoolName")
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * 
     * @return
     *     The passingMonth
     */
    @JsonProperty("passingMonth")
    public String getPassingMonth() {
        return passingMonth;
    }

    /**
     * 
     * @param passingMonth
     *     The passingMonth
     */
    @JsonProperty("passingMonth")
    public void setPassingMonth(String passingMonth) {
        this.passingMonth = passingMonth;
    }

    /**
     * 
     * @return
     *     The percentage
     */
    @JsonProperty("percentage")
    public String getPercentage() {
        return percentage;
    }

    /**
     * 
     * @param percentage
     *     The percentage
     */
    @JsonProperty("percentage")
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    /**
     * 
     * @return
     *     The stdDivision
     */
    @JsonProperty("stdDivision")
    public String getStdDivision() {
        return stdDivision;
    }

    /**
     * 
     * @param stdDivision
     *     The stdDivision
     */
    @JsonProperty("stdDivision")
    public void setStdDivision(String stdDivision) {
        this.stdDivision = stdDivision;
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
