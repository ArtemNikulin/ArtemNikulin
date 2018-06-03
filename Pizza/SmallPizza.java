public class SmallPizza implements Factory{
    public void makePizza(String pizzaName){
        Pizza pizza;
        if (pizzaName.compareTo("Вегетаріанська")==0){
            pizza = new VegetarianPizza(" маленька");
        }
        else if (pizzaName.compareTo("З салямі")==0){
            pizza = new SalamiPizza(" маленька");
        }
    }
}