// Name: Daniel Pinkston
// Resources: None

class Computer {
    // initialise instance variables 
    private boolean hackerMode;
    private boolean lightsOn;
    private boolean powerOn;
    private String lightColour;
    String hString = "";
    String lString = "";
    String pString = "";

    // @params: bool hMode, bool l, bool p, String c
    // sets instance variables to params
    public Computer (boolean hMode, boolean l, boolean p, String c) {
        hackerMode = hMode;
        lightsOn = l;
        powerOn = p;
        lightColour = c;
    }

    // @param String c
    // set string lightColour to param
    public void setLightColour(String c) {
        lightColour = c;
    }

    // @return bol lightColour
    public String getLightColour() {
        return lightColour;
    }

    // @return bool hackerMode
    public boolean gethackerModeOn() {
        return hackerMode;
    }

    /* 
    @param = bool
    changes bool hackerMode
    */
    public void setHackerMode(boolean h) {
        hackerMode = h;
    }

    
    public String computerToString() {
        if(hackerMode == true) {
            hString = "is";
        }
        else{
            hString = "is not";
        }
        if(lightsOn == true) {
            lString = "are";
        }
        else{
            lString = "are not";
        }
        if(powerOn == true) {
            pString = "is";
        }
        else {
            pString = "is not";
        }

        return "My computer " + hString + " hacking. The lights " + lString + " and they are " + lightColour + " in colour. The computer " + pString + "on";
    }
}