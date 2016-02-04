
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
    "personalInfo",
    "eductionalInfo",
    "workInfo",
    "additionalInfo",
    "pageNo"
})
public class Application {

    @JsonProperty("personalInfo")
    private PersonalInfo personalInfo;
    @JsonProperty("eductionalInfo")
    private EductionalInfo eductionalInfo;
    @JsonProperty("workInfo")
    private WorkInfo workInfo;
    @JsonProperty("pageNo")
    private String pageNo;
    
    @JsonProperty("additionalInfo")
    private AdditionalInfo additionalInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("pageNo")
    public String getPageNo() {
		return pageNo;
	}
    @JsonProperty("pageNo")
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
    @JsonProperty("app_rw_id")
	private String app_rw_id;
    @JsonProperty("tranId")
	private String tranId;
    
    @JsonProperty("tranId")
    public String getTranId() {
		return tranId;
	}
    @JsonProperty("tranId")
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	@JsonProperty("acceptedDate")
  	private String acceptedDate;
    @JsonProperty("acceptedDate")
    public String getAcceptedDate() {
		return acceptedDate;
	}
    @JsonProperty("acceptedDate")
	public void setAcceptedDate(String acceptedDate) {
		this.acceptedDate = acceptedDate;
	}
	@JsonProperty("app_rw_id")
	public String getApp_rw_id() {
		return app_rw_id;
	}
    @JsonProperty("app_rw_id")
	public void setApp_rw_id(String app_rw_id) {
		this.app_rw_id = app_rw_id;
	}
	/**
     * 
     * @return
     *     The personalInfo
     */
    @JsonProperty("personalInfo")
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * 
     * @param personalInfo
     *     The personalInfo
     */
    @JsonProperty("personalInfo")
    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    /**
     * 
     * @return
     *     The eductionalInfo
     */
    @JsonProperty("eductionalInfo")
    public EductionalInfo getEductionalInfo() {
        return eductionalInfo;
    }

    /**
     * 
     * @param eductionalInfo
     *     The eductionalInfo
     */
    @JsonProperty("eductionalInfo")
    public void setEductionalInfo(EductionalInfo eductionalInfo) {
        this.eductionalInfo = eductionalInfo;
    }

    /**
     * 
     * @return
     *     The workInfo
     */
    @JsonProperty("workInfo")
    public WorkInfo getWorkInfo() {
        return workInfo;
    }

    /**
     * 
     * @param workInfo
     *     The workInfo
     */
    @JsonProperty("workInfo")
    public void setWorkInfo(WorkInfo workInfo) {
        this.workInfo = workInfo;
    }

    /**
     * 
     * @return
     *     The additionalInfo
     */
    @JsonProperty("additionalInfo")
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * 
     * @param additionalInfo
     *     The additionalInfo
     */
    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
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
