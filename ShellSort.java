public class ShellSort {
		public static void sort(int[] ar) {
			for(int gap = ar.length/2; gap > 0; gap/=2) {
				for(int i = gap; i < ar.length; ++i) {
					int currentElement = ar[i];
					int j = i;
					while(j >= gap && ar[j-gap]>currentElement) {
						ar[j] = ar[j-gap];
						j-=gap;
					}
					ar[j] = currentElement;
				}

			}

		}
}
