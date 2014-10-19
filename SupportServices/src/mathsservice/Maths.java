
package mathsservice;


/**
 *
 * @author Jamie
 */
public class Maths extends SupportServices {
    //Class for the Array Lists 
    //Variblies
    private int Number;
    private double Year;
    private String module;
    private String Des;

  
    
    public Maths(){
        Number = 0;
        Year = 0;
        module = new String();
        Des = new String();
    }
    //Setters and Getters for the Varibles 
    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public double getYear() {
        return Year;
    }

    public void setYear(double Year) {
        this.Year = Year;
    }

    public String getmodule() {
        return module;
    }

    public void setmodule(String module) {
        this.module = module;
    }
    
    public String getDes() {
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }
    
    
}

