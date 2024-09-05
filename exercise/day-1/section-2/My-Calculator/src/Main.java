public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator(4,2);
        System.out.println(myCalc.add());
        System.out.println(myCalc.subtract());
        System.out.println(myCalc.multiply());
        System.out.println(myCalc.divide());
    }
}