
package com.godoro.ioc.user;

import com.godoro.ioc.spec.Caterer;
import com.godoro.ioc.spec.CatererManager;

public class Client {
    public static void main(String[] args) {
        Caterer caterer=CatererManager.getCaterer();
        String food=caterer.getFood(1);
        System.out.println("Kahvaltı:"+food);
    }
    
}
