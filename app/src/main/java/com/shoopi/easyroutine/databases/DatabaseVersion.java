package com.shoopi.easyroutine.databases;

public enum DatabaseVersion {
    VERSION_1(1);


    private final int mValue;

    DatabaseVersion(int value){
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }
}
