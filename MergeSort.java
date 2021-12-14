
public class MergeSort {
		public static void  merge(int [] ar, int l, int m, int r) {
			int s1 = r - m;
			int s2 = m - l + 1;
			int R_ar [] = new int[s1];
			int L_ar[] = new int[s2];
			for(int i = 0; i < s1; ++i) {
				R_ar[i] = ar[m + 1 + i];
			}
			for(int i = 0; i < s2; ++i) {
				L_ar[i] = ar[l + i];
			}
			int R = 0, L = 0, k = l;
			while(R < s1 && L < s2) {
				if(R_ar[R] < L_ar[L]) {
					ar[k] = R_ar[R];
					R++;
				} else {
					ar[k] = L_ar[L];
					L++;
				}
				k++;
			}
			while (R < s1) {
				ar[k] = R_ar[R];
				R++;
				k++;
			}
			while (L < s2) {
				ar[k] = L_ar[L];
				L++;
				k++;
			}
		}
		public static void sort(int [] ar, int l, int r) {
			if(l < r) {
				int m = l + (r - l)/2;
				sort(ar, m+1, r);
				sort(ar, l, m);
				merge(ar, l, m, r);
			}

		}
}


