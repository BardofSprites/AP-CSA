// Name: Daniel Pinkston
// Resources: none

class Lamp {

    // initialise instance variables
    private boolean lampOn;
    private int numOn;
    private boolean pluggedIn;
    String lString = "";
    String pString = "";

    /*
    @param boolean l, int o
    Sets lampOn, numOn to respective params
    */
    
    public Lamp (boolean l, int o) {
        lampOn = l;
        numOn = o;
        pluggedIn = true;
    }

    // @return String about the lamp
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

    // @param boolean l, sets lampOn to l 
    public void setLampOn(boolean l) {
        lampOn = l;
    }

    // @return boolean lampOn
    public boolean getLampOn() {
        return lampOn;
    }

    // @param int o, sets numOn to o
    public void setNumOn(int o) {
        if(o>3) {
            numOn = 3; 
        }
        else{
            numOn = o;
        }
    }

    // @return int numOn
    public int getNumOn() {
        return numOn;
    }
    
    // @param boolean p, sets pluggedIn to p
    public void setPluggedIn(boolean p) {
        pluggedIn = p;
    }
    
    // @return boolean pluggedIn
    public boolean getPluggedIn() {
        return pluggedIn;
    }
    
    // @return String
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