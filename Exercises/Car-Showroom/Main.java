class Main {
    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom(7);
        showroom.spaces[0] = new CarModel("Mustang", 157);
        showroom.spaces[1] = new CarModel("Camaro", 155);
        showroom.spaces[3] = new CarModel("Corvette", 194);
        showroom.spaces[6] = new CarModel("Porsche", 210);

        // print out what is in the showroom
        System.out.println(showroom);

        // test output
        System.out.println("Index of Mustang should be 0 and is " + showroom.findCarSpace("Mustang"));
        System.out.println("Index of Corvette should be 3 and is " + showroom.findCarSpace("Corvette"));
        System.out.println("Index of Miata should be -1 and is " + showroom.findCarSpace("Miata"));

        System.out.println("\nOriginal Car Showroom:");
        System.out.println(showroom);
        showroom.consolidate();
        System.out.println("Car Showroom after cars have been consolidated:");
        System.out.println(showroom);
    }
}
