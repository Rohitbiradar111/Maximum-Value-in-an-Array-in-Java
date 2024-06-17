//This program prints the Largest Value in an Array in Java

import java.util.Scanner;
public class ArrayMaxValue {
    public static int maximum(int arr[],int n)
    {
        int max = arr[0];
        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array Values = ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Maximum Value = "+(maximum(arr,n)));
    }
}