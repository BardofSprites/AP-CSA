// Name: Daniel Pinkston
// Resources: None

class Walls {

    // initialise instance variables
    private String paintColour;
    private int numDoors;
    private boolean posterOnWall;; 
    String pString = "";

    // @param String p, sets paintColour to p
    public void setPaintColour(String p) {
        paintColour = p;
    }
    
    // @return String paintColour
    public String getPaintColour() {
        return paintColour;
    }
    
    // @param int d, sets numDoors to d
    public void setNumDoors(int d) {
        numDoors = d;
    }

    // @return int numDoors
    public int getNumDoors() {
        return numDoors;
    }

    // @param boolean p, set poster to p
    public void setPosterOnWall(boolean p) {
        posterOnWall = p;
    }

    // @return boolean poster
    public boolean getPosterOnWall() {
        return posterOnWall;
    }

    //@return String
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