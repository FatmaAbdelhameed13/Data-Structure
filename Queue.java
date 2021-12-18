class queue {
	private int front, back;
	private int [] ar;

	public queue(int sz) {


		ar = new ar[sz];

	}

	public boolean isfull() {
		return (ar[sz]==ar.leangth);
	}

	public void push(int e) {
		if (isfull()) {
			System.out.println("queue array is full");
			return;
		} else
			ar[back++] = e;
	}

	public boolean isempty() {
		return (back==front);
	}

	public int pop() {
		if (isempty()) {
			System.out.println("queue array is empty");
			return -1;

		} else {
			return ar[front++];


		}
	}


