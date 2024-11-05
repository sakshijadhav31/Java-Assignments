import java.util.*;
class Demo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Current");
		double i=sc.nextDouble();
		System.out.println("Enter A Resistance");
		double r=sc.nextDouble();
		if(i>0 && r>0){
			System.out.println("Voltage is "+(i*r));
}}}



/*Enter A Current
4
Enter A Resistance
3
Voltage is 12.0 */