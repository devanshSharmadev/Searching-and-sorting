import java.text.DecimalFormat;

public class SquareRootBinarySearch {
    public static double sqrtBinarySearch(int number){
        double precision = 0.00001;
        if(number<0){
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        double n = (double) number;
        double low = 0;
        double high = n;
        while(high-low>precision){
            double mid=(low+high)/2.0;
            if(mid*mid>n){
                high=mid;
            }else{
                low=mid;
            }
        }
        return (low+high)/2;
    }
    public static void main(String arg[]){
        int number =8;
        double result = sqrtBinarySearch(number);
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedValue = df.format(result);
        System.out.println(result+" "+formattedValue);
    }
}
