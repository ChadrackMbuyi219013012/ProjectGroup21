/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joshua Julies 220102473
 */
public class NumberAdd {
    int x=0, y=0;
    public int Add(int x, int y){
        int addition = x+y; 
        return addition;
    }
    
    public String Display(){
        String val = "x: "+x+"\ny: "+y; 
        return val;
    }
}
