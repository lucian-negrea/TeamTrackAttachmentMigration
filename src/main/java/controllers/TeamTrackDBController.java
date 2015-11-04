/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author RO100051
 */
public class TeamTrackDBController {
    private TeamTrackDBController singleton;
    private Connection con = null;
    private ResultSet rs = null;
    private String url = "";
    private String driver = "";
    private String userName = "teamtrack_ecrzilla";
    private String password = "teamtrack";
    
    private TeamTrackDBController(){
    
    }
    
    private TeamTrackDBController getInstance(){
        if(singleton==null){
            singleton = new TeamTrackDBController();
        }
        return singleton;
    }
}
