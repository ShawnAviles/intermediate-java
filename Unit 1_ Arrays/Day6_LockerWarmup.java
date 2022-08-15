public class Day6_LockerWarmup {
    public static void main(String[] args) {
        boolean[] lockers = new boolean [101];

        for (int s=1; s<=100; s++) {
            for (int locker=s; locker <= 100; locker+=s) {
                lockers[locker] = !lockers[locker];
            }
        }

        for (int i=0; i<=100; i++) {
            if (lockers[i]) {
                System.out.println(i);
            }
        }
    }

}