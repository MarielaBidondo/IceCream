/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerochart;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author Mari
 */
public class Flight {
     private String orig; 
     private String dest;
     private int d_time; //isnt int check it out and epoch as well!!!!!!
     private int a_time;
     private Date date; //??
     
     

     public Flight(String orig, String dest, int d_time,int a_time, Date date){
         this.orig = orig;
         this.dest = dest;
         this.d_time = d_time;
         this.a_time = a_time;
         this.date = date;
     
     }
     
     
//aircraft assigned (this should be an object);
}
