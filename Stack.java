class Stack Array {
		private int sz=0;
		private int[] ar;
		
		Stack Array (int sz) {
			
			ar=new int [sz];	
		}
		public void push(int x) {
            
            if (isEmpty()){
            	system.out.print("stack is full");
			} else {
				ar [sz]=x;
				sz++;
			}
				}
		public int pop() {
			if (isFull()) {
	        	system.out.print("stack is full");
	        	return -1;
			} else {
					return ar[sz-1];
			}
		
		}
		public int top() {
			if (sz==0) {
					system.out.print("stack is full");
					return -1;
			} else {
				return [--sz];
			}
		}
		public Boolean isEmpty() {
		
		 return (sz== 0);
		
		}
		public Boolean isFull() {
			
				return  (sz == ar.length); 
		}
}
