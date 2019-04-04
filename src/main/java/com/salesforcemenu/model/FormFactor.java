package com.salesforcemenu.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FormFactor {
    LARGE, MEDIUM, SMALL;

    @JsonValue
    public String toValue() {
        switch (this) {
        case LARGE: return "Large";
        case MEDIUM: return "Medium";
        case SMALL: return "Small";
        }
        return null;
    }

    @JsonCreator
    public static FormFactor forValue(String value) throws IOException {
        if (value.equals("Large")) return LARGE;
        if (value.equals("Medium")) return MEDIUM;
        if (value.equals("Small")) return SMALL;
        throw new IOException("Cannot deserialize FormFactor");
    }
}
