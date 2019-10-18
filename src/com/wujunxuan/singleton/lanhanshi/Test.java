package com.wujunxuan.singleton.lanhanshi;

import com.wujunxuan.singleton.ehanshi.HunrySingleton;

import java.io.*;

public class Test {
    public static void main(String[] args)  throws Exception {
        //LazySingleton lazySingleton=LazySingleton.getInstance();
//        Thread t1=new Thread(new T());
//        Thread t2=new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("end main");
        HunrySingleton hunrySingleton=HunrySin  gleton.getInstance();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hunrySingleton);

        File file=new File("singleton_file");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));

        HunrySingleton newinstance=(HunrySingleton)ois.readObject();

        System.out.println(hunrySingleton);
        System.out.println(newinstance);
        System.out.println(hunrySingleton==newinstance);

    }
}
