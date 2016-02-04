
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
    "streamName",
    "passingMonth",
    "passingYear",
    "std12_percentage",
    "std12_division"
})
public class Highschool {

    @JsonProperty("schoolName")
    private String schoolName;
    @JsonProperty("streamName")
    private String streamName;
  
    @JsonProperty("passingMonth")
    private String passingMonth;
    @JsonProperty("passingYear")
    private String passingYear;
    
   
	@JsonProperty("std12_percentage")
    private String std12Percentage;
    @JsonProperty("std12_division")
    private String std12Division;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The schoolName
     */
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
    @JsonProperty("passingMonth")
    public String getPassingMonth() {
		return passingMonth;
	}
    @JsonProperty("passingMonth")
	public void setPassingMonth(String passingMonth) {
		this.passingMonth = passingMonth;
	}
    @JsonProperty("passingYear")
	public String getPassingYear() {
		return passingYear;
	}
    @JsonProperty("passingYear")
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}

    /**
     * 
     * @return
     *     The streamName
     */
    @JsonProperty("streamName")
    public String getStreamName() {
        return streamName;
    }

    /**
     * 
     * @param streamName
     *     The streamName
     */
    @JsonProperty("streamName")
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }


    
    /**
     * 
     * @return
     *     The std12Percentage
     */
    @JsonProperty("std12_percentage")
    public String getStd12Percentage() {
        return std12Percentage;
    }

    /**
     * 
     * @param std12Percentage
     *     The std12_percentage
     */
    @JsonProperty("std12_percentage")
    public void setStd12Percentage(String std12Percentage) {
        this.std12Percentage = std12Percentage;
    }

    /**
     * 
     * @return
     *     The std12Division
     */
    @JsonProperty("std12_division")
    public String getStd12Division() {
        return std12Division;
    }

    /**
     * 
     * @param std12Division
     *     The std12_division
     */
    @JsonProperty("std12_division")
    public void setStd12Division(String std12Division) {
        this.std12Division = std12Division;
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
