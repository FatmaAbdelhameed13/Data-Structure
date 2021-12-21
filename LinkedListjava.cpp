public class linkedlist {
		private class node {
				int data;
				node next;
		}
		node head = null;
		node tail=null;
		int s=0;

		public void insertfirst(int value) {
			node newnode = new node();
			newnode.data = value;
			if(head==null) {
				head=newnode;
				s+=1;
			} else {
				newnode.next=head;
				head=newnode;
				s+=1;
			}

		}

		public void insertlast(int value) {
			node newnode = new node();
			newnode.data = value;

			if (head == null) {
				head = tail= newnode;
				s+=1;
			}


			else {
				tail.next=newnode;
				tail=newnode;
				s+=1;
			}

		}
		public void insertposition(int value,int pos) {
			node newnode = new node();
			newnode.data = value;
			node cur=head;
			for(int i=1; i<pos-1; i++) {
				cur=cur.next;
			}
			newnode.next=cur.next;
			cur.next=newnode;
			s+=1;
		}


		public void deletefirst() {
			if(head==null) {
				System.out.println("the list is empty");
				return;
			} else {
				head=head.next;
				s-=1;
			}

		}

		public void deletelast() {
			node cur=head;
			while(cur.next!=tail) {
				cur =cur.next;
			}
			tail=cur;
			tail.next=null;
			s-=1;
		}
		public void deleteposition(int pos) {
			if(pos>len&&pos<0) {
				return;
			} else {
				node cur=head;
				for(int i=1; i<pos-1; i++) {
					cur=cur.next;
				}
				cur.next=cur.next.next;
				s-=1;
			}
		}


