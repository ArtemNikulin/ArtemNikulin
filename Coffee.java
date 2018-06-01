public class Coffee extends Drink {
	protected final float cost = 12f;
    protected final String description = "Кава";
    float cost() {
        return cost;
    }
    String description() {
        return description;
    }
}