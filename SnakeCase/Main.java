class Main {
    public static void main(String[] args) {
        String[] data = { "A", "B", "C", "D", "E" };
        SnakeList<String> nagini = new SnakeList<String>(data);
        Lab81 tester = new Lab81();

        System.out.println("Original Data: " + nagini);

        System.out.println("Test get(3) -> " + tester.get(3, nagini));

        System.out.println("Test getLast(3) -> " + tester.getLast(nagini));

        System.out.println("Test size(3) -> " + tester.size(nagini));

        System.out.println("Test count(nagini) -> " + tester.count("A",nagini));

        System.out.println("Test contains(\"A\",nagini) -> " + tester.contains("A",nagini));

        System.out.println("Test remove(\"A\") -> " + tester.remove(0, nagini));

        System.out.println("Test removeAll(\"A\") -> " + tester.removeAll("A", nagini));

        System.out.println("Test add(\"A\") -> " + tester.add("A", nagini));

        System.out.println("Test duplicateAll() -> " + tester.duplicateElements(nagini));

        System.out.println("Test sublist(1,3) -> " + tester.sublist(1, 3, nagini));
    }
}
