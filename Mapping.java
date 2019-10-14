import java.util.*;
public class Mapping {
		Map<Integer,String> table=new HashMap<>();
	
		public void print() {
			System.out.printf("%-15s %-15s\n","Employee id","Employee Name");
			for(Integer i:table.keySet()) {
				System.out.printf("%-15s:%-15s\n",String.valueOf(i),table.get(i));
			}
		}
		public void searchid(int i) {
			if(table.containsKey(i)) {System.out.printf("Employee ID: %-5s , Employee Name: %-5s\n",i,table.get(i));}
		}
		public void searchname(String n) {
			for(Integer i:table.keySet()) {
				if(table.get(i).equalsIgnoreCase(n)){System.out.printf("%-15s:%-15s\n",String.valueOf(i),table.get(i));}}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mapping m=new Mapping();
		int input=-1;
		do {
			System.out.println("\n");
			System.out.println("Press 1 to associate the specified value with the specified key in a Tree Map.");
			System.out.println("Press 2 to copy a Tree Map content to another Tree Map.");
			System.out.println("Press 3 to search a key and value in a Tree Map.");
			System.out.println("Press 4 to get a key-value mapping associated with the greatest key and the least key in a map.");
			System.out.println("Press 5 to get a reverse order view of the keys contained in a given map.");
			System.out.println("Press 6 to get the portion of a map whose keys are strictly less than a given key.");
			System.out.println("Press 7 to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).");
			System.out.println("Press 0 to exit");
			System.out.println("Please enter your option");
			input=sc.nextInt();
			switch(input) {
			case 1: System.out.println("Enter emplyee id and name with : in between");
					sc.nextLine();
				    String arr[]=sc.nextLine().split(":");
				    m.table.put(Integer.parseInt(arr[0]),arr[1]);
					m.print();
					break;
			case 2: TreeMap<Integer,String> tables=new TreeMap<>(m.table);
					System.out.printf("%-15s %-15s\n","Employee id","Employee Name");
					for(Integer i:tables.keySet()) {
						System.out.printf("%-15s:%-15s\n",String.valueOf(i),m.table.get(i));
					}
					break;
			case 3: System.out.println("1. Search by id");
					System.out.println("2. Search by name");
					System.out.println("Enter your option");
					int in=sc.nextInt();
					System.out.println("Enter Name/id");
					sc.nextLine();
					String ab=sc.nextLine();
					System.out.println(ab);
					switch(in){
					case 1: m.searchid(Integer.parseInt(ab));
							break;
					case 2: m.searchname(ab);
							break;
					default: System.out.println("Please enter valid option");
					break;}
					break;
			case 4: TreeMap<Integer,String> map=new TreeMap<>(m.table);
					System.out.println("Least key value pair of map : "+map.firstEntry());
					System.out.println("Highest key value pair of map : "+map.lastEntry());
					break;
			case 5: TreeMap<Integer,String> map1=new TreeMap<>(m.table);
					System.out.println("Keys in orders : "+map1.descendingKeySet());
					break;
			case 6 :System.out.println("Enter key");
					System.out.println("Portion of map less than given key");
					SortedMap<Integer,String> map2=new TreeMap<>();
					TreeMap<Integer,String> map3=new TreeMap<>(m.table);
					map2=map3.headMap(sc.nextInt());
					System.out.printf("%-15s %-15s\n","Employee id","Employee Name");
					for(Integer i:map2.keySet()) {
						System.out.printf("%-15s:%-15s\n",String.valueOf(i),map2.get(i));
					}
					break;
			case 7: System.out.println("Enter starting key");
					int start=sc.nextInt();
					System.out.println("Enter ending key");
					int end=sc.nextInt();
					SortedMap<Integer,String> map4=new TreeMap<>();
					TreeMap<Integer,String> map5=new TreeMap<>(m.table);
					map4=map5.subMap(start, true, end, false);
					for(Integer i:map4.keySet()) {
						System.out.printf("%-15s:%-15s\n",String.valueOf(i),map4.get(i));
					}
					break;
			case 0:input=0; 
					break;
			default: System.out.println("Please enter valid option");
			}
			}while(input!=0);
		
	}

}
