public class TestClass {

    static int x = 12;
    private int y = 22;

    public void methodMain(int x){
        TestClass test = new TestClass();
        this.x = 24;
        y = 32;
        System.out.println("TestClass.x: "+TestClass.x);
        System.out.println("test.x: " + test.x);
        System.out.println("test.y: " + test.y);
        System.out.println("y: "+y);
    }
//    main method
    public static void main(String[] args){
        TestClass testClass = new TestClass();
        testClass.methodMain(4);
    }
}
