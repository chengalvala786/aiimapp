
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
    "marks",
    "division"
})
public class Pq_ {

    @JsonProperty("marks")
    private String marks;
    @JsonProperty("division")
    private String division;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
