class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> opr = new Stack<Integer>();
        int res;

        for(int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            char c = s.charAt(0);

            if(s.length() == 1 && !Character.isDigit(c)) {
                int val1 = opr.pop();
                int val2 = opr.pop();
                 
                switch(c) {
                    case '+':
                    opr.push(val2 + val1);
                    break;
                     
                    case '-':
                    opr.push(val2 - val1);
                    break;
                     
                    case '/':
                    opr.push(val2 / val1);
                    break;
                     
                    case '*':
                    opr.push(val2 * val1);
                    break;
                }
            }
             
            else {
                int n = Integer.parseInt(s);
                opr.push(n);
            }
            
        }
        return opr.pop();

    }

}
