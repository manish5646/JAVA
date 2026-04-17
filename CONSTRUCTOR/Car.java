public class Car {
    String color;
    int num;
    static int regNum = 100;

    Car(String color) {
        this.color = color;
        num = regNum;
        regNum++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("RED");
        Car c2 = new Car("BLACK");

        c1.num = 2222;

        System.out.println(c1.color + "\t" + c1.num);
        System.out.println(c2.color + "\t" + c2.num);
    }
}
