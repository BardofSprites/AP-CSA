// Name: Daniel Pinkston
// Resources: None

class Dresser {
  // initialise instance variables
  private int numOpen;
  private int numDrawers;
  private String drawerColour; 

  /**
  * @param int o, sets numOpen to o
  */
  public void setNumOpen(int o) {
    numOpen = o;
  }
   
  /**
  * @return int numOpen
  */
  public int getNumOpen() {
    return numOpen;
  }

  /**
  * @param int d, sets numDrawers to d
  */
  public void setNumDrawers(int d) {
    numDrawers = d;
  }

  /**
  * @return int numDrawers
  */
  public int getNumDrawers() {
    return numDrawers;
  }

  /**
  * @param String c, sets drawerColour to c
  */
  public void setDrawerColour(String c) {
    drawerColour = c;
  }

  /**
  * @return String drawerColour
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