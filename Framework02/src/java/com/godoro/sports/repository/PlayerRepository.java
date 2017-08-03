package com.godoro.sports.repository;

import com.godoro.sports.entity.Player;
import java.util.ArrayList;
import java.util.List;


public class PlayerRepository {
    
    public void insert(Player player){
        System.out.println("Ekleniyor"+player.getPlayerName()+""+player.getAverageScore());
    }
    
    public void update(Player player){
        System.out.println("Güncelleniyor"+player.getPlayerId()+""+player.getPlayerName()+""+player.getAverageScore());
    }
    public void delete(long playerId){
        System.out.println("Siliniyor"+playerId);
    }
    public Player find(long playerId){
        return new Player(playerId,"Cem Karaca",45.3);
    }
    
    public List<Player> list(){
        List<Player> playerList=new ArrayList<Player>();
          playerList.add(new Player(301,"Cem Karaca",1800));
          playerList.add(new Player(302,"Barış Manço",2300));
          playerList.add(new Player(303,"Fikret Kızılok",3650));
        return playerList;
    }
}
