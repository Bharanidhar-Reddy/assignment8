import java.util.*;
public class Next {
	private static final int String = 0;
	LinkedList<String> array=new LinkedList<>();

	public void insert(String x) {
		array.add(x);
	}
	
	public void print() {
		System.out.println("Output Array");
		for (String xx:array ) {System.out.print(xx+" ");}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		int input=-1;
		Scanner sc=new Scanner(System.in);
		Next e=new Next();
		System.out.println("Enter intial elements in arrray list with spaces inbetween");
		String in =sc.nextLine();
		String[] arr=in.split(" ");
		for (String xx:arr) {
			e.array.add(xx);
		}
		System.out.println("Intial Array");
		for (String xx:e.array ) {System.out.print(xx+" ");}
		System.out.println("\n");
		do {
		System.out.println("\n");
		System.out.println("Press 1 to append the specified element to the end of a linked list.");
		System.out.println("Press 2 to iterate through all elements in a linked list starting at the specified position");
		System.out.println("Press 3 to iterate a linked list in reverse order.");
		System.out.println("Press 4 to get the first and last occurrence of the specified elements in a linked list.");
		System.out.println("Press 5 to retrieve but does not remove, the last element of a linked list.");
		System.out.println("Press 6 to convert a linked list to array list.");
		System.out.println("Press 7 to remove and return the first element of a linked list");
		System.out.println("Press 0 to exit");
		System.out.println("Please enter your option");
		input=sc.nextInt();
		switch(input) {
		case 0:	System.out.println("Exited Succesfully");
				input=0;
				break;
		case 1: System.out.println("Enter index of to add at last position");
				int x=Integer.parseInt(sc.next())-1;
				String temp=e.array.get(x);
				e.array.remove(x);
				e.array.add(temp);
				e.print();
				break;
		case 2: System.out.println("Enter the staring index");
				ListIterator<String> iterator=  e.array.listIterator(Integer.parseInt(sc.next()));
				while(iterator.hasNext()) {
					System.out.print(iterator.next()+" ");
				}
				System.out.println("\n");
				break;
		case 3: Iterator<String> reverse=e.array.descendingIterator();
				while(reverse.hasNext()) {
				System.out.print(reverse.next()+" ");
				}
				System.out.println("\n");
				break;
		case 4: System.out.println("Enter the element");
				sc.nextLine();
				String a=sc.nextLine();
				if(e.array.contains(a)) {
					 System.out.println("First Index : "+e.array.indexOf(a));
					 System.out.println("Last index : "+e.array.lastIndexOf(a));
				}
				else System.out.println("Element is not present in array");
				break;
		case 5: System.out.println("Last element is : "+e.array.get(e.array.size()-1));
				break;
		case 6 :ArrayList<String> arrlist=new ArrayList<>(e.array);
				System.out.println("Arraylist");
				for(String aa:arrlist) {
					System.out.print(aa+" ");
				}
				System.out.println("\n");
				break;
		case 7 :System.out.println(e.array.poll());
				break;
		default: System.out.println("Please enter valid option");
		}
		}while(input!=0);
	}
	
}
