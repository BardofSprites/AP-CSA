public class Company {
    
  private String name;
  private String streetAddress;
  private String city;
  private String state;

  /** constructs a Company object with only 
      a name, street address, city and state 
      are null
      @param name - name of the company
  */
  public Company(String name){
    this.name = name;
    streetAddress = null;
    city = null;
    state = null;
  }
  
  /** Constructs a Company object with a 
      name, street address, city and state
      @param name - name of the company
      @param streetAddress - location of company
      @param city - the city location
      @param state - the state location
  */
  public Company(String name, String streetAddress, String city, String state){
    this.name = name;
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
  }

    /** returns the name of the company
        @return name - name of the company
    */
    public String getName(){
      return name;
    }

    /** returns the address of the company
        Example output:
        123 Main St
        Springfield, OH
        @return streetAddress - address of company
    */
    public String address(){
      return streetAddress;
    }
  
    /** returns the company information
        Example output:
        Widget Company
        123 Main St
        Springfield, OH
        @return string with the company name and address
    */
    public String toString(){
       return name + "company at " + streetAddress;
    }
}
