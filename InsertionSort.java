public class InsertionSort {
	
    public static void sort(int[] ar){
        for(int out = 1; out < ar.length; ++out){
            int currentElement = ar[out];
            int in = out-1;
            while(in >= 0 && ar[in]>currentElement){
                ar[in+1] = ar[in];
                 in--;
            }
            ar[in+1] = currentElement;
        }
    }

}
