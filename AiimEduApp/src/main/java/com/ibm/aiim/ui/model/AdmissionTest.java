
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
    "status",
    "adm_test_name",
    "regnumber",
    "adm_score",
    "adm_percentage",
    "doe"
    
    
})
public class AdmissionTest {

    @JsonProperty("status")
    private String status;
    @JsonProperty("adm_test_name")
    private String admTestName;
    @JsonProperty("regnumber")
    private String regnumber;
    @JsonProperty("adm_score")
    private String admScore;
    @JsonProperty("adm_percentage")
    private String admPercentage;
    @JsonProperty("doe")
    private String doe;
    
    
    @JsonProperty("doe")
    public String getDoe() {
		return doe;
	}
    @JsonProperty("doe")
	public void setDoe(String doe) {
		this.doe = doe;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The admTestName
     */
    @JsonProperty("adm_test_name")
    public String getAdmTestName() {
        return admTestName;
    }

    /**
     * 
     * @param admTestName
     *     The adm_test_name
     */
    @JsonProperty("adm_test_name")
    public void setAdmTestName(String admTestName) {
        this.admTestName = admTestName;
    }

    /**
     * 
     * @return
     *     The regnumber
     */
    @JsonProperty("regnumber")
    public String getRegnumber() {
        return regnumber;
    }

    /**
     * 
     * @param regnumber
     *     The regnumber
     */
    @JsonProperty("regnumber")
    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    /**
     * 
     * @return
     *     The admScore
     */
    @JsonProperty("adm_score")
    public String getAdmScore() {
        return admScore;
    }

    /**
     * 
     * @param admScore
     *     The adm_score
     */
    @JsonProperty("adm_score")
    public void setAdmScore(String admScore) {
        this.admScore = admScore;
    }

    /**
     * 
     * @return
     *     The admPercentage
     */
    @JsonProperty("adm_percentage")
    public String getAdmPercentage() {
        return admPercentage;
    }

    /**
     * 
     * @param admPercentage
     *     The adm_percentage
     */
    @JsonProperty("adm_percentage")
    public void setAdmPercentage(String admPercentage) {
        this.admPercentage = admPercentage;
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
