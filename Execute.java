import java.util.*;
public class Execute {
	List<String> array=new ArrayList<>();

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
		Execute e=new Execute();
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
		System.out.println("Press 1 to to insert an element into the array list at the first position.");
		System.out.println("Press 2 to retrieve an element (at a specified index) from a given array list.");
		System.out.println("Press 3 to search an element in a array list.");
		System.out.println("Press 4 to sort array list");
		System.out.println("Press 5 to shuffle elements in a array list");
		System.out.println("Press 6 to reverse elements in a array list.");
		System.out.println("Press 0 to exit");
		System.out.println("Please enter your option");
		input=sc.nextInt();
		switch(input) {
		case 1: System.out.println("Enter element to add at first position");
				e.array.add(0,sc.next());
				e.print();
				break;
		case 2: System.out.println("Enter index of required element");
				System.out.println("Element: "+e.array.get(Integer.parseInt(sc.next())-1));
				break;
		case 3: System.out.println("Enter name to Search");
				String f=sc.next();
				if(e.array.contains(f)){
					System.out.println("Index of element is: "+ e.array.indexOf(f));
				}
				else System.out.println("Element is not present in array");
				break;
		case 4: Collections.sort(e.array);
				e.print();
				break;
		case 5: Collections.shuffle(e.array);
				e.print();
				break;
		case 6 : Collections.reverse(e.array);
				e.print();
				break;
		case 0:input=0; 
		default: System.out.println("Please enter valid option");
		}
		}while(input!=0);
	}
}
