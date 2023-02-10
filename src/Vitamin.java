public class Vitamin  {
    private String vitamin;


    public Vitamin() {
    }

    public Vitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return  vitamin;
    }
}
