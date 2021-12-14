public void QuickSort(int l,int r) {
	if(r-l<=0)
		return;
	else {
		long pivot=ar[r];
		int partition=partitionIt(l,r,pivot);
		Quick(l,partition-1);
		Quick(partition+1,r);
	}
}
public int partitionIt(int l,int r,long pivot) {
	int lP=l;
	int rP=r;
	while(true) {
		while(ar[++lP]<pivot);
		while(rP>0&&ar[--rP]>pivot);
		if(lP>=r)
			break;
		else {
			swap(lP,rP);
		}
	}
	swap(lP,r);
	return l;
}
void swap(int indx1,int indx2) {
	long temp=ar[indx1];
	ar[indx1]=ar[indx2];
    ar[indx2]=temp;
}

