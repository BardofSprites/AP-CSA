// Name: Daniel Pinkston
// Resources: None

public class Bookshelf {
    // initialise instance variables
    private String shelfColour;
    private int numBooks;
    private boolean booksOnShelf;
    
    public Bookshelf(int b, boolean s) {
        shelfColour = "brown";
        numBooks = b;
        booksOnShelf = s; 
    }

    /**
    * @return shelfColour
    */
    public String getShelfColour() {
        return shelfColour;
    }

    /**
    * @param b
    */
    public void setNumBooks(int b) {
        numBooks = b;
    }

    /**
    * @return numBooks
    */
    public int getNumBooks() {
        return numBooks;
    }

    /**
    * @param s
    */
    public void setBooksOnShelf(boolean s) {
        booksOnShelf = s;
    }

    /**
    * @return booksOnShelf
    */
    public boolean getBooksOnShelf() {
        return booksOnShelf;
    }

}