package com.mypack;


class Print{
    public Print(){
        System.out.println("this is form Print named class file...");
    }
}
public class MyPackage {
    public static void main(String[] args) {
        System.out.println("this is form MyPackage class file...");

    }
}

//javac -d. MyPackage.java //-->for making com\mypack folder --space is required between -d. and MyPackage.java