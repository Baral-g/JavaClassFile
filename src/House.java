class House{
    int id;
    String name;
    double price;

    public House(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public House(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 100000;
    }
    // methods
    void printHouse(){
        System.out.println("ID : "+this.id);
        System.out.println("Name : "+this.name);
        System.out.println("Price : "+this.price);
    }

}

