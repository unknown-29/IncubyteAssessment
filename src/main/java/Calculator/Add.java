package Calculator;

public class Add {
    public static int add(String numbers) {
        // handling empty string
        if(numbers.isEmpty()) return 0;
        // as far as just one char is there and that char is from '0'-'9' return that number itself
        else if(numbers.length()==1 && numbers.charAt(0)>='0' && numbers.charAt(0)<='9'){
            return numbers.charAt(0)-'0';
        }
        else return -1;
    }
}