
package aerochart;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
* <h1>Flight</h1>
* The Flight class define the  flight class .
* <p>
*
* @author  Mariela Bidondo, Eduardo Firinio, Leticia Sessa
* @version 1.0
* @since   30/03/2018
*/
public class Flight {
    private int flightNo ; 
    private String orig; 
    private String dest;
    private int d_time; //isnt int check it out and epoch as well!!!!!!
    private int a_time;
    private Date date; //??

    public Flight(int flightNo, String orig, String dest, int d_time,int a_time, Date date){
        this.flightNo = flightNo;
        this.orig = orig;
        this.dest = dest;
        this.d_time = d_time;
        this.a_time = a_time;
        this.date = date;
    } 
    public int getFlightNo() { //Method to get Flight No
        return flightNo;
    }
    public String getOrig() { //Method to get origin of the flight
        return orig;           
    }
    public String getDest() { //Method to get destination of the flight
        return dest;
    }
    public int getD_time() { //Method to get departure time of the flight
        return d_time;
    }
    public int getA_time() { //Method to get arrival time of the flight
        return a_time;
    }
    public Date getDate() { //Method to get date of the flight
        return date;
    }
    
    
}
     
//aircraft assigned (this should be an object);

