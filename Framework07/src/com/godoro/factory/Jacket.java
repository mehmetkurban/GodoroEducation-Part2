
package com.godoro.factory;

public abstract class Jacket {
    private String name;

    public Jacket(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
