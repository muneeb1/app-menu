package com.salesforcemenu.model;

import com.fasterxml.jackson.annotation.*;

public class Attributes {
    private String objectAPIName;
    private String actionName;

    @JsonProperty("objectApiName")
    public String getObjectAPIName() { return objectAPIName; }
    @JsonProperty("objectApiName")
    public void setObjectAPIName(String value) { this.objectAPIName = value; }

    @JsonProperty("actionName")
    public String getActionName() { return actionName; }
    @JsonProperty("actionName")
    public void setActionName(String value) { this.actionName = value; }
}
