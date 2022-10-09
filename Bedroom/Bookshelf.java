// Name: Daniel Pinkston
// Resources: None

public class Bookshelf {
    // initialise instance variables
    private String shelfColour;
    private int numBooks;
    private boolean booksOnShelf;
    
    /**
    * @param String s, sets shelfColour to s
    */
    public void setShelfColour(String s) {
        shelfColour = s;
    }

    /**
    * @return String shelfColour
    */
    public String getShelfColour() {
        return shelfColour;
    }

    /**
    * @param int b, sets numBooks to b
    */
    public void setNumBooks(int b) {
        numBooks = b;
    }

    /**
    * @return int numBooks
    */
    public int getNumBooks() {
        return numBooks;
    }

    /**
    * @param boolean b, sets booksOnShelf to s
    */
    public void setBooksOnShelf(boolean s) {
        booksOnShelf = s;
    }

    /**
    * @return boolean booksOnShelf
    */
    public boolean getBooksOnShelf() {
        return booksOnShelf;
    }

}