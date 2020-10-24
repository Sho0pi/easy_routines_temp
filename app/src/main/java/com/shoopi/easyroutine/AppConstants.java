package com.shoopi.easyroutine;

public class AppConstants {

    public static class Database {
        public static class Headers {
            public static final String ACTIVITY = "activity";
            public static final String ACTIVITY_PACKAGE = "activitypackage";
            public static final String APP = "app";
            public static final String FEATURE_TYPE = "feature";
            public static final String ICON = "icon";
            public static final String ICON_TYPE = "icontype";
            public static final String PACKAGE = "package";
            public static final String ROUTINE = "routine";
        }

        public static final String[] DATABASE_COLUMN = new String[]{
                Headers.ROUTINE,
                Headers.APP,
                Headers.PACKAGE,
                Headers.ACTIVITY,
                Headers.ACTIVITY_PACKAGE,
                Headers.ICON,
                Headers.ICON_TYPE,
                Headers.FEATURE_TYPE
        };

        public static final String COLLECTION_TABLE_NAME = "COLLECTION_TABLE";
    }
    public static final String SHAREDPREFERENCE = "PRIVATE_SHAREDPREFERENCE";
    public static final String NIGHT_MODE = "NIGHT_MODE";
}
