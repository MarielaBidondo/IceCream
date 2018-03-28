
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
public class Airplane {  
    private String model;
    private String make;
    private int capacity;
    private Pilot pilot;
    
    public Airplane (String model, String make, int capacity, Pilot pilot){   
        this.model = model;
        this.make = make;
        this.capacity = capacity;
        this.pilot = pilot;
    }  
    
    public String getMake(){  // return a string with the make of the airplane
        return make;
    }
    
    public String getModel(){  // getModel() – return a number being the airplane’s model
        return model;
    }
    
    public int getCapacity(){ // capacity() - return a number being the capacity of the airplane.
        return capacity;
    }
    
    public Pilot getPilot() { //getPilot() return the pilot info
        return pilot;
    }

}
