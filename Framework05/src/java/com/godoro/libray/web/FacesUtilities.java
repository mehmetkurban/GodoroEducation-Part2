package com.godoro.libray.web;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class FacesUtilities {
    public static HttpServletRequest getRequest(){
        return (HttpServletRequest)FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequest();    
    }
    
    public static long getRequestParameter(String parameterName,long defaultValue){
        String parameterValue=getRequest().getParameter(parameterName);
        if(parameterValue!=null){
            return Long.parseLong(parameterValue);
        }else{
            return defaultValue;
        }
    }
}
