import java.util.HashMap;
import java.util.Map;

class Problem13 {


    public static void main(String[] args) {
        
    }
    public int romanToInt(String s) {
        
        Map <Character , Integer> roman_numerals = new HashMap<>();

        roman_numerals.put('I', 1);
        roman_numerals.put('V',5);
        roman_numerals.put('X',10);
        roman_numerals.put('L',50);
        roman_numerals.put('C',100);
        roman_numerals.put('D',500);
        roman_numerals.put('M',1000);

        int total = 0;
        for (int i = 0; i < s.length(); i ++) {

            // if current index higher substract the previous added 2X.
            if ( i > 0 && roman_numerals.get(s.charAt(i)) > roman_numerals.get(s.charAt(i-1)) ) {
                total += roman_numerals.get(s.charAt(i)) - ( 2 * roman_numerals.get(s.charAt(i-1)) );
            } else {
                total += roman_numerals.get(s.charAt(i));;
            }
          
        }
        return total;
    }
}