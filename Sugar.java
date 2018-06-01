public class Sugar extends Addons {
	private final float cost = 1.5f;
    private final String description = "� ������";
    Sugar(Drink drink) {
        super(drink);
    }
    float cost() {
        return cost + drink.cost();
    }
    String description() {
        return drink.description()+" "+description;
    }
}