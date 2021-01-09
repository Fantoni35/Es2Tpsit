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
public class calcoloData {
    private Date data;
   
    public calcoloData(Date data)
    {
        this.data=data;
    }
   
    public Date calcoloData()
    {
        if(data.getDay()== 31 && data.getMonth()==11)
        {
            
            data.setDate(1); 
            data.setMonth(1);
            data.setYear(data.getYear()+1);
            
        }
        if(data.getDay()== 31 && data.getMonth()== 2 && data.getMonth()==4 &&data.getMonth()==7 && data.getMonth()==9)
        {
             data.setDate(1); 
            data.setMonth(data.getMonth()+1);
            data.setYear(data.getYear());
        }
        if(data.getDay()== 30 && data.getMonth()== 2 && data.getMonth()==4 &&data.getMonth()==7 && data.getMonth()==9)
        {
          data.setDate(31); 
          data.setMonth(data.getMonth());
          data.setYear(data.getYear());
        }
        if(data.getDay()== 30){
            data.setDate(1); 
            data.setMonth(data.getMonth()+1);
            data.setYear(data.getYear());
        }
          if(data.getMonth()==2)
          {
          boolean bisestile = ( data.getYear()>1584 && ( (data.getYear()%400==0) ||  (data.getYear()%4==0 && data.getYear()%100!=0) ) );
          if(bisestile==true)
          {
              if(data.getDate()==28)
              {
                   data.setDate(29);
                   data.setMonth(data.getMonth());
                   data.setYear(data.getYear());
        
              }
              if(data.getDate()==29)
              {
                 data.setDate(1);
                  data.setMonth(data.getMonth()+1);
                  data.setYear(data.getYear());
              }
          }
            if(bisestile==false)
          {
              if(data.getDate()==28)
              {
                  data.setDate(1);
                  data.setMonth(data.getMonth()+1);
                  data.setYear(data.getYear());
              }
          }
          }
                  data.setDate(data.getDate()+1);
                  data.setMonth(data.getMonth());
                  data.setYear(data.getYear());
                
                
    return data;
    }
    
    
    public String giorno()
    {
        
        int numeroG=data.getDay();
        String nome="";
        if(numeroG==0)
        {
          nome="domenica";
        }
        if(numeroG==1)
        {
            nome="lunedi";
        }
        if(numeroG==2)
        {
             nome="martedi";
        }
          if(numeroG==3)
        {
             nome="mercoledi";
        }
          if(numeroG==4)
        {
             nome="giovedi";
        }
          if(numeroG==5)
        {
             nome="venerdi";
        }
         if(numeroG==6)
        {
            nome="sabato";
        }
         return nome;
    }
}


