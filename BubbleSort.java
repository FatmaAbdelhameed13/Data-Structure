
public class BubbleSort {
	
    public static void sort(int[] ar){
        for(int in = 0; in < ar.length-1; ++in){
            for (int out = 0; out < ar.length-in-1; ++out){
                if(ar[out] > ar[out+1]){
                    int temp = ar[out];
                    ar[out] = ar[out+1];
                    ar[out+1] = temp;
                }
            }
        }
    }

}
