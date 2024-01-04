class Camera {
    int id;
    String brand;
    String color;
    double price;

   Camera(int id, String brand, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
     int getId() {
        return id;
    }

     String getBrand() {
        return brand;
    }

   String getColor() {
        return color;
    }

    double getPrice() {
        return price;
    }


    void setId(int id) {
        this.id = id;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Camera camera1 = new Camera(1, "Canon", "Red", 5000);
        Camera camera2 = new Camera(2, "Nikon", "Black", 6000);
        Camera camera3 = new Camera(3, "Sony", "Blue", 7000);

        camera1.setId(1);
        camera1.setColor("White");
        camera1.setPrice(5500);

        System.out.println(" #" + camera1.getId() + " camera is " + camera1.getBrand() + " " + camera1.getColor() + " and price is " + camera1.getPrice());
        System.out.println(" #" + camera2.getId() + " camera is " + camera2.getBrand() + " " + camera2.getColor() + " and price is " + camera2.getPrice());
        System.out.println(" #" + camera3.getId() + " camera is " + camera3.getBrand() + " " + camera3.getColor() + " and price is " + camera3.getPrice());
    }
}
