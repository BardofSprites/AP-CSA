// Name: Daniel Pinkston
// Resources: None

class Bed {
    // initialise instance variables
    private String bedSize;
    private int numPillows;
    private int numBlankets;

    /**
    * @param p
    * @param b
    * @param s
    * Sets numPillows , numBlankets, bedSize to repective params 
    */
    public Bed () {
        numPillows = 2;
        numBlankets = 1;
        bedSize = "twin";
    }
    
    /**
    * @param pillow
    */
    public void setPillow(int pillow) {
        numPillows = pillow;
    }

    /**
    * @return numPillows
    */
    public int getPillow() {
        return numPillows;
    }

    /**
    * @param blanket
    */
    public void setBlankets(int blanket) {
        numBlankets = blanket;
    }

    /**
    * @return numBlankets
    */
    public int getBlankets() {
        return numBlankets;
    }

    /**
    * @param size
    */
    public void setBedSize(String size) {
        bedSize = size;
    }

    /**
    * @return bedSize
    */
    public String getBedSize() {
        return bedSize;
    }
    
    /**
    * @return String
    */
    public String bedToString() {
        return "My bed has " + numPillows + " and " + numBlankets + " blankets. It is a " + bedSize + "bed.";
    }
}
