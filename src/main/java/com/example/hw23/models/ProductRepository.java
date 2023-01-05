package com.example.hw23.models;

import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author Roman Netesa
 *
 */
@Value
public class ProductRepository {
    @Autowired
    List<Product> products = new ArrayList<>();
}
