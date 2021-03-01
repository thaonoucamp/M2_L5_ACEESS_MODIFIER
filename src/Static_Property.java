public class Static_Property {
    private String name;
    private String engine;

    // 1 thuoc tinh duoc khai bao static,
    // 1 ban sao duoc tao chia se giua ca doi tuong cua lop;
    // ko quan tam khoi tao doi tuong bao nhieu;
    public static int numberOfCars;

    public Static_Property(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Static_Property car1 = new Static_Property("Toyota", "Camry");
        System.out.println(Static_Property.numberOfCars);

        Static_Property car2 = new Static_Property("Lexus", "LX 570");
        System.out.println(Static_Property.numberOfCars);
    }
}
