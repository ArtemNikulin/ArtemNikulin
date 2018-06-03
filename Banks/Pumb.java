public class Pumb extends Bank{

    void deposit(float add){
        super.deposit += super.Add(add,4);
    }
    void withdraw(float add){
        super.deposit -= super.Take(add,2);
    }
    String account(){
        super.name = "Balance in PUMB: ";
        return super.name + super.deposit + "$";
    }
}