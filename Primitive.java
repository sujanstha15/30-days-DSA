/*
1021. Remove Outermost Parentheses
 Q. A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

 

Example 1:

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
Example 2:

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
Example 3:

Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
 */
import java.util.*;
public class Primitive {

    //method to remove the outer parenthesees
    public static String removeOuterParentheses(String s){
        
        //create a stack to check the inner and outer parentheses
        Stack<Character> stack = new Stack<>();
        
        //create a variable to insert the required answer
        StringBuilder answer = new StringBuilder();

        //looping through the String 
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                //check the size of stack, if it is empty just put it in the stack not in answer, if not empty put in answer as well as stack too
                if(stack.size()>0){
                    
                    answer.append(ch);
                }
                stack.push(ch);
            }
            else{
        //condition when the parentheses is closing
        if(stack.size()>0){
            stack.pop();
            if(stack.size()>0){
                answer.append(ch);
            }
        }
            }
        }
        return answer.toString();

        
    }

    public static void main(String[] args){
removeOuterParentheses("(())()))");
    }
}
/* Notes
 A primtive is the smallest valid box that cannot be broken into smaller independent parts.
 - A counter is required to track the opening and closing of the bracket. 

First split into two parts
then remove the outermost parentheses and add the split parts


#Process the innermost and make it answer


#For problem like Parentheses, stack is used
How the problem is solved:
First, as it is about the parentheses, most probaly the stack is used.
For the first opening bracket, check whether the stack is empty of not, if it is then it is the outer bracket which we have to remove. 
Traverse the string, if the opening bracket is found, check whether the stack is empty or not. If it is not empty, push into stack as well as answer StringBuilder. 
If we found the closing bracket, if the stack is empty, it is the outer bracket so remove the closing bracket from the stack.
If the stack is not empty,  remove the closing bracket from the stack and push the closing bracket into the answer.
Since all the output are in Character type, convert them into String using toString()
 */



