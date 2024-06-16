public class BmiService {
    public int calculate(double weightKilogram, double heightMetre) {
        return ((int) (weightKilogram / (heightMetre * heightMetre)));
    }
}