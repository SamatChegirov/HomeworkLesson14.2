public class Apple extends Fruits {
    private Vitamin vitamin;

    public Apple(String name, String color, Vitamin vitamin) {
        super(name, color, vitamin);
        this.vitamin = vitamin;
    }

    public Vitamin getVitamin() {
        return vitamin;
    }

    public void setVitamin(Vitamin vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {

        return "Fruits: " +getName() + "color: " + getColor() + "vitamin: " + vitamin;
    }
}
