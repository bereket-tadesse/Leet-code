import java.util.Stack;

class problem14 {
    // String and stack
    // Valid Parentheses  

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        int count =   0; 
        for (char c : s.toCharArray()) {

            if(s.length() % 2 != 0)  return false;
            
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break; 
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '(')  {stack.pop(); count++; }
                    break;
                case '}':
                     if(!stack.isEmpty() && stack.peek() == '{')  {stack.pop(); count++; }
                    break; 
                case ']':
                     if(!stack.isEmpty() && stack.peek() == '[')  {stack.pop(); count++; }
                    break;
            }    
        }
        
        // to check if there are additional closing parenthesis left like "([ }} ])" with counter. 
        if(count * 2 != s.length()){
            return false;
        }
    return stack.isEmpty();
        
    }
}