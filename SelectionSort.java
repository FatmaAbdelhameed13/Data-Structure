public class Selection {
		public static void sort(int[] ar) {
			for (int i = 0; i < ar.length; ++i) {
				int minimumIndex = i;
				for(int l = i + 1; l < ar.length; ++l) {
					if(ar[l] < ar[minimumIndex])
						minimumIndex = l;
				}
				int temp = ar[i];
				ar[i] = ar[minimumIndex];
				ar[minimumIndex] = temp;
			}
		}
}
