import java.util.Scanner ;

public class BinarySearch {


    public static int binarySearch (int [] a , int x , int n ) {


        int left = 0 ;
        int right = n -1 ;
        while (left <= right) {
            int mid = left+ (right - left) /2 ;

            if ( a[mid] == x) {
                return mid ;
            } else if (a [ mid ] < x){
                left = mid +1 ;
            }  else {
                right = mid -1 ;
            }

        }
        return  -1 ;
    }

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in ) ;
        int [] a = {1,2,546,45,56,75,35} ;
        int n = a.length ;
        System.out.print("Enter the input :") ;
        int x = input.nextInt() ;
        int result = binarySearch(a,n,x) ;

        if (result != -1) {
            System.out.println("We found it ");
        } else {
            System.out.println("No ");
        }
    }
}
