package com.mvc.javabean;

public class Goods {

    private String id;
    private String name;
    private double price;
    private Integer num;

    public Goods() {
    }

    public Goods(String id, String name, double price, Integer num) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }



    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
