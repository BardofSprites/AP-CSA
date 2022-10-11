// Name: Daniel Pinkston
// Resources: None

class Dresser {
  // initialise instance variables
  private int numOpen;
  private int numDrawers;
  private String drawerColour; 

  public Dresser (int o) {
    numOpen = o;
    numDrawers = 6; 
    drawerColour = "White";
  }
  /**
  * @param o
  */
  public void setNumOpen(int o) {
    numOpen = o;
  }
   
  /**
  * @return numOpen
  */
  public int getNumOpen() {
    return numOpen;
  }

  /**
  * @return int numDrawers
  */
  public int getNumDrawers() {
    return numDrawers;
  }

  /**
  * @return drawerColour
  */
  public String getDrawerColour() {
    return drawerColour;
  }

  /**
  * @return String
  */
  public String dresserToString() {
    return "My dresser has " + numDrawers + " drawers. " + numOpen + " of them are open. The drawers are " + drawerColour + ".";
  }
}