import java.util.*;
public class primeno{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int n = sc.nextInt();
		int k = 0;
		for(int i = 1;i < n + 1;i++){
			if(n%i==0){
				k = k+1;}
		}
		if(k==2){
			System.out.println("Prime number");}
		else{
			System.out.println("Not  a Prime number);}
		
