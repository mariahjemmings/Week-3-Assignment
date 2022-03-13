
package weekthree;
import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				int[]ages= {3, 9, 23, 64, 2, 8, 28, 93};
				int length=ages.length;
				
				for (int i=length-1; i<length; i++) {
					ages[i]-=ages[0];
					System.out.println("What is 93 - 3 in the array?");
					System.out.println(ages[i]);}
				//my understanding here was that the last element was to be changed to whatever that value was minus the initial value, so 93 in the array becomes 90.
				int [] ages2=new int [9];
				
				
				for (int x=0 ; x<length; x++ ) {
					ages2[x]=ages[x];
				
					ages2[8]=34;
					//I created a new array since I do not believe you can alter the length of an array once it is set. I could have also erased the values of my original array and added on 34, but I wasn't sure if that would be what would be needed for GitHub.
					
				}
				int length2=ages2.length;
				
				for (int i=length2-1; i<length2; i++) {
					ages2[i]-=ages2[0];
					System.out.println("What is 34 - 3 in the array?");
					System.out.println(ages2[i]);}
				//I changed the value I added, 34, to 31 by taking the difference of the first and last element. 
				
				double total=0;
				
				for (int j=0; j<length2;j++) {
					total+=ages2[j];}
					System.out.println("What is the average age?");
					System.out.println(total/length2);
					// I kept getting a syntax error when I tried to do this with the in line approach but cannot find why...String [] name = {“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob” };
 					
					String[] names = new String [6];
					
					names[0]="Sam";
					names[1]="Tommy";
					names[2]="Tim";
					names[3]="Sally";
					names[4]="Buck";
					names[5]="Bob";
					
				double total2=0;
					for (int a = 0; a<names.length; a++) {
						total2+=names[a].length();}
					System.out.println("What is the average number of letters in these names?");
						System.out.println(total2/names.length);
						
					for (String name: names){
						System.out.print(name+ " ");}
					System.out.println( " ");
					
					int [] nameLengths = new int [names.length];
						
					for (int y=0; y<names.length; y++) {
						nameLengths[y]=names[y].length();}
					
					int total3=0;
					
					for (int r=0; r<nameLengths.length; r++) {
						
						total3+= nameLengths[r];}
					System.out.println("What is the total number of letters in this array?");
					System.out.println(total3);
					
					Scanner myObj = new Scanner(System.in);
					System.out.println("What number do you choose?");
					int t=myObj.nextInt();
					System.out.println(mariahsMethod(t));
	
	}


					public static String concatNames(String word, int n) {
						String longword = "";
						for (int r = 0; r<n; r++) {
							longword+=word;}
							return longword;}

					public static String fullName (String firstName, String lastName) {
						return (firstName + " "+lastName);}
					
					public static boolean arrayAmount(int[]number) {
						int num=0;
						for (int i=0; i<number.length; i++) {
							num += number[i];}
						
							if(num >=100) {
								return true;}
								
								else {
									return false;}}
								
							
							
						
					public static double array(double[]nums) {
					double total=0;
					
						for (int i=0; i<nums.length; i++) {
							total+=nums[i];}
					return (total/nums.length);}
	
	public static boolean arrays (double []averages, double []averages2) {
		double total=0;
		
			for (int i=0; i<averages.length;i++) {
				total+=averages[i];}
				double average1=(total/averages.length);
			double total2=0;
			for (int j=0; j<averages2.length; j++) {
				total2+=averages2[j];}
				double average2=(total2/averages2.length);
			if (average1>average2) {
				return true;}
			else {
				return false;}}
	
			

public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	if(isHotOutside == true && moneyInPocket>10.50) {
		return true;}
	else {
		return false;}
	}
//The method I decided to create was a boolean method that utilized an  int. If the int was larger than 5, which for the example in this methods utilization is based on user input I created outside the method, the method returns true. If it is 5 or less, it returns false. My example of this method starts on line 76.

public static boolean mariahsMethod(int x ) {
	
	
	
	if (x>5) {
		return true;}
	else {
		return false;}
	

	
	
	
	
	}



	
	
	
	 
	
	
}
	

	


				
			
		
							
						
							
						
					
					
						
					
	
						
					
						
					

					
	
					
		
				
				
				
					
	
				
	
				

			

	


