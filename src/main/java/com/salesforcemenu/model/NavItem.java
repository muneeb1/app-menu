package com.salesforcemenu.model;

import com.fasterxml.jackson.annotation.*;

public class NavItem {
    private boolean availableInClassic;
    private boolean availableInLightning;
    private String color;
    private String content;
    private boolean custom;
    private String developerName;
    private String iconURL;
    private Object id;
    private String itemType;
    private String label;
    private String objectAPIName;
    private String objectLabel;
    private String objectLabelPlural;
    private PageReference pageReference;
    private Object standardType;

    @JsonProperty("availableInClassic")
    public boolean getAvailableInClassic() { return availableInClassic; }
    @JsonProperty("availableInClassic")
    public void setAvailableInClassic(boolean value) { this.availableInClassic = value; }

    @JsonProperty("availableInLightning")
    public boolean getAvailableInLightning() { return availableInLightning; }
    @JsonProperty("availableInLightning")
    public void setAvailableInLightning(boolean value) { this.availableInLightning = value; }

    @JsonProperty("color")
    public String getColor() { return color; }
    @JsonProperty("color")
    public void setColor(String value) { this.color = value; }

    @JsonProperty("content")
    public String getContent() { return content; }
    @JsonProperty("content")
    public void setContent(String value) { this.content = value; }

    @JsonProperty("custom")
    public boolean getCustom() { return custom; }
    @JsonProperty("custom")
    public void setCustom(boolean value) { this.custom = value; }

    @JsonProperty("developerName")
    public String getDeveloperName() { return developerName; }
    @JsonProperty("developerName")
    public void setDeveloperName(String value) { this.developerName = value; }

    @JsonProperty("iconUrl")
    public String getIconURL() { return iconURL; }
    @JsonProperty("iconUrl")
    public void setIconURL(String value) { this.iconURL = value; }

    @JsonProperty("id")
    public Object getID() { return id; }
    @JsonProperty("id")
    public void setID(Object value) { this.id = value; }

    @JsonProperty("itemType")
    public String getItemType() { return itemType; }
    @JsonProperty("itemType")
    public void setItemType(String value) { this.itemType = value; }

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("objectApiName")
    public String getObjectAPIName() { return objectAPIName; }
    @JsonProperty("objectApiName")
    public void setObjectAPIName(String value) { this.objectAPIName = value; }

    @JsonProperty("objectLabel")
    public String getObjectLabel() { return objectLabel; }
    @JsonProperty("objectLabel")
    public void setObjectLabel(String value) { this.objectLabel = value; }

    @JsonProperty("objectLabelPlural")
    public String getObjectLabelPlural() { return objectLabelPlural; }
    @JsonProperty("objectLabelPlural")
    public void setObjectLabelPlural(String value) { this.objectLabelPlural = value; }

    @JsonProperty("pageReference")
    public PageReference getPageReference() { return pageReference; }
    @JsonProperty("pageReference")
    public void setPageReference(PageReference value) { this.pageReference = value; }

    @JsonProperty("standardType")
    public Object getStandardType() { return standardType; }
    @JsonProperty("standardType")
    public void setStandardType(Object value) { this.standardType = value; }
}
