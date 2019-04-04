package com.salesforcemenu.model;

import com.fasterxml.jackson.annotation.*;

public class PageReference {
    private Attributes attributes;
    private State state;
    private String type;

    @JsonProperty("attributes")
    public Attributes getAttributes() { return attributes; }
    @JsonProperty("attributes")
    public void setAttributes(Attributes value) { this.attributes = value; }

    @JsonProperty("state")
    public State getState() { return state; }
    @JsonProperty("state")
    public void setState(State value) { this.state = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }
}
