public class Milk extends Addons {
	private final float cost = 2f;
    private final String description = "з молоком";
    float cost() {
        return cost + drink.cost();
    }
    String description() {
        return drink.description() + " " + description;
    }
    public Milk(Drink b){
       super(b);
    }
}