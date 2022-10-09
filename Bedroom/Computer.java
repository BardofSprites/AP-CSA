// Name: Daniel Pinkston
// Resources: None

class Computer {
    // initialise instance variables 
    private boolean hackerMode;
    private boolean powerOn;
    private String lightColour;
    String hString = "";
    String pString = "";

    /**
    * @param hMode 
    * @param p 
    * @param c
    */
    public Computer (boolean hMode, boolean l, boolean p, String c) {
        hackerMode = hMode;
        powerOn = p;
        lightColour = c;
    }

    /**
    * @param c
    */
    public void setLightColour(String c) {
        lightColour = c;
    }

    /**
    * @return lightColour
    */
    public String getLightColour() {
        return lightColour;
    }
    /**
    * @return hackerMode
    */

    public boolean gethackerModeOn() {
        return hackerMode;
    }

    /**
    *@param h
    */
    public void setHackerMode(boolean h) {
        hackerMode = h;
    }

    /**
    * @param p
    */
    public void setPowerOn(boolean p) {
        powerOn = p;
    }

    /**
    * @return powerOn
    */
    public boolean getPowerOn() {
        return powerOn;
    }

    /**
    * @return String
    */
    public String computerToString() {
        if(hackerMode == true) {
            hString = "is";
        }
        else{
            hString = "is not";
        }
        if(powerOn == true) {
            pString = "is";
        }
        else{
            pString = "is not";
        }

        return "My computer " + hString + " hacking. The lights are " + lightColour + " in colour. The computer " + pString + "on";
    }
}
