
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
    "activity",
    "decleration",
    "pref2",
    "description"
    
})
public class AdditionalInfo {

    @JsonProperty("activity")
    private Activity activity;
    @JsonProperty("decleration")
    private String decleration;
    
    @JsonProperty("srcTags")
    private List<String> srcTags;
    @JsonProperty("srcTags")
    public List<String> getSrcTags() {
		return srcTags;
	}
    @JsonProperty("srcTags")
	public void setSrcTags(List<String> srcTags) {
		this.srcTags = srcTags;
	}

	@JsonProperty("description")
    private String description;
    
    @JsonProperty("description")
    public String getDescription() {
		return description;
	}
    @JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("pref2")
    private String pref2;
    @JsonProperty("pref1")
    private String pref1;
    @JsonProperty("pref1")
    public String getPref1() {
		return pref1;
	}
    @JsonProperty("pref1")
	public void setPref1(String pref1) {
		this.pref1 = pref1;
	}
	@JsonProperty("pref2")
    public String getPref2() {
		return pref2;
	}
    @JsonProperty("pref2")
	public void setPref2(String pref2) {
		this.pref2 = pref2;
	}
    
    

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The activity
     */
    @JsonProperty("activity")
    public Activity getActivity() {
        return activity;
    }

    /**
     * 
     * @param activity
     *     The activity
     */
    @JsonProperty("activity")
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * 
     * @return
     *     The decleration
     */
    @JsonProperty("decleration")
    public String getDecleration() {
        return decleration;
    }

    /**
     * 
     * @param decleration
     *     The decleration
     */
    @JsonProperty("decleration")
    public void setDecleration(String decleration) {
        this.decleration = decleration;
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
