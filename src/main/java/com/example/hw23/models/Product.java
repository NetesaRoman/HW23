package com.example.hw23.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/*
 *
 * @author Roman Netesa
 *
 */
@Value
public class Product {
    int id;
    String name;
    Double price;

    public void showInfo(){
        System.out.println("ID: " + id + " Name: " + name + " Price: " + price + " USD;");
    }
}
