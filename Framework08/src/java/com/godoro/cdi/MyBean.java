
package com.godoro.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class MyBean {
    private String myValue="Godoro";
    @Inject
    private MyTool myTool;
    //private MyTool myTool=new MyTool();
    
    @Inject
    private MySpecification mySpecification;
    public String getMyValue() {
        return myValue;
    }

    public void setMyValue(String myValue) {
        this.myValue = myValue;
    }
    public String getToolValue(){
        return "Alan"+myTool.myOperation("girdi");
    }
    public String getSpecificationValue(){
        return "Belirtilerim : "+mySpecification.myOperation("Girdi");
    }
}
