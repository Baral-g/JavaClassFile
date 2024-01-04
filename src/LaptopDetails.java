public class LaptopDetails {

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();
        l1.id = 1;
        l1.name = "Lenovo";
        l1.ram = 120;
        l2.id = 2;
        l2.name = "Dell";
        l2.ram = 60;
        l1.DisplayLaptop();
        l2.DisplayLaptop();

    }


}
