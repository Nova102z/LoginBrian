package com.automation.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigEnv {


    public static String printEnv(String string) {
        Dotenv dotenv = Dotenv.configure()
                .directory(".env")
                .ignoreIfMalformed()
                .ignoreIfMissing()
                .load();
        return dotenv.get(string);
    }

}
