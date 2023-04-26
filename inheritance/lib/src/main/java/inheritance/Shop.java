package inheritance;

public class Shop {
    protected String name;
    protected String description;

    protected int numDollarSigns;

    public Shop(String name, String description, int numDollarSigns) {
        this.name = name;
        this.description = description;
        this.numDollarSigns = numDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numDollarSigns=" + numDollarSigns +
                '}';
    }


}
