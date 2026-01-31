public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.71;
        int weight = 72;
        int Index = service.calculate(weight,height);
        System.out.println("BMI-индекс: " + Index);
    }
}