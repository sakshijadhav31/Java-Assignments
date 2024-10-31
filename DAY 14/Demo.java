import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Min Of Series");
		int min=sc.nextInt();
		System.out.println("Enter Max Of Series");
		int max=sc.nextInt();
		System.out.println("Series of odd numbers ranging between" + min +" & "+max +" is ");
		for(int i=min;i<=max;i++){
			if(i%2==1){
				System.out.print(i+" ");
			}}



}




}

/* Enter Min Of Series
4
Enter Max Of Series
60
Series of odd numbers ranging between4 & 60 is
5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 */