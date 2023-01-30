import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Part 1
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);
        System.out.println(search(array, 5.0));

        // Part 2
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("Hello");
        array2.add("Monday");
        array2.add("Hello");
        array2.add("Hello");
        array2.add("Tuesday");
        array2.add("Friday");
        for (String word : array2){
            System.out.println(word);
        }
        removeAll(array2, "Hello");

        //Part 3 - DONE
        ArrayList<String> allPlayers = new ArrayList<String>();
        addPlayers(allPlayers);
        String[] myTeam = new String[5];

        for (int i=0; i<myTeam.length; i++) {
            System.out.println("Enter a player name:");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            for (int j=0; j<allPlayers.size(); j++) {
                if (name.equals(allPlayers.get(j))) {
                    myTeam[i] = name;
                    allPlayers.remove(j);
                    System.out.println("Successfully added the player to your team!");
                }
                else {
                    System.out.println("Failed to add the player to your team!");
                    i--;
                    break;
                }
            }
        }
    }

    // Part 1 Search
    public static int search(ArrayList<Double> array, double key) {
        for (int i = 0; i < array.size(); i++){
            if (array.get(i) == key){
                return i;
            }
        }
        return -1;
    }
    //Part 2 Search and Remove
    public static void removeAll(ArrayList<String> arr, String key){
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).equals(key)) {
                arr.remove(i);
                i--;
            }
        }
    }
    // Part 3 Search
    public static int search(ArrayList<String> array, String player) {
        for (int i=0; i<array.size(); i++) {
            if (array.get(i).equals(player)) {
                return i;
            }
        }
        return -1;
    }

    public static void addPlayers(ArrayList<String> array) {
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
