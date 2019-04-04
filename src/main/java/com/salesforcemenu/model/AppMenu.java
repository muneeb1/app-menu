package com.salesforcemenu.model;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AppMenu {
    private List<App> apps;
    private String eTag;

    @JsonProperty("apps")
    public List<App> getApps() { return apps; }
    @JsonProperty("apps")
    public void setApps(List<App> value) { this.apps = value; }

    @JsonProperty("eTag")
    public String getETag() { return eTag; }
    @JsonProperty("eTag")
    public void setETag(String value) { this.eTag = value; }
}
