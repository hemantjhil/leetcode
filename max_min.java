import java.util.HashMap;
import java.util.Map;

public class max_min {

    public static void main(String[] args) {
        System.out.println(findMinMax(new int[]{2, 3, 4, 5, 5},4));
    }

    private static Map findMinMax(int[] array, int n){


        int i=0;
        int min,max;
        if(n%2==0) {
            if (array[0] < array[1]) {
                max = array[1];
                min = array[0];
            } else {
                max = array[0];
                min = array[1];
            }
            i=2;
        }else {
            max=array[0];
            min=array[1];
            i=1;
        }

        while(i<n-1){
            if(array[i]>array[i+1]){
                if(array[i]>max)
                    max=array[i];
                if(array[i+1]<min)
                    min=array[i+1];
            }else {
                if(array[i+1]>max)
                    max=array[i+1];
                if(array[i]<min)
                    min=array[i];
            }
            i=i+2;
        }
        Map value=new HashMap<>();
        value.put(min,max);
        return value;

    }
}
