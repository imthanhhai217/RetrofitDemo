
package com.jaroid.retrofitdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListDogModel {

    @SerializedName("message")
    @Expose
    private Message message;
    @SerializedName("status")
    @Expose
    private String status;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
