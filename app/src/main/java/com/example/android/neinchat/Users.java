package com.example.android.neinchat;

/**
 * Created by sumeet on 2/25/2018.
 */

public class Users {

    public Users(String name, String image, String status) {
        this.name = name;
        this.image = image;
        this.status = status;
    }

    public Users() {
    }

    public String name;
    public String image;
    public String status;

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getImage() {

        return image;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setImage(String image) {

        this.image = image;
    }

    public void setName(String name) {

        this.name = name;
    }
}
