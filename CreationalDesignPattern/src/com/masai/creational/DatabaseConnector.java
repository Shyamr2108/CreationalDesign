package com.masai.creational;

public class  DatabaseConnector {
   // private static final SimpleSingleton instance =new SimpleSingleton();
   private static DatabaseConnector instance;
   private String url;
   private String username;
   private String password;

   static {
       try {
           instance=new DatabaseConnector();
       }
       catch (Exception ex){
           ex.getStackTrace();
       }

   }
    private DatabaseConnector(){}



    public static DatabaseConnector  getInstance(){
        return instance;
    }
}
