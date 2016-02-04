
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
    "pg",
    "pq"
})
public class Proff {

    @JsonProperty("pg")
    private Pg_ pg;
    @JsonProperty("pq")
    private Pq_ pq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pg
     */
    @JsonProperty("pg")
    public Pg_ getPg() {
        return pg;
    }

    /**
     * 
     * @param pg
     *     The pg
     */
    @JsonProperty("pg")
    public void setPg(Pg_ pg) {
        this.pg = pg;
    }

    /**
     * 
     * @return
     *     The pq
     */
    @JsonProperty("pq")
    public Pq_ getPq() {
        return pq;
    }

    /**
     * 
     * @param pq
     *     The pq
     */
    @JsonProperty("pq")
    public void setPq(Pq_ pq) {
        this.pq = pq;
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
