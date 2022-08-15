public class Day3_Warmup {
    public static double average (int a, int b, int c) {
        double sum = a + b + c;
        return sum / 3;
    }

    public static String duplicator (String s, int n) {
        String out = "";
        for (int i=0; i < n; i++) {
            out += s;
        }
        return out;
    }
    public static void main(String[] args) {
        double n = average(1,2,3);

        System.out.println(n);

        System.out.println(duplicator("poop", 10));
    }
}
        