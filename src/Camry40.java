public class Camry40 extends Camry30 {
    private String climateControl;

    public Camry40(TypeModel typeModel, double volume, String color, Country country, String climateControl) {
        super(typeModel, volume, color, country);
        this.climateControl = climateControl;
    }

    final static void viewCar(){
        System.out.println("Просмотр машины в 2д");
    }
    public void viewCar(String viewCar1){
        System.out.println(viewCar1);
    }



}


