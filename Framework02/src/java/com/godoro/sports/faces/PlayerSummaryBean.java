package com.godoro.sports.faces;

import com.godoro.sports.entity.Player;
import com.godoro.sports.repository.PlayerRepository;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped
public class PlayerSummaryBean {
    private List<Player> playerList;

    public PlayerSummaryBean() {
        PlayerRepository playerRepository=new PlayerRepository();
        playerList=playerRepository.list();
    }
    
    public List<Player> getPlayerList(){
        
    return playerList;
    
    }
    public void delete(){
        long playerId=0;
        HttpServletRequest request=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if(request.getParameter("playerId")!=null){
            playerId=Long.parseLong(request.getParameter("playerId"));
        }
        PlayerRepository playerRepository=new PlayerRepository();
        playerRepository.delete(playerId);
    }
    
    
}
