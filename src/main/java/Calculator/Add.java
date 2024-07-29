package Calculator;

public class Add {
    public static int add(String numbers) {
        // handling empty string
        if(numbers.isEmpty()) return 0;
        // as far as just one char is there and that char is from '0'-'9' return that number itself
        else if(numbers.length()==1 && numbers.charAt(0)>='0' && numbers.charAt(0)<='9'){
            return numbers.charAt(0)-'0';
        }
        /* if string size > 1
         * first split by delimiter ","
         * second convert each char to int
         * add
         * return the result
         */
        String[] tokens=numbers.split(",");
        int sum=0;
        for (String token : tokens) {
            sum+=Integer.valueOf(token);
        }
        return sum;
    }
}