package classes;

public class BoxUsage {

    public static void main(String[] args) {
        Box box1 = new Box(2, 4, 6);
        Box box2 = new Box(3, 5, 7);

        box1.printBox();
        box2.printBox();

        long volume1 = box1.calculateVolume();
        System.out.println("The volume of first box is: " + volume1);
        long volume2 = box2.calculateVolume();
        System.out.println("The volume of second box is: " + volume2);
    }
}
