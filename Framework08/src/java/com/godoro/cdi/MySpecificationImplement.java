
package com.godoro.cdi;


public class MySpecificationImplement implements MySpecification{

    @Override
    public String myOperation(String input) {
        return "Geçekleştirim Çıktısı:"+input;
    }
    
}
