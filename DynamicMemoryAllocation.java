public class DynamicMemoryAllocation {
	private double n1 = .9;
	
	static int Number(){
		double n4 = 2.9;
		double n2 = 6.7;
		double n3;
		n3 = Math.sqrt(n4*n4*n4+n2*n2*n2);
		System.out.println("n3 is: "+n3);
		return 0;
	}
	public static void main(String [] args) {
		/**
		 * This is the dynamic memory allocation
		 */
		Number();
		DynamicMemoryAllocation obj = new DynamicMemoryAllocation();
		double c1 = obj.n1*obj.n1;
		System.out.println("Allocation of c1 is: "+c1);
		double a =3.0,b=4.0;
		double c = Math.sqrt(a*a+b*b);
		System.out.println("Output is: "+c);
		
	}
}

