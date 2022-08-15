public class Day2_CodePrompt {
    public static void main(String[] args) {
        final int[] counts = new int[10];

        for (int i = 0; i < 500000; i++) {
            final int num = (int) (Math.random() * 10);
            counts[num] += 1;
        }

        for (int n=0; n<10; n++) {
            System.out.println(n + ": " + counts[n]);
        }
    }
}