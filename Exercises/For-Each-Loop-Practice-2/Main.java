class Main {
  public static void main(String[] args) {
    //Part A
    Student julian = new Student("Julian", "Jones", 9);
    Student larisa = new Student("Larisa", "Torres", 10);
    Student amada = new Student("Amada", "Robin", 10);
    Student mikka = new Student("Mikka", "Leads", 9);
    Student jay = new Student("Jay", "Khalil", 10);

    Student[] classroom = {julian, larisa, amada, mikka, jay};

    // for each for printing goes here
    for (Student i :classroom) {
        System.out.println(i.toString());
    }

    //Part B
    int[] numArray =  {12, 17, 65, 7, 30, 88};

    // Create an ArrayAverage object and print the result
    ArrayAverage arr = new ArrayAverage(numArray);
    System.out.println(arr.getAverage());
  }
}
