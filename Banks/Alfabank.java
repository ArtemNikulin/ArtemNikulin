public class Alfabank extends Bank {
    void deposit(float add){
        super.deposit += super.Add(add,9);
    }
    void withdraw(float add){
        super.deposit -= super.Take(add,6);
    }
    String account(){
        super.name = "Balance in Alfabank: ";
        return super.name + super.deposit + "$";
    }
}