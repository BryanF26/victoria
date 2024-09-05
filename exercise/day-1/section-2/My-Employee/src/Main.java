public class Main {
    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        myEmployee.name = "Bryan";
        myEmployee.npk = "65855";
        myEmployee.salary = 50000000.0;
        myEmployee.address = "Muara Kareng";
        myEmployee.age = 22;
        myEmployee.sayHello();
        System.out.println(myEmployee.name+" "+myEmployee.npk+" "+myEmployee.salary+" "+myEmployee.address+" "+myEmployee.age);

        Employee myEmployee2 = new Employee();
        myEmployee2.name = "Felix";
        myEmployee2.npk = "65854";
        myEmployee2.salary = 30000000.0;
        myEmployee2.address = "Osim Uios";
        myEmployee2.age = 44;
        myEmployee2.sayHello();
        System.out.println(myEmployee2.name+" "+myEmployee2.npk+" "+myEmployee2.salary+" "+myEmployee2.address+" "+myEmployee2.age);

    }
}