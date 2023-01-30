import java.util.*;

public class MasterOrder {
  /** The list of all cookie orders */
  private List<CookieOrder> orders;

  /** Constructs a new MasterOrder object */
  public MasterOrder() { orders = new ArrayList<CookieOrder>(); }

  /**
   * Adds theOrder to the master order.
   *   @param theOrder the cookie order to add to the master order
   */
  public void addOrder(CookieOrder theOrder) { orders.add(theOrder); }

  /**
   * @return the sum of the number of boxes of all of the cookie orders
   */
  public int getTotalBoxes() {
    int sum = 0;
    for (CookieOrder order : orders) {
      sum += order.getNumBoxes();
    }
    return sum;
  }

  // There may be instance variables, constructors, and methods that are not
  // shown.
  public void removeVariety(String cookieVar) {
      for (int i = 0; i < orders.size(); i++) {
          if (orders.get(i).getVariety().equals(cookieVar)) {
              orders.remove(i);
              i--;
          }
      }
  }
}
