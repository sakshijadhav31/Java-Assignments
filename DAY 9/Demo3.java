class Demo3{
	public static void main(String[]args){
		for(int i=4;i>=1;i--){
			char ch='A';
		        char ch1='a';
 			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(ch1+" ");
					ch1++;}
				else{
					System.out.print(ch+" ");
					ch++;}
				}
			System.out.println();



}
}}


/* op: A B C D
       a b c
       A B
       a */
