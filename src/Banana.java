public class Banana extends Fruits {
    private Vitamin vitamin;

    public Banana(String name, String color, Vitamin vitamin) {
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
