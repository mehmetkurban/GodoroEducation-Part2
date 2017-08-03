
package com.godoro.adapter;


public class Client {
    public static void main(String[] args) {
        Maker maker=new SewerMakerAdapter();
        maker.make(100, 50, true);
    }
}
