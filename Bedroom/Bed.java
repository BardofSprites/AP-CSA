// Name: Daniel Pinkston
// Resources: None

class Bed {
    // initialise instance variables
    private String bedSize;
    private int numPillows;
    private int numBlankets;

    /*
    @param int p, int b, String s
    Sets numPillows , numBlankets, bedSize to repective params 
    */
    public Bed () {
        numPillows = 2;
        numBlankets = 2;
        bedSize = "twin";
    }
    
    // @param int pillow, sets numPillows to pillow 
    public void setPillow(int pillow) {
        numPillows = pillow;
    }

    // @return int numPillows
    public int getPillow() {
        return numPillows;
    }

    // @param int blanket, sets numBlanket to blanket
    public void setBlankets(int blanket) {
        numBlankets = blanket;
    }

    // @return int numBlankets
    public int getBlankets() {
        return numBlankets;
    }

    // @param String size, sets bedSize to size
    public void setBedSize(String size) {
        bedSize = size;
    }

    // @return String bedSize
    public String getBedSize() {
        return bedSize;
    }
    
    // @return String
    public String bedToString() {
        return "My bed has " + numPillows + " and " + numBlankets + " blankets. It is a " + bedSize + "bed.";
    }
}