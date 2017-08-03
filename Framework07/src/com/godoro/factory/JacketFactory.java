package com.godoro.factory;

public class JacketFactory {
    public static Jacket createJacket(){
        return new Leatherjacket("Deri Ceket");
    }
}
