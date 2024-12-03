public class BmiService {
    public int calculate(double humanHeight, double humanWeight) {
        double bodyMassIndex = humanWeight / (humanHeight * humanHeight);
        return (int) bodyMassIndex;
    }

}
