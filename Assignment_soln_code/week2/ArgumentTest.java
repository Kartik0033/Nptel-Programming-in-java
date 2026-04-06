public class ArgumentTest {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }

    static class Test {
        void start() {
            int a = 4;
            int b = 5;

            System.out.print("" + 8 + 3 + "");  //83 👉 Starts with a String (""), so everything becomes concatenation.
            System.out.print(a + b);             //👉 Both are integers → addition happens
            System.out.print(" " + a + b + " "); //👉 Starts with a String (""), so everything becomes concatenation.
            System.out.print(a + b + "");//First integers → then string 5 + 3 = 8
            System.out.print(foo() + a + b + " "); // starting with string concatneation
            System.out.println(a + b + foo());
        }

        String foo() {
            return "foo";
        }
    }
}