package com.appiumframework.utils;

import com.appiumframework.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesManager {
    private static final Properties properties = new Properties();
    private static HashMap<String, String> propertyMap = new HashMap<>();

    static {
          try (FileInputStream fileInputStream = new FileInputStream(FrameworkConstants.getConfigPath())) {
            properties.load(fileInputStream);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = String.valueOf(entry.getKey());
                String value = String.valueOf(entry.getValue());
                propertyMap.put(key, value);

            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

    }
}
