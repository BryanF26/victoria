public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2020;
        myCar.drive();

        Motor myMotor = new Motor("Honda", 2020);
        System.out.println(myMotor.model+" "+myMotor.year);
        Motor myMotor2 = new Motor("Yamaha", 2022);
        System.out.println(myMotor2.model+" "+myMotor2.year);

        Sepeda mySepeda = new Sepeda();
        System.out.println(mySepeda.model+" "+mySepeda.year);
        Sepeda mySepeda2 = new Sepeda();
        System.out.println(mySepeda2.model+" "+mySepeda2.year);
    }
}