// Name: Daniel Pinkston
// Resources: None

class Walls {

    //initialise instance variables
    private String paintColour;
    private int numDoors;
    private boolean posterOnWall;; 
    String pString = "";

    public Walls (String c, int d, boolean p) {
        paintColour = c; 
        numDoors = d;
        posterOnWall = p; 
    }
    /**
    * @param p
    */
    public void setPaintColour(String p) {
        paintColour = p;
    }
    
    /**
    * @return paintColour
    */
    public String getPaintColour() {
        return paintColour;
    }
    
    /**
    * @param d
    */
    public void setNumDoors(int d) {
        numDoors = d;
    }

    /**
    * @return numDoors
    */
    public int getNumDoors() {
        return numDoors;
    }

    /**
    * @param p
    */
    public void setPosterOnWall(boolean p) {
        posterOnWall = p;
    }

    /**
    * @return poster
    */
    public boolean getPosterOnWall() {
        return posterOnWall;
    }

    /**
    * @return String
    */
    public String wallsToString() {
        if(posterOnWall == true ) {
            pString = "have";
        }
        else {
            pString = "don't have";
        }
        return "My walls are " + paintColour + " and " + pString + " posters. There are " + numDoors + " on my walls.";
    }    
}