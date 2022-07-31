public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 78000);
        Boat elisabeth2 = new Boat("Queen Elisabeth 2", 237000);
        System.out.println(clio.doStuff());
        System.out.println(elisabeth2.doStuff());
    }
}
