import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance of particle in space");
		int Distance=sc.nextInt();
		System.out.println("Enter time");
		int Time=sc.nextInt();
		int velocity=Distance/Time;
		System.out.println("The velocity of particle roaming in space is "+ velocity);

}}

/* Enter Distance of particle in space
   100
   Enter time
   20
   The velocity of particle roaming in space is 5 */