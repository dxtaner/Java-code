public class Main {
    public static void main(String[] args) {
        Fighter lara = new Fighter("Lara" , 28 , 100, 90, 15);
        Fighter jara = new Fighter("Jara" , 25 , 95, 92, 25);
        Fighter tara = new Fighter("Tara" , 30 , 90, 88, 18);
        Ring ring = new Ring(lara, tara, 120 , 85);
        ring.run();

    }
}
