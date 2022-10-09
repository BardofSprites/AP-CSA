// Name: Daniel Pinkston
// Resources: None

class Desk {
    // initialise instance variables
    private String mouseColour; 
    private int numCups;
    private String deskBook;
    /**
    * @param String m, sets mouseColour to m
    */
    public void setMouseColour(String m) {
        mouseColour = m;
    }
    /**
    * @return String mouseColour
    */
    public String getMouseColour() {
        return mouseColour;
    }
    /**
    * @param int c, sets numCups to c
    */
    public void setNumCups(int c) {
        numCups = c;
    }
    /**
    * @return int numCups
    */
    public int getNumCups() {
        return numCups;
    }
    /**
    * @param String d 
    */
    public void setDeskBook(String d) {
        deskBook = d;
    }
    /**
    * @return String deskBook
    */
    public String getDeskBook() {
        return deskBook;
    }
    
    /**
    * @return String
    */
    public String deskToString() {
        return "My mouse is " + mouseColour + " and I have " + numCups + " on my desk. I have " + deskBook + " on my desk.";
    }
    
}