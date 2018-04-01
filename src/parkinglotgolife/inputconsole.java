/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglotgolife;
import java.io.*;
/**
 *
 * @author Rahmat Rijal
 */
public class inputconsole {


    public String bacaString(){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in), 1);
        String string = "";
        try{
            string = bfr.readLine();
        }
        catch(IOException x){
            System.out.println(x);
        }
        return string;
    }
    
    public int bacaInt(){
        return Integer.parseInt(bacaString());
    }

    public float bacaFloat(){
        return Float.parseFloat(bacaString());
    }

    public long bacaLong(){
        return Long.parseLong(bacaString());
    }    
    
}    

