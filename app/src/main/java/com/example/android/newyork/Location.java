package com.example.android.newyork;

/**
 * Created by Sogekingu on 12/6/16.
 */

public class Location {

    private String mCompanyName;
    private String mCompanyNumber;
    private String mCompanyAddress;


    public Location(String companyName, String companyNumber,
                    String companyAddress) {
        mCompanyName = companyName;
        mCompanyNumber = companyNumber;
        mCompanyAddress = companyAddress;
    }

    public String getCompanyName() {
        return mCompanyName;
    }

    public String getCompanyNumber() {
        return mCompanyNumber;
    }

    public String getCompanyAddress() {
        return mCompanyAddress;
    }
}
