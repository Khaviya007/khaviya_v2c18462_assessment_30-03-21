package typecast1;

public class Typecasting1 {

	public static void main(String[] args) {
		//long to int
		long l=1003452354;
		int i=(int)l;
		i=Integer.valueOf(i);
		System.out.println("long to int "+i);
		
		
		//Boolean to string
		Boolean b1=true;
		Boolean b2=false;
		String s1=String.valueOf(b1);
		String s2=String.valueOf(b2);
		String sb1=Boolean.toString(b1);
		String sb2=Boolean.toString(b2);
		System.out.println("Boolean to string");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(sb1);
		System.out.println(sb2);

		//int to double
		int q=34;
		Double d=Double.valueOf(q);
		System.out.println("int to double is: "+d);
		
		//double to int
		double y=34.567;
		int w=(int)y;
		w=Integer.valueOf(w);
		System.out.println("Double to int: "+w);
	}
}
