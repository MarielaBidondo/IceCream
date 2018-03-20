/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerochart;

/**
 *
 * @author Mari
 */
public class Pilot{
    private String name;
    private int license;
    private int rate;
    
    public Pilot (String name, int license, int rate){
        this.name = name;
        this.license = license;
        this.rate = rate;
    } 
    
    public String getPilot(){//– return (at a minimum) the pilot’s name
        return name;
    } 
}