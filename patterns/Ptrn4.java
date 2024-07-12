class Ptrn4 {
    static void design(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        design(5);
    }
}
