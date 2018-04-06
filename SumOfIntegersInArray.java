package Week13D5Q;

public class SumOfIntegersInArray {

	public static void main(String args[]){
        int[] array = {25, 33, 45, 18, 18, 93};
        int sum = 0;
        
        for( int number : array) {
            sum = sum+number;
        }
        System.out.println("Program designed by jawahar");   
        System.out.println("The sum of elements of array is:"+sum);
     }
  }


