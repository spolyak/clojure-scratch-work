package com.stevepolyak.simple;

import clojure.lang.RT;

public class SimpleApp {
    private static final String MAINCLJ = "com/stevepolyak/simple/main.clj";

    public static void main(String[] args){
        System.out.println("Java Hello World!" );
        try {
            RT.loadResourceScript(MAINCLJ);
            RT.var("com.stevepolyak.simple.main", "main").invoke(args);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
