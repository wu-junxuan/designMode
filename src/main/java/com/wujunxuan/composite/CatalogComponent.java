package com.wujunxuan.composite;

public class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持add");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持remove");
    }
    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持getName");
    }
    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持getPrice");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持print");
    }

}
