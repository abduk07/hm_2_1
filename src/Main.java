public class Main {
    public static void main(String[] args) {
        Country country = new Country("JAPON", 983797194);
        Country country1 = new Country("USA", 823645851);


        Camry40 camry40 = new Camry40(TypeModel.TOYOTA_CAMRY_40LE, 3.5, "red", country, "no");
        System.out.println(camry40.getInfo());
        camry40.viewCar();
        camry40.viewCar("TOYOTA");

        Camry50 camry50 = new Camry50(TypeModel.TOYOTA_CAMRY_50XLE, 2.5, "white", country1, "yes", "yes");
        System.out.println(camry50.getInfo());
        camry50.viewCar(" врум врум");

        Camry50 camry55 = new Camry50(TypeModel.TOYOTA_CAMRY_50SE, 3.5, "black", country1, "no", "yes");
        System.out.println(camry55.getInfo());
        camry50.viewCar(" врум врум ");
    }
}