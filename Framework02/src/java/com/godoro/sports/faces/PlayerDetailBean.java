package com.godoro.sports.faces;

import com.godoro.sports.entity.Player;
import com.godoro.sports.repository.PlayerRepository;
import com.sun.net.httpserver.HttpServer;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped

public class PlayerDetailBean {
    private Player player;
    
    public PlayerDetailBean() {
        
        long playerId=0;
        HttpServletRequest request=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if(request.getParameter("playerId")!=null){
            playerId=Long.parseLong(request.getParameter("playerId"));
        }
        if(playerId==0){
            player=new Player();
        }else{
            PlayerRepository playerRepository=new PlayerRepository();
            player=playerRepository.find(playerId);
        }
    }
    
    
    public Player getPlayer(){
        return player;
    }
    
    public void save(){
        PlayerRepository playerRepository=new PlayerRepository();
        long playerId=0;
         HttpServletRequest request=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if(request.getParameter("playerId")!=null){
            playerId=Long.parseLong(request.getParameter("playerId"));
        }
        if(playerId==0){
            playerRepository.insert(player);
           
        }else{       
            playerRepository.update(player);
        }
    }
    
}
