public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double humanHeight = 1.87; // метра
        double humanWeight = 98; // килограммов
        double bodyMassIndex = service.calculate(humanHeight, humanWeight);
        System.out.println(bodyMassIndex);
    }
}