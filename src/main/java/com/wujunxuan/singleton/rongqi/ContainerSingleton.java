package com.wujunxuan.singleton.rongqi;


import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    //具有明确风险，改用correntHashmap也会存在。
//    private ContainerSingleton(){
//
//    }
//    private static Map<String,Object> singletonMap=new HashMap<String,Object>();
//    public  static  void putInstance(String key,Object instance){
//        if (StringUtils.isNotBlank(key)&&instance!=null){
//            if (!singletonMap.containsKey(key)){
//                singletonMap.put(key, instance);
//            }
//        }
//    }
//    public static Object getInstance(String key){
//        return singletonMap.get(key);
//    }

}
