public class FactorialCalculator {
    public static Integer calculateFactorial(Integer n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
