package com.appiumframework.constants;

public final class FrameworkConstants {
    private FrameworkConstants() {
    }

    private static String resourcesPath=System.getProperty("user.dir")+"/src/test/resources";
    private static final String apkfilePath=resourcesPath+"/apkfiles/ApiDemos-debug.apk";
    private static final String configPath=resourcesPath+"/config/config.properties";

    public static String getApkfilePath(){

        return apkfilePath;
    }

    public static String getConfigPath(){
        return configPath;
    }
}
