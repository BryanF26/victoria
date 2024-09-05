public class Main {

    public static double LuasLingkaran(double pi, int r){
        return (pi * Math.pow(r,2));
    }

    public static String OddOrEven(Integer num){
        if (num % 2 == 0){
            return "genap";
        }
        return "ganjil";
    }

    public static String MoreThanFifty (Integer num){
        if (num > 50){
            return "lebih besar dari 50";
        }
        return "lebih kecil dari 50";
    }

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        long bankAccount;
//        int myAge;
//        double temperature;
//        float temperatures;
//        char firstNameLetter;
//        boolean passTest;
//        bankAccount = 40000000;
//        myAge = 22;
//        temperature = 36.77;
//        temperatures = 36.77f;
//        firstNameLetter = 'B';
//        passTest = true;
//        System.out.println(bankAccount);
//        System.out.println(myAge);
//        System.out.println(temperature);
//        System.out.println(temperatures);
//        System.out.println(firstNameLetter);
//        System.out.println(passTest);

//        final double pi = Math.PI;
//        int r;
//        r = 10;
//        double L1;
//        L1 = LuasLingkaran(pi, r);
//        r = 15;
//        double L2;
//        L2 = LuasLingkaran(pi, r);
//        System.out.println("Luas lingkaran 1 adalah "+L1);
//        System.out.println("Luas lingkaran 2 adalah "+L2);

//        int angka;
//        angka = 10;
//        if (angka % 2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }
//        angka = 15;
//        if (angka % 2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

//        int myNumber = 5;
//        String myString = "5";
//        System.out.println(myNumber == myString);


//        Integer [] angka = new Integer[]{10, 75, 76, 57};
//        for(Integer num : angka){
//            String oddOrEven = OddOrEven(num);
//            String fifty = MoreThanFifty(num);
//            System.out.println("Angka "+fifty+" dan "+oddOrEven);
//        }

//        Integer [] day = new Integer[]{1, 2, 3, 5};
//        String dayName;
//        for(Integer num : day){
//            switch (num) {
//                case 1: dayName = "Sunday"; break;
//                case 2: dayName = "Monday"; break;
//                case 3: dayName = "Tuesday"; break;
//                default: dayName = "Invalid Day"; break;
//            }
//            System.out.println(dayName);
//        }

//        Integer [] day = new Integer[]{10, 75, 76, 57};
//        String oddOrEven;
//        for(Integer num : day){
//            switch (num % 2) {
//                case 0: oddOrEven = "Even"; break;
//                case 1: oddOrEven = "Odd"; break;
//                default: oddOrEven = ""; break;
//            }
//            System.out.println(oddOrEven);
//        }

//        for (int i=1; i<=50; i++){
//            if (i%2==0){
//                System.out.println("Even");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

//        int i = 1;
//        while (i<=50){
//            if (i%2==0){
//                System.out.println("Even");
//            }
//            else {
//                System.out.println(i);
//            }
//            i++;
//        }

//        for (int i=1; i<=50; i++){
//            if(i % 15 == 0){
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i=1; i<=30; i++){
//            if(i % 2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }

        Integer num;
        num = 10;
        Integer total;
        total = 1;
        for (int i=num; i>0; i--){
            total *= i;
        }
        System.out.println(num+"! = "+total);

    }
}