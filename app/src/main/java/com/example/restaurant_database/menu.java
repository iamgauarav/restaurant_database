package com.example.restaurant_database;

import androidx.annotation.NonNull;

public class menu {
    private String name;
    private float price;
    public menu(String name,float price){
        this.name=name;
        this.price=price;
    }

    @NonNull
    public String toString(){
        return name+" "+price+"INR";
    }
}
