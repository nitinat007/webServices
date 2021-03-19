package com.nitin.restfulwebservices.sample;

/**
 * Author: nitinkumar
 * Created Date: 19/03/21
 * Info: Note that without getter and setter for message there comes an error : "Could not find acceptable representation
 * org.springframework.web.HttpMediaTypeNotAcceptableException: Could not find acceptable representation"
 **/

public class SampleMessageBean {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SampleMessageBean(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SampleMessageBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
