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
    * @params: bool hMode, bool l, bool p, String c
    * sets instance variables to params
    */
    public Computer (boolean hMode, boolean l, boolean p, String c) {
        hackerMode = hMode;
        powerOn = p;
        lightColour = c;
    }
    /**
    * @param String c, sets lightColour to c
    */
    public void setLightColour(String c) {
        lightColour = c;
    }
    /**
    * @return bool lightColour
    */
    public String getLightColour() {
        return lightColour;
    }
    /**
    * @return bool hackerMode
    */
    public boolean gethackerModeOn() {
        return hackerMode;
    }
    /**
    *@param boolean h, sets hackerMode to h
    */
    public void setHackerMode(boolean h) {
        hackerMode = h;
    }
    /**
    * @param boolean p, sets powerOn to p
    */
    public void setPowerOn(boolean p) {
        powerOn = p;
    }
    /**
    * @return bool powerOn
    */
    public boolean getPowerOn() {
        return powerOn;
    }
    /**
    * @return bool lightsOn
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
