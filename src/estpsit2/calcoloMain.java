/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit2;
import java.util.Date;

/**
 *
 * @author PC
 */
public class calcoloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
   Date data= new Date(18,4,1900);
        calcoloData d1= new calcoloData (data);
        
       d1.calcoloData();
       
       System.out.println("la data successiva è" + d1.calcoloData());
       d1.giorno();
       System.out.println("il giorno è"+d1.giorno());
    }
    
}

