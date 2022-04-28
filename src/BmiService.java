public class BmiService {
    public double calculate(double height, double weight) {
        double heightM = height / 100;
        double bmi = weight / (heightM * heightM);
        return bmi;
    }
}
