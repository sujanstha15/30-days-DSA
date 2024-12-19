/*
 Q. Write a recursive function that gives an input n sums all non negative integers up to n. 
 */
public class Recursion1 {
    //recursive method to calculate the sum
    public static int calcSum(int n){
        //we always have a base case in recursion, it should be mandatory because our program terminated only when the base case is true
        //base case for this program
        if(n==1){
            return 1;
        }

        //now this is the recursive call
        return n+ calcSum(n-1);
    }

    //main method
    public static void main(String[] args) {
        System.err.println(calcSum(3));
    }}
