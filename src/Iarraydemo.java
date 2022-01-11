import java.util.Scanner;

public class Iarraydemo
{
    static int arr[];
    public static void main(String[]args){
        arr=new int[5];
        Scanner s= new Scanner(System.in);

        for(int i=0;i< arr.length;i++)
        {
            arr[i] =s.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
