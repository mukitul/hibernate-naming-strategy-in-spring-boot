package com.mukit.myapp.utility;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum DatabaseType {
    PROD_MY_APP_DATABASE("myAppDB"),
    PROD_ALPHA_APP_DATABASE("alphaAppDB"),
    SIT_DATABASE("sitDB");

    private final String name;

    public static String fromEnvironment(AppEnvironment env, String tableName, List<String> alphaAppTables) {
        if (AppEnvironment.PROD.equals(env)) {
            if (alphaAppTables.contains(tableName)) {
                return PROD_ALPHA_APP_DATABASE.name;
            } else {
                return PROD_MY_APP_DATABASE.name;
            }
        }
        return SIT_DATABASE.name;
    }

}
