
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
    "school",
    "highschool",
    "gd",
    "pg",
    "pq",
    "proff",
    "gdAdd",
    "pgAdd",
    "pqAdd",
    "admissionTest"
})
public class EductionalInfo {


	@JsonProperty("school")
    private School school;
    @JsonProperty("highschool")
    private Highschool highschool;
    @JsonProperty("gd")
    private Gd gd;
   
    
    @JsonProperty("pg")
    private Pg pg;
    @JsonProperty("pq")
    private Pq pq;
    @JsonProperty("proff")
    private Proff proff;
    @JsonProperty("admissionTest")
    private AdmissionTest admissionTest;
    
    
    @JsonProperty("pqAdd")
    private List<Pq> pqAdd;
    
    @JsonProperty("pqAdd")
    public List<Pq> getPqAdd() {
		return pqAdd;
	}
    @JsonProperty("pqAdd")
	public void setpqAdd(List<Pq> pqAdd) {
		this.pqAdd = pqAdd;
	}
    
    
    
    @JsonProperty("gdAdd")
    private List<Gd> gdAdd;
    
    @JsonProperty("gdAdd")
    public List<Gd> getGdAdd() {
		return gdAdd;
	}
    @JsonProperty("gdAdd")
	public void setGdAdd(List<Gd> gdAdd) {
		this.gdAdd = gdAdd;
	}
    
    
    
    
    @JsonProperty("pgAdd")
    private List<Pg> pgAdd;
    
    @JsonProperty("pgAdd")
    public List<Pg> getPgAdd() {
		return pgAdd;
	}
    @JsonProperty("pgAdd")
	public void setPgAdd(List<Pg> pgAdd) {
		this.pgAdd = pgAdd;
	}
    
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The school
     */
    @JsonProperty("school")
    public School getSchool() {
        return school;
    }

    /**
     * 
     * @param school
     *     The school
     */
    @JsonProperty("school")
    public void setSchool(School school) {
        this.school = school;
    }

    /**
     * 
     * @return
     *     The highschool
     */
    @JsonProperty("highschool")
    public Highschool getHighschool() {
        return highschool;
    }

    /**
     * 
     * @param highschool
     *     The highschool
     */
    @JsonProperty("highschool")
    public void setHighschool(Highschool highschool) {
        this.highschool = highschool;
    }

    /**
     * 
     * @return
     *     The gd
     */
    @JsonProperty("gd")
    public Gd getGd() {
        return gd;
    }

    /**
     * 
     * @param gd
     *     The gd
     */
    @JsonProperty("gd")
    public void setGd(Gd gd) {
        this.gd = gd;
    }

    /**
     * 
     * @return
     *     The pg
     */
    @JsonProperty("pg")
    public Pg getPg() {
        return pg;
    }

    /**
     * 
     * @param pg
     *     The pg
     */
    @JsonProperty("pg")
    public void setPg(Pg pg) {
        this.pg = pg;
    }

    /**
     * 
     * @return
     *     The pq
     */
    @JsonProperty("pq")
    public Pq getPq() {
        return pq;
    }

    /**
     * 
     * @param pq
     *     The pq
     */
    @JsonProperty("pq")
    public void setPq(Pq pq) {
        this.pq = pq;
    }

    /**
     * 
     * @return
     *     The proff
     */
    @JsonProperty("proff")
    public Proff getProff() {
        return proff;
    }

    /**
     * 
     * @param proff
     *     The proff
     */
    @JsonProperty("proff")
    public void setProff(Proff proff) {
        this.proff = proff;
    }

    /**
     * 
     * @return
     *     The admissionTest
     */
    @JsonProperty("admissionTest")
    public AdmissionTest getAdmissionTest() {
        return admissionTest;
    }

    /**
     * 
     * @param admissionTest
     *     The admissionTest
     */
    @JsonProperty("admissionTest")
    public void setAdmissionTest(AdmissionTest admissionTest) {
        this.admissionTest = admissionTest;
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
