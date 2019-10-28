package com.wujunxuan.principle.kaibi;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;

    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        //return "JavaDiscountCourse [id=\" + id + \", name=\" + name + \", price=\" + price + \"]";
        return "JavaDiscountCourse [id=" + this.getId() + ", name=" + this.getName() + ", price=" + this.getPrice() + "]";
    }
}
