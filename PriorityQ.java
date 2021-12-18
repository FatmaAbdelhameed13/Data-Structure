class PriorityQ {
		private int s;
		private int[] ar;
		private int nI;
		public PriorityQ(int sz) {
			s=sz;
			ar=new int[sz];
			nI=0;
		}
		public void insert(int n) {
			int j;
			if(nI==0) {
				ar[nI++]=n;
			} else {
				for(j=nI-1; j>=0; --j) {
					if(n>ar[j])
						ar[j+1]=ar[j];
					else
						break;
				}
				ar[j+1]=n;
				nI++;
			}
		}
		public int remove() {
			return ar[--nI];;
		}
		public int PeekMin() {
			return ar[nI-1];
		}
		public Boolean isEmpty() {
			if(nI==0)
			return true;
			else return false;
		}
		public Boolean isFull() {
			if(nI==s)
			return true;
			else return false;
		}
}

