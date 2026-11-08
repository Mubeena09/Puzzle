class Main {
    public static void main(String[] args) {
        int n =100;
        for(int i = 1; i <= n; i++){
            int count = 0;
        for(int j = i; j <= n; j = j+i) {
            count++;
            }
            System.out.println("Total count: " + count);
        }
    }
}