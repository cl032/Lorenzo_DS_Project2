/**
******************************************************
***  Class Name: Car.
***  Class Author:  Chris Lorenzo
******************************************************
* This class models a car's properties and behaviors for
* the GUI application
******************************************************
*** Date: 13 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
package Lorenzo_Project1_ObjClsAttMeth;

/**
 *
 * @author HR1
 */
public class Car {
    
    //Class properties
    private String name;
    private String make;
    private String model;
    private String color;
    public int speed;
    
    //Class constructor
    public Car(String name, String make, String model, String color)
    {
        this.name = name;
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }
    
    public String getName() //Method to get's Car's name
    {
        return name;
    }
    
    public void setName(String name)    //Method to set Car's name
    {
        this.name = name;
    }
    
    public String getMake()     //Method to get Car's Make
    {
        return make;
    }
    
    public void setMake(String make)        //Method to set Car's make
    {
        this.make = make;
    }
 
    public String getModel()        //Method to get Car's Model
    {
        return model;
    }
    
    public void setModel(String model)      //Method to set Car's Model
    {
        this.model = model;
    }
    
    public String getColor()        //Method to get Car's Color
    {
        return color;
    }
    
    public void setColor(String color)      //Method to set Car's color
    {
        this.color = model;
    }
    
    public int getSpeed()       //Method to get Car's speed
    {
        return this.getSpeed();
    }
    
    public void accelerate()        //Method to increment car's speed by 5
    {
        this.speed += 5;
    }
    
    public void brake()         //Method to decrement Car's speed by 5 and test if value is zero first to return
    {
        if(this.speed == 0)
        {
            return;
        }
        else
        {
        this.speed -= 5;
        }
    }     
}
