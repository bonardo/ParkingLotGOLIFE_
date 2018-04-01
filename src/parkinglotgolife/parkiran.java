/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglotgolife;

/**
 *
 * @author Rahmat Rijal
 */
public class parkiran {
    public String[][] slot;
    public String plat;
    public String color;

    public parkiran(int n){
        slot = new String[n][2];
        System.out.println("Created parking lot with "+n+" slots");
    }    
}
