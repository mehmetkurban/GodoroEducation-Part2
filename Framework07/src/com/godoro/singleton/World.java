
package com.godoro.singleton;

public class World {

    public static World getWORLD() {
        return WORLD;
    }

    public static void setWORLD(World WORLD) {
        World.WORLD = WORLD;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
    
    private static World WORLD=null;
    private long population;
    
    private World(){
    }
    
    public static World getWorld(){
        if(WORLD==null){
            WORLD=new World();
        }
        return WORLD;
    }
}
