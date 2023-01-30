public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    /** Constructs a ReviewCollector object and initializes the instance variables. */
    public ReviewCollector()
    {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

        /** Adds a new review to the collection of reviews, as described in part (a). */
    public void addReview(ProductReview prodReview) {
        ReviewCollector rc = new ReviewCollector();
        if (!rc.productList.contains(prodReview.getName())) {
            rc.productList.add(prodReview.getName());
        }
    }

    /** Returns the number of good reviews for a given product name, as described in part (b). */
    public int getNumGoodReviews(String prodName) {
        if (reviewList.contains(prodName)) {
            prodName = prodName.toLowerCase();
            if (prodName == "best") {
                return 1;
            }
        }
        else {
            return 0;
        }
    }
    // There may be instance variables, constructors, and methods not shown.

}
