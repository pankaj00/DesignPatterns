package com.pankaj.designPattern.Singleton;

public class Logger {

    private static Logger logger;
    private Logger(){
        System.out.println("Private constructor initialized");
    }

    public static Logger getInstance(){
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
