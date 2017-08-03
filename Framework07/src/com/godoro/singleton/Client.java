
package com.godoro.singleton;

public class Client {
    public static void main(String[] args) {
    
        World world1 =World.getWorld();
        world1.setPopulation(80000000L);
        
        World world2=World.getWorld();
        System.out.println(world2.getPopulation());
    }
}