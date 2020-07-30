
public class Fibinocci {
	
	public static void main(String[] args) {
		fib();

	}
	public static void fib() {
		int n1=0,n2=1,n3,i,last=10;
		System.out.println(n1+" "+n2);
		for(i=2;i<last;i++)
		{
			n3=n1+n2;
			System.out.println(n3);    
			n1=n2;    
			n2=n3;  
		}

	}

}
