package practicequiz1;

public class Vehicle{

    private String make;
    private String model;
    private double fuelCapacity;
    private double fuelLevel;
    private double mpg;
    private double totalMiles = 0;
        
    public Vehicle(String make, String model, double fuelLevel, double fuelCapacity, double mpg){
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.mpg = mpg;
    }

    public Vehicle(String make, String model, double fuelCapacity, double mpg){
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelCapacity;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
    }

    public String toString(){
        return String.format("%s %s (%.1f mpg);  %.1f / %.1f gallons in tank;  Range = %.1f miles" , make, model, mpg, fuelLevel, fuelCapacity, getRange());
    }
    
    public void setMake(String make){
        this.make = make; 
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMpg(double mpg){
        this.mpg = mpg;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public double getFuelCapacity(){
        return fuelCapacity;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public double getMpg(){
        return mpg;
    }

    public double getTotalMiles() {
        return totalMiles;
    }

    public void addGas(double gal){
        if (fuelLevel + gal < fuelCapacity){
            fuelLevel += gal;
        }
        else {
            fuelLevel = fuelCapacity;
        }
    }

    public double getRange(){
        return mpg * fuelLevel;
    }

    public void drive(double miles) {
        totalMiles = totalMiles + miles;
        fuelLevel = fuelLevel - miles/mpg;
    }

}


