public class BmiService {

    public double calculate(double wt, double growth) {
        double bmi = wt / (growth * growth);
        return bmi;
    }
}
