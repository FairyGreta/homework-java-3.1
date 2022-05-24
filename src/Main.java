import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double wt = 56; // вес в кг
        double growth = 1.75; // рост в м
        double bmi = service.calculate(wt, growth);
        System.out.println(bmi);
    }
}
