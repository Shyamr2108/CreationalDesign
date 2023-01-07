package com.masai.creational;

public class Main {
    public static void main(String args[]){

        Safest singleton=Safest.INSTANCE;
        Safest singleton1=Safest.INSTANCE;

        singleton.setPassword("shyam123");
        String pswd=singleton.getPassword();
        singleton.setUrl("shyam.com");
        String site = singleton.getUrl();
        singleton.setUsername("ram123");
        String name0= singleton.getUsername();
        singleton1.setUsername("shreya124");
        String name= singleton1.getUsername();

        System.out.println(name);
        System.out.println(name0);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());



//        DatabaseConnector singleton= DatabaseConnector.getInstance();
//        DatabaseConnector singleton1= DatabaseConnector.getInstance();
//
//        System.out.println(singleton.hashCode());
//        System.out.println(singleton.hashCode());

    }
}
