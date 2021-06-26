package com.pankaj.designPattern.Singleton;

public class SingletonExample {
    public static void main(String [] args){
        Logger log_1 = Logger.getInstance();
        Logger log_2 = Logger.getInstance();
        System.out.println(log_1 == log_2);

    }

}
