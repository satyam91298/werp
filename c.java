import java.util.*;

class Main { 

	 
	public static void main(String[] args) { 
		Scanner in=new Scanner(System.in);
		int num = in.nextInt();
		int denum = in.nextInt(); 
		System.out.print("Egyptian Fraction Representation of "
				+ num + "/" + denum + " is\n "); 
		Cal c=new Cal();
		c.printEgyptian(num, denum); 
	} 
} 
class Cal{
        void printEgyptian(int num, int denum) { 
		if (denum == 0 || num == 0) { 
			return; 
		} 
		if (denum % num == 0) { 
			System.out.print("1/" + denum / num); 
			return; 
		}
		if (num % denum == 0) { 
			System.out.print(num / denum); 
			return; 
		}
		if (num > denum) { 
			System.out.print(num / denum + " + "); 
			printEgyptian(num % denum, denum); 
			return; 
		} 

		int n = denum / num + 1; 
		System.out.print("1/" + n + " + "); 
 
		printEgyptian(num * n - denum, denum * n); 
	}
}
