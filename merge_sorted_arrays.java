import java.util.ArrayList;
import java.util.Arrays;

public class merge_sorted_arrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 4, 6, 8}, new int[]{2, 4, 6, 9}))
        );
    }

    private static int[] merge(int[] a,int[] b){
        int i=0,j=0,k=0;
        int[] c=new int[a.length+b.length];
        while(i< a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length) {
                c[k] = a[i];
                k++;
                i++;
            }
        while (j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
        return c;
    }
}
