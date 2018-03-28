
package aerochart;

/**
* <h1>Pilot</h1>
* * The Pilot class define the object pilot. 
* 
* <p>
*
* @author  Mariela Bidondo, Eduardo Firinio, Leticia Sessa
* @version 1.0
* @since   30/03/2018
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
      
     public String toString(){
            return name + ", rate: " + rate;
        }
   
}


