enum TvParts {
    SCREEN, SPEAKER, POWERSUPPLY, VIDEOCARD
}
public class Tv {
    private String brand;
    private double screenSize;
    private TvParts part;

    // The TV constructor
    public Tv() {
        this.brand = brand;
        this.screenSize = screenSize;
        this.part = part;
    }

    // Accessor for the brand field
    public String getBrand() {
        return brand;
    }

    // Mutator for the brand field
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Accessor for the model field
    public double getSize() {
        return screenSize;
    }

    // Mutator for the screenSize field
    public void setSize(double screenSize) {
        this.screenSize = screenSize;
    }

    // Accessor for the part field
    public TvParts getPart() {
        return part;
    }

    // Mutator for the part field
    public void setPart(TvParts part) {
        this.part = part;
    }
}
