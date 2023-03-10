final public class Camry50 extends Camry40 {
    private String newAudioSystem;

    public Camry50(TypeModel typeModel, double volume, String color, Country country, String climateControl, String newAudioSystem) {
        super(typeModel, volume, color, country, climateControl);
        this.newAudioSystem = newAudioSystem;
    }

    @Override
    public void viewCar(String viewCar1) {
        super.viewCar("Просмотр машины в 3д"+viewCar1);
    }
}
