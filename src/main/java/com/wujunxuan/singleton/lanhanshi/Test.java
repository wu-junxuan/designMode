package com.wujunxuan.singleton.lanhanshi;

import com.wujunxuan.singleton.meiju.EnumInstance;

public class Test {
    public static void main(String[] args)  throws Exception {
        //LazySingleton lazySingleton=LazySingleton.getInstance();
//        Thread t1=new Thread(new T());
//        Thread t2=new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("end main");
//        HunrySingleton hunrySingleton=HunrySingleton.getInstance();
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(hunrySingleton);
//
//        File file=new File("singleton_file");
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
//
//        HunrySingleton newinstance=(HunrySingleton)ois.readObject();
//
//        System.out.println(hunrySingleton);
//        System.out.println(newinstance);
//        System.out.println(hunrySingleton==newinstance);

//        Class objectClass = HunrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;
//        Class objectClass = LazySingleton.class;

//
//        Constructor constructor=objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);

//        HunrySingleton instance=HunrySingleton.getInstance();
//        HunrySingleton newInstance =(HunrySingleton)constructor.newInstance();
//        StaticInnerClassSingleton instance=StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance =(StaticInnerClassSingleton)constructor.newInstance();
//        LazySingleton instance=LazySingleton.getInstance();
//        LazySingleton newInstance =(LazySingleton)constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance==newInstance);
////////////////////

//        EnumInstance instance=EnumInstance.getInstance();
//        //EnumInstance newInstance =(EnumInstance)constructor.newInstance();
//
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("instance_file"));
//        oos.writeObject(instance);
//
//        File file=new File("instance_file");
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newinstance=(EnumInstance)ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newinstance);
//        System.out.println(instance==newinstance);
/////////////////////
//        Class objectClass = EnumInstance.class;
//
//        //对枚举来说，没有无参构造
//        Constructor constructor=objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        //无法进行反射攻击（由于不存在constructor方法）
//        EnumInstance newInstance =(EnumInstance)constructor.newInstance("Geely",666);

//        HunrySingleton instance=HunrySingleton.getInstance();
//        HunrySingleton newInstance =(HunrySingleton)constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance==newInstance);
        //////////////
//EnumInstance instance=EnumInstance.getInstance();
//instance.printTest();


    }
}
