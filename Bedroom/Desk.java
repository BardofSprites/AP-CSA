// Name: Daniel Pinkston
// Resources: None

class Desk {
    // initialise instance variables
    private String mouseColour; 
    private int numCups;
    private String deskBook;
    
    public Desk (String c, int n, String b) {
        mouseColour = c;
        numCups = n;
        deskBook = b;
    }

    /**
    * @param m
    */
    public void setMouseColour(String m) {
        mouseColour = m;
    }
    /**
    * @return mouseColour
    */
    public String getMouseColour() {
        return mouseColour;
    }
    /**
    * @param c
    */
    public void setNumCups(int c) {
        numCups = c;
    }
    /**
    * @return numCups
    */
    public int getNumCups() {
        return numCups;
    }
    /**
    * @param d 
    */
    public void setDeskBook(String d) {
        deskBook = d;
    }
    /**
    * @return deskBook
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