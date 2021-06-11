import java.util.*;
/*Q 1)Prime Number
You are given a large value n, Determine the largest number x such that x<=n and all digits of x are prime.

Input format:
First and only line of the input consists of the single integer denoting n.

Output format
Print the required answer
Constraints
1<=Number of digits in n <=10^5
No leading zeroes are available in n
n>=2;

Sample Input: 1000
Sample Output: 777 
Explanation: 777 is the largest number less than or equal to 1000 having all its digits prime.
*/

class FindLargePrimeNumber{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int r;
        int largePrimeNo;

        for(i=2; i<=n; i++){
            r = i%2;
            largePrimeNo = r;

            if(r == 0)
                continue;
        }

        System.out.println("Large prime no.= "+largePrimeNo);

    }
}