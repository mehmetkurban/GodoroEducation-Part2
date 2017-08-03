

package com.godoro.adapter;

public class SewerMakerAdapter implements Maker{
    private Sewer sewer=new Sewer();

    @Override
    public void make(double start, double lenght, boolean zigzag) {
        double end =start+lenght;
        String type=zigzag ? "zigzag" : "straight";
        sewer.sew((int)start,(int)end,type);
    }
}
