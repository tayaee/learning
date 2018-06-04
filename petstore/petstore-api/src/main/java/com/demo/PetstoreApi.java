package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetstoreApi {
    static final String VERSION = "v2";
    private static Logger LOGGER = LoggerFactory.getLogger(PetstoreApi.class);

    static String getVersion() {
        return VERSION;
    }

    public static void main(String[] args) {
        LOGGER.info("Hello World " + getVersion());
    }
}
