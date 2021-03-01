public class Static_Method {
     // 1 phuong thuc tinh la thuoc lop chu ko thuoc doi tuong;

    private int rollNo;
    private String name;
    private static String college = "BBDIT";

// khoi tao constructor co tham so;
    public Static_Method(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // thiet lap method static thay doi gia tri;
    static void change() {
        college = "CODEGYM";
    }

    // thiet lap method hien thi gia tri;
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
