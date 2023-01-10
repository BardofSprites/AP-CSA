// Name: Daniel Pinkston

class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        String str = deck.toString();
        System.out.println("Original Deck");
        System.out.println(str);
        deck.shuffle();
        String str2 = deck.toString();
        System.out.println("Not Original Deck");
        System.out.println(str2);
    }
}
