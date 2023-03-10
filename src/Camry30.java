import java.util.Random;

public class Camry30 {
    private TypeModel typeModel;
    private double volume = generateDefaultVolume();
    private String color;
    private Country country;
    public static Random random = new Random();

    public TypeModel getTypeModel() {
        return typeModel;
    }

    public double getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public Country getCountry() {
        return country;
    }

    public String getInfo() {
        return "\nТип модели: " + typeModel +
                "\nОбъём машины: " + volume +
                "\nЦвет машины: " + color +
                "\nСтрана и номер: " + country.getCountry()+" "+country.getNumber();

    }

    public Camry30(TypeModel typeModel, double volume, String color, Country country) {
        this.typeModel = typeModel;
        this.volume = volume;
        this.color = color;
        this.country = country;
    }

    private double generateDefaultVolume() {
        return (float) (random.nextDouble(2.5) + 2.0);
    }

}




