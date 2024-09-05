public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return this.a + this.b;
    }

    public int subtract(){
        return this.a - this.b;
    }

    public int multiply(){
        return this.a * this.b;
    }

    public double divide(){
        if (this.b == 0){
            System.out.println("Pembagi tidak boleh 0");
            return 0;
        }
        return this.a / this.b;
    }
}
