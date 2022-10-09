// Name: Daniel Pinkston
// Resources: none

class Lamp {

    // initialise instance variables
    private boolean lampOn;
    private int numOn;
    private boolean pluggedIn;
    String lString = "";
    String pString = "";

    /**
    * @param l
    */
    
    public Lamp (boolean l, int o) {
        lampOn = l;
        numOn = o;
        pluggedIn = true;
    }

    /**
    * @return String about the lamp
    */
    public String checkLamp() {
        if(pluggedIn == true) {
            if(lampOn == true) {
                lString = "is";
            }
            else{
                lString = "is not";
            }
            return "The lamp " + lString + " on.";
        }
        return "The lamp is not plugged in, therefore it is not on.";
    }

    /**
    * @param l
    */
    public void setLampOn(boolean l) {
        if(pluggedIn == true) {
            lampOn = l;
        }
        else {
            System.out.println("The lamp is not plugged in, therefore cannot be turned on.");
        }
    }

    /**
    * @return lampOn
    */
    public boolean getLampOn() {
        return lampOn;
    }

    /**
    * @param o
    */
    public void setNumOn(int o) {
        if(o>3) {
            numOn = 3; 
        }
        else{
            numOn = o;
        }
    }

    /**
    * @return numOn
    */
    public int getNumOn() {
        return numOn;
    }
    
    /**
    * @param p
    */
    public void setPluggedIn(boolean p) {
        pluggedIn = p;
    }
    
    /**
    * @return pluggedIn
    */
    public boolean getPluggedIn() {
        return pluggedIn;
    }
    
    /**
    * @return String
    */
    public String lampToString() {
        if(lampOn == true) {
            lString = "is";
        }
        else {
            lString = "is not";
        }
        
        if(pluggedIn == true) {
            pString = "is";
        }
        else {
            pString = "is";
        }
        
        return "The lamp " + lString + " and " + pString + " plugged in. " + numOn + " bulbs are turned on at the moment.";
    }
}
