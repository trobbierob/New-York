package com.example.android.newyork;

/**
 * Created by Sogekingu on 12/6/16.
 */

public class Location {

    private String mCompanyName;
    private String mCompanyNumber;
    private String mCompanyAddress;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Location(String companyName, String companyNumber,
                    String companyAddress, int imageResourceId) {
        mCompanyName = companyName;
        mCompanyNumber = companyNumber;
        mCompanyAddress = companyAddress;
        mImageResourceId = imageResourceId;
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

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
