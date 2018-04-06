package Week13D5Q;

import java.util.Arrays;

public class SmallNumberInArray {
	public static int a[]={23,33,65,11,98,76,55,76};  
    
	public static int SmallestInteger(int[] a, int total){  
        int temp;  
        for (int i = 0; i < total; i++)   
                {  
                    for (int j = i + 1; j < total; j++)   
                    {  
                        if (a[i] > a[j])   
                        {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[0];  
        }  
        public static void main(String args[]){  
        	 System.out.println("Program designed by jawahar");   
        System.out.println("Smallest integer of the string is : "+SmallestInteger(a,8));  
       
        }}  

