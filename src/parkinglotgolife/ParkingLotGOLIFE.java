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
public class ParkingLotGOLIFE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       inputconsole input1 = new inputconsole();
       
        String s = input1.bacaString();
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replabudi cement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        
//        System.out.println(words[i]);
        if("create_parking_lot".equals(words[0])){
            int[] integers = new int[words.length];
            integers[1] = Integer.parseInt(words[1]);
            parkiran createp = new parkiran(integers[1]);
            int x = 1;
            do{
                String userinpt = input1.bacaString();
                String[] commands = s.split("\\s+");
                for (int j = 0; j < commands.length; j++) {
                commands[j] = commands[j].replaceAll("[^\\w]", "");
                }
                if(commands[0].equals("park")){
                    for(int i=0;i<words.length;i++){
                        for(int j=1;j<commands.length;j++){
                            createp.slot[i][0] = commands[j];
                            createp.slot[i][1] = commands[j];
                            
                        }
                    }
                }
            }while(x!=0);
        }        
    }
    
}
