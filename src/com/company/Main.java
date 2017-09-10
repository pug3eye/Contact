package com.company;

public class Main {

    public static void demo1() {
        Contact p1 = new Contact();
        p1.setFirstName("joHn"); // John
        p1.setLastName("WICK");  // Wick
        p1.setPhoneNumber("(027)-73-7751"); //0647737751

        System.out.println("p1 = " + p1);
//        System.out.println(p1.prettyFormatPhoneNumber());

        Contact p2 = new Contact("TinnARat","aungTUbnum","0-64-773-77-51");
        System.out.println("p2 = " + p2);
//        System.out.println(p2.getPhoneNumber());

    }

    public static void main(String[] args) {
	// write your code here
        demo1();


    }
}
