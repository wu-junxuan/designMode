package com.wujunxuan.principle.kaibi;

public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;


    public JavaCourse(Integer id, String name, Double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Integer getId() {
        // TODO Auto-generated method stub
        return this.id;
    }


    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }


    public Double getPrice() {
        // TODO Auto-generated method stub
        return this.price;
    }

//    @Override
//    public Double getDiscountPrices() {
//        return this.price*0.8;
//    }


    public String toString() {
        return "JavaCourse [id=" + id + ", name=" + name + ", price=" + price + "]";
    }


}
