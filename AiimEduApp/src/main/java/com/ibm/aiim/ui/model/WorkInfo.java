
package com.ibm.aiim.ui.model;

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
    "empDetails",
    "total_wexp",
   
   
})
public class WorkInfo {

    @JsonProperty("empDetails")
    private List<Employment> experience;
    
    @JsonProperty("empDetails")
    public List<Employment> getExperience() {
		return experience;
	}
    @JsonProperty("empDetails")
	public void setExperience(List<Employment> experience) {
		this.experience = experience;
	}

	@JsonProperty("total_wexp")
    private String totalWexp;
    /**
     * 
     * @return
     *     The totalWexp
     */
    @JsonProperty("total_wexp")
    public String getTotalWexp() {
        return totalWexp;
    }

    /**
     * 
     * @param totalWexp
     *     The total_wexp
     */
    @JsonProperty("total_wexp")
    public void setTotalWexp(String totalWexp) {
        this.totalWexp = totalWexp;
    }
   
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  
   

   

   
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
