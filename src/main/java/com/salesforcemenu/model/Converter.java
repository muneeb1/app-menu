package com.salesforcemenu.model;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Converter {
    // Serialize/deserialize helpers

    public static AppMenu fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(AppMenu obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(AppMenu.class);
        writer = mapper.writerFor(AppMenu.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}
