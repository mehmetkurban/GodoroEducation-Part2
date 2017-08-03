
package com.godoro.factory;


public class Client {
    public static void main(String[] args) {
        Jacket jacket=JacketFactory.createJacket();
        System.out.println("Giysi :"+jacket.getName());
    }
}
