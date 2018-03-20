/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerochart;

/**
 *
 * @author Mari
 */
public class AirPlane {  
    private String model;
    private String make;
    private int capacity;
    private String Color;
    
  
    public AirPlane (String model, String make, int capacity){   
        this.model = model;
        this.make = make;
        this.capacity = capacity;   
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

}
