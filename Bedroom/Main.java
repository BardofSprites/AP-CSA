// Name: Daniel
// Resources: None


// {className}ToString 
class Main {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp(true, 2);
        myLamp.checkLamp();
        
        Desk myDesk = new Desk("Black", 0, "Unix in a Nutshel");
        String book = myDesk.getDeskBook();
        System.out.println(book);

        Dresser myDresser = new Dresser(0);
        myDresser.setNumOpen(2);

        Walls myWalls = new Walls("Grey", 3, false);
        String wallColour = myWalls.getPaintColour();
        System.out.println("Your walls are " + wallColour + ".");

        Bed myBed = new Bed();
        String bedSize = myBed.getBedSize();
        System.out.println("My bed is a " + bedSize);

        Computer myComputer = new Computer(true, true, "green");
        myComputer.setHackerMode(false);

        Bookshelf myBookshelf = new Bookshelf(50, false);
        int numBooks = myBookshelf.getNumBooks();
        System.out.println("My shelf has " + numBooks + " books.");
    }
}