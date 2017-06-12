package com.example.android.tourguideapp;

public class sight {
    /**
     * Default translation for the word
     */
    private int mName;
    private int mAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public sight(int name, int address) {
        mName = name;
        mAddress = address;
    }

    public sight(int name, int address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
