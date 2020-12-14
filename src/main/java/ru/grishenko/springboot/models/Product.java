package ru.grishenko.springboot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private static int idInc = 0;

    private int id;
    private String title;
    private Float cost;

    {
        idInc++;
    }
    public Product() {
        this.id = idInc;
    }
    public Product(String title, Float cost) {
        this.id = idInc;
        this.title = title;
        this.cost = cost;
    }
}
