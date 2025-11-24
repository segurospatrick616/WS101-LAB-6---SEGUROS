package com.SEGUROS.LAB7;

public class Product {
    private Long id;
    private String name;
    private Double price;

    // 1. Empty Constructor (Kailangan ito ng Spring)
    public Product() {
    }

    // 2. Constructor with Arguments (Para sa Service mo)
    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 3. MANUAL GETTERS & SETTERS (Para mawala ang error sa getId/setId)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}