
package com.godoro.ioc.cheap;

import com.godoro.ioc.spec.Caterer;

public class CheapCaterer implements Caterer{
    
   
    @Override
    public String getFood(int meal) {
        switch(meal){
            case 1:
                return "Poğaca";
            case 2:
                return "Kuru Fasulye";
            case 3:
                return "Lahana";
            default:
                return "Salçalı Ekmek";
        }
    }
    
}
