public class Privatbank extends Bank {

    void deposit(float add){
        super.deposit += super.Add(add,8);
    }
    void withdraw(float add){
        super.deposit -= super.Take(add,7);
    }
    String account(){
        super.name = "Balance in Privatbank: ";
        return super.name + super.deposit + "$";
    }


}