public class Reduce {
    public static void main(String[] args) {
        int c = 100;
        int c2 = 0;
        while (c > 0) {
            c2 += 1;
            if (c % 2 == 0) {
                c = c / 2;
            } else {
                c = c - 1;
            }
        }
        System.out.println(c2);
    }
}
