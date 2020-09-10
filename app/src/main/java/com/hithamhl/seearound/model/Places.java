package com.hithamhl.seearound.model;

public class Places {
    String placeName;
    String countryName;
    String placeAddress;
    String placeOpenTime;
    String placeDetails;
    String placeImage;

    public Places() {
    }

    public Places(String placeName, String countryName, String placeAddress, String placeOpenTime, String placeDetails, String placeImage) {
        this.placeName = placeName;
        this.countryName = countryName;
        this.placeAddress = placeAddress;
        this.placeOpenTime = placeOpenTime;
        this.placeDetails = placeDetails;
        this.placeImage = placeImage;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }

    public String getPlaceOpenTime() {
        return placeOpenTime;
    }

    public void setPlaceOpenTime(String placeOpenTime) {
        this.placeOpenTime = placeOpenTime;
    }

    public String getPlaceDetails() {
        return placeDetails;
    }

    public void setPlaceDetails(String placeDetails) {
        this.placeDetails = placeDetails;
    }

    public String getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(String placeImage) {
        this.placeImage = placeImage;
    }
}
