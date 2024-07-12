/**
 * Pattern1
 */
class Ptrn1 {
    static void design(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        design(5);
    }
}