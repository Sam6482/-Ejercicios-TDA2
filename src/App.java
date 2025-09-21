public class App extends fibonacci {
    public static void main(String[] args) throws Exception {
        int n = 5;

        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}