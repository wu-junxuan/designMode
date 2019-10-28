package com.wujunxuan.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse=new Course("linux",9);
        CatalogComponent winCourse =new Course("win",10);

        CatalogComponent javaCourse=new CourseCatalog("java",2);


        CatalogComponent class1=new Course("class1",22);
        CatalogComponent class2=new Course("class2",33);
        CatalogComponent class3=new Course("class3",44);
        CatalogComponent class4=new Course("class4",55);

        javaCourse.add(class1);
        javaCourse.add(class2);
        javaCourse.add(class3);
        javaCourse.add(class4);

        CatalogComponent mainCourseCatalog=new CourseCatalog("主目录", 1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(winCourse);
        mainCourseCatalog.add(javaCourse);

//        mainCourseCatalog.print();
//        mainCourseCatalog.getPrice(javaCourse);
    }
}
