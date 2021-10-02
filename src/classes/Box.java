package classes;

public class Box {

    int height;
    int length;
    int width;

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public long calculateVolume() {
        return (long) this.width * this.length * this.height;
    }

    public void printBox() {
        System.out.println("Box is " + this.height + "x" + this.width + "x" + this.length);
    }
}
