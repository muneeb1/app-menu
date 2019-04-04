package com.salesforcemenu.model;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class App {
    private String appID;
    private String description;
    private String developerName;
    private String eTag;
    private List<FormFactor> formFactors;
    private String headerColor;
    private String iconURL;
    private boolean isNavAutoTempTabsDisabled;
    private boolean isNavPersonalizationDisabled;
    private String label;
    private String logoURL;
    private Object mobileStartURL;
    private List<NavItem> navItems;
    private boolean selected;
    private String startURL;
    private String uiType;
    private List<Object> userNavItems;

    @JsonProperty("appId")
    public String getAppID() { return appID; }
    @JsonProperty("appId")
    public void setAppID(String value) { this.appID = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("developerName")
    public String getDeveloperName() { return developerName; }
    @JsonProperty("developerName")
    public void setDeveloperName(String value) { this.developerName = value; }

    @JsonProperty("eTag")
    public String getETag() { return eTag; }
    @JsonProperty("eTag")
    public void setETag(String value) { this.eTag = value; }

    @JsonProperty("formFactors")
    public List<FormFactor> getFormFactors() { return formFactors; }
    @JsonProperty("formFactors")
    public void setFormFactors(List<FormFactor> value) { this.formFactors = value; }

    @JsonProperty("headerColor")
    public String getHeaderColor() { return headerColor; }
    @JsonProperty("headerColor")
    public void setHeaderColor(String value) { this.headerColor = value; }

    @JsonProperty("iconUrl")
    public String getIconURL() { return iconURL; }
    @JsonProperty("iconUrl")
    public void setIconURL(String value) { this.iconURL = value; }

    @JsonProperty("isNavAutoTempTabsDisabled")
    public boolean getIsNavAutoTempTabsDisabled() { return isNavAutoTempTabsDisabled; }
    @JsonProperty("isNavAutoTempTabsDisabled")
    public void setIsNavAutoTempTabsDisabled(boolean value) { this.isNavAutoTempTabsDisabled = value; }

    @JsonProperty("isNavPersonalizationDisabled")
    public boolean getIsNavPersonalizationDisabled() { return isNavPersonalizationDisabled; }
    @JsonProperty("isNavPersonalizationDisabled")
    public void setIsNavPersonalizationDisabled(boolean value) { this.isNavPersonalizationDisabled = value; }

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("logoUrl")
    public String getLogoURL() { return logoURL; }
    @JsonProperty("logoUrl")
    public void setLogoURL(String value) { this.logoURL = value; }

    @JsonProperty("mobileStartUrl")
    public Object getMobileStartURL() { return mobileStartURL; }
    @JsonProperty("mobileStartUrl")
    public void setMobileStartURL(Object value) { this.mobileStartURL = value; }

    @JsonProperty("navItems")
    public List<NavItem> getNavItems() { return navItems; }
    @JsonProperty("navItems")
    public void setNavItems(List<NavItem> value) { this.navItems = value; }

    @JsonProperty("selected")
    public boolean getSelected() { return selected; }
    @JsonProperty("selected")
    public void setSelected(boolean value) { this.selected = value; }

    @JsonProperty("startUrl")
    public String getStartURL() { return startURL; }
    @JsonProperty("startUrl")
    public void setStartURL(String value) { this.startURL = value; }

    @JsonProperty("uiType")
    public String getUIType() { return uiType; }
    @JsonProperty("uiType")
    public void setUIType(String value) { this.uiType = value; }

    @JsonProperty("userNavItems")
    public List<Object> getUserNavItems() { return userNavItems; }
    @JsonProperty("userNavItems")
    public void setUserNavItems(List<Object> value) { this.userNavItems = value; }
}
