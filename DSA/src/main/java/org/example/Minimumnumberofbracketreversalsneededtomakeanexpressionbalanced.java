package org.example;

public class Minimumnumberofbracketreversalsneededtomakeanexpressionbalanced {

    //Examples
    //Input : s = ")(())((("
    //Output : 3
    //Explanation :  One way to balance is: "((())())". There is no balanced sequence that can be formed in lesser reversals.
    //
    //Input : s = "(()((()(())(("
    //Output : -1
    //Explanation : There's no way we can balance this sequence of braces.
    //


    public static int miniReversalToBalance(String exp){

        int openBracket = 0;
        int closedBracket = 0;

        for (char ch : exp.toCharArray()){

            if(ch == '('){
                openBracket++;
            } else{
                if(openBracket > 0){
                    openBracket++;
                }else{
                    closedBracket--;
                }
            }
        }

        if((openBracket + closedBracket) % 2 != 0) return -1;

        return (openBracket + 1)/2 + (closedBracket + 1)/2;
    }

    public static void main(String[] args) {
        // Input expression
        String expression = "(()))(";



        // Get result from function
        int result = miniReversalToBalance(expression);

        // Print the result
        System.out.println("Minimum reversals required: " + result);
    }
}
