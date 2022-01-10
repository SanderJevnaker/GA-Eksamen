public class StaticTest {
    static int staticInt = 0;
    private int memberInt = 0;
    public void show() {
        StaticTest.staticInt++;
        memberInt++;
        System.out.println("\tStatic int: " + StaticTest.staticInt + ", private int: " + memberInt);
    }
}
