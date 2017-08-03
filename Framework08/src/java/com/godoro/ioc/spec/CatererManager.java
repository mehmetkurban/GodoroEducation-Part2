
package com.godoro.ioc.spec;

import com.godoro.ioc.cheap.CheapCaterer;

public class CatererManager {
    
    private static Caterer caterer=new CheapCaterer();
    
    public static Caterer getCaterer(){
        return caterer;
    }
}
