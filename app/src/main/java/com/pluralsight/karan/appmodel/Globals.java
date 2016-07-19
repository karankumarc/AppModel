package com.pluralsight.karan.appmodel;

/**
 * Created by ADMIN on 7/19/2016.
 */
public class Globals {
    private static Globals ourInstance = new Globals();

    public static Globals getInstance() {
        return ourInstance;
    }

    private Globals() {
    }
}
