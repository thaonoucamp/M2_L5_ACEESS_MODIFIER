public class Test {
    public static void main(String[] args) {
        Static_Method.change();

        Static_Method s1 = new Static_Method(1, "a");
        Static_Method s2 = new Static_Method(2, "b");
        Static_Method s3 = new Static_Method(3, "c");

        s1.display();
        s2.display();
        s3.display();
    }
}
