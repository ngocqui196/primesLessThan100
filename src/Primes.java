public class Primes {
    public void primes() {
        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);
        for (int i = 2; i <= 100 ; i++) {
            boolean check = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    check = false;
//                    break;
//                }
//            }
            if (i % 2 == 0) {
                check = false;
                continue;
            }
            if (i % 3 == 0) {
                check = false;
                continue;
            }if (i % 5 == 0) {
                check = false;
                continue;
            }if (i % 7 == 0) {
                check = false;
                continue;
            }
            if (check) System.out.println(i);
        }
    }
}
