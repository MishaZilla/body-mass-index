public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double weightKilogram = 82;
        double heightMetre = 1.72;
        int index = service.calculate(weightKilogram, heightMetre);
        System.out.println(index);
        }
    }