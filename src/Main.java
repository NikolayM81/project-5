public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.72;
        int weight = 68;
        int index = service.calculate(weight, height);
        System.out.println("BMI-индекс: " + index);
    }
}