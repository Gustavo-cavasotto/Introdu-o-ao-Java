public class Aula01_ex4_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum;
        while (a <= 21) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
