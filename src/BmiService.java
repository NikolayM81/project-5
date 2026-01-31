public class BmiService {
    public int calculate(int weight, double height){
double Index = weight / (height * height);
return (int) Index;
    }
}
