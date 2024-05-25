package com.mukit.myapp.utility;

import org.springframework.core.env.Environment;

import java.util.Arrays;

public class CommonUtils {
    public static AppEnvironment getCurrentEnv(Environment env) {
        if (Arrays.stream(env.getActiveProfiles()).anyMatch(
                activeEnv -> activeEnv.equalsIgnoreCase(AppEnvironment.PROD.name()))) {
            return AppEnvironment.PROD;
        } else if (Arrays.stream(env.getActiveProfiles()).anyMatch(
                activeEnv -> activeEnv.equalsIgnoreCase(AppEnvironment.UAT.name()))) {
            return AppEnvironment.UAT;
        }
        return AppEnvironment.UNDEFINED;
    }
}
