public class SmallPizza implements Factory{
    public void makePizza(String pizzaName){
        Pizza pizza;
        if (pizzaName.compareTo("�������������")==0){
            pizza = new VegetarianPizza(" ��������");
        }
        else if (pizzaName.compareTo("� �����")==0){
            pizza = new SalamiPizza(" ��������");
        }
    }
}