public class CarShowroom {
    public CarModel[] spaces;

    // constructor for number of spaces in showroom
    public CarShowroom(int numParkingSpaces) {
        spaces = new CarModel[numParkingSpaces];
    }

    // Returns index of space that contains the car with the specified model
    // and -1 if no car in the showroom is that model.No two cars in the showroom
    // are the same model.

    public int findCarSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Consolidates cars in the showroom so that there are no gaps
    // in the parking spaces so that it's easier to move new models in

    public void consolidate() {
        for (int i = 0; i < spaces.length - 1; i++) {
            if (spaces[i] == null) {
                spaces[i] = spaces[i + 1];
            }
        }
    }

    public String toString() {
        String result = "";
        CarModel sp = null;

        // iterate through the spaces
        for (int i = 0; i < spaces.length; i++) {
            sp = spaces[i];
            result = result + "Space " + i + " has a ";

            // locate empty spaces
            if (sp == null) {
                result = result + " null \n";
            } else {
                result = result + sp.toString() + "\n";
            }
        }
        return result;
    }
}
