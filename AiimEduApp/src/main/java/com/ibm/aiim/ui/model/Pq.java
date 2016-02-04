
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
    "obtained",
    "college",
    "from_month",
    "from_year",
    "marks",
    "division"
})
public class Pq {
	 @JsonProperty("obtained")
    private	String 	obtained ;
	 @JsonProperty("college")
    private	String 	college;
	 @JsonProperty("from_month")
    private	String 	from_month;
	 @JsonProperty("from_year")
    private	String 	from_year;
	 @JsonProperty("marks")
    private	String 	marks;
	 @JsonProperty("division")
    private	String 	division;
   
    
	 @JsonProperty("obtained")
    public String getObtained() {
		return obtained;
	}
	 @JsonProperty("obtained")
	public void setObtained(String obtained) {
		this.obtained = obtained;
	}
	 @JsonProperty("college")
	public String getCollege() {
		return college;
	}
	 @JsonProperty("college")
	public void setCollege(String college) {
		this.college = college;
	}
	 @JsonProperty("from_month")
	public String getFrom_month() {
		return from_month;
	}
	 @JsonProperty("from_month")
	public void setFrom_month(String from_month) {
		this.from_month = from_month;
	}
	 @JsonProperty("from_year")
	public String getFrom_year() {
		return from_year;
	}
	 @JsonProperty("from_year")
	public void setFrom_year(String from_year) {
		this.from_year = from_year;
	}
	 @JsonProperty("marks")
	public String getMarks() {
		return marks;
	}
	 @JsonProperty("marks")
	public void setMarks(String marks) {
		this.marks = marks;
	}
	 @JsonProperty("division")
	public String getDivision() {
		return division;
	}
	 @JsonProperty("division")
	public void setDivision(String division) {
		this.division = division;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
