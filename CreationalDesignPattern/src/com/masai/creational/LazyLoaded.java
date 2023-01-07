package com.masai.creational;

public class LazyLoaded {

    private static  LazyLoaded instance;
    private String url;
    private String username;
    private String password;
    private LazyLoaded(){}
    public static synchronized LazyLoaded  getInstance(){
        if(instance!=null) {
            instance = new LazyLoaded();
        }
        else{
            return instance;
        }
        return instance;
    }

}
