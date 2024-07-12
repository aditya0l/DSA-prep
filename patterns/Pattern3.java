class Pattern3 {
    static void design(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1
            ; j <=i ; j++) {
                System.out.print( j+ "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        design(N);
    }
}