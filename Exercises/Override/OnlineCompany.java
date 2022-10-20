public class OnlineCompany extends Company{

  private String webAddress;
  
  /** Constructs an OnlineCompany object with a 
      name and web address
      @param name - name of the company
      @param webAddress - location of company on the web
  */
  public OnlineCompany(String name, String webAddress) {
    super(name);
    this.webAddress = webAddress;
  }
  
  /** returns the web address of the company
      @return webAddress - web address of company
  */
  @Override
  public String address(){
     return webAddress;
  }

  /** returns the company information
      Example output:
      Widget Company
      www.widgetcompany.com
      @return string with the company name and email address
  */
  @Override
  public String toString(){
    return super.getName() + " at the website " + webAddress; 
  }
}
