package classObject;
public class defandparaconstr {
  
}class Box {

    double length;
    double width;
    double height;
    Box() {
        length = 1;
        width = 1;
        height = 1;
        System.out.println("Default Constructor Called");
    }
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        System.out.println("Parameterized Constructor Called");
    }

    void calculateVolume() {
        double volume = length * width * height;
        System.out.println("Volume of Box = " + volume);
    }

    public static void main(String[] args) {

        Box b1 = new Box();
        b1.calculateVolume();

        System.out.println();

        Box b2 = new Box(5, 4, 3);
        b2.calculateVolume();
    }
}

