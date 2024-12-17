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
 */















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