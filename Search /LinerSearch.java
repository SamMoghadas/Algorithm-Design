import java.util.Scanner ;

public class Search {

    public static int linerSearch (int[] a, int n , int x) {
        for (int i = 0 ; i < n ; i++) {
            if (a [i] == x) {
                return x;
            }
        }
        return -1 ;
    }


    public static void main (String [] args) {
        Scanner input = new Scanner (System.in) ;

        int [] a = {1,4,6,7,8,12,234,44,534,53545,25} ;

        int n = a.length ;
        System.out.println("PLZ Enter the key :");
        int x = input.nextInt() ;

        int result = linerSearch(a,n,x) ;

        if (result != -1) {
            System.out.println("We found it !");
        } else {
            System.out.println("We could not found it ");
        }
    }
}
