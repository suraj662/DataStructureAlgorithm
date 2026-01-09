package org.example;

public class SingleElement {
    public static int getSingleElement(int arr[])
    {
         int n = arr.length;
    for(int i=0;i<n;i++)
    {
        int num = arr[i];
        int count=0;

        for(int j=0;j<n;j++)
        {
            if( arr[j] == num)
            {
                count++;
            }
            if( count ==1) return num;
        }
    } return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}
