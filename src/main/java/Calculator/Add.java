package Calculator;

import java.util.regex.Pattern;

public class Add {
    public static int add(String numbers) {
        // handling empty string
        if(numbers.isEmpty()) return 0;
        // as far as just one char is there and that char is from '0'-'9' return that number itself
        else if(numbers.length()==1 && numbers.charAt(0)>='0' && numbers.charAt(0)<='9'){
            return numbers.charAt(0)-'0';
        }
        /* if string size > 1
         * validate the string
         * get the sum
         * return the result
         */
        int result = -1;
        if(numbers.startsWith("//")){
            numbers=numbers.replace(numbers.charAt(2),',');
            numbers=numbers.substring(3);
        }
        if(isValidFormat(numbers)) {
            String delimiter = ",|\n";
            String[] tokens = numbers.split(delimiter);
            int sum = 0;
            for (String token : tokens) {
                if(!token.isEmpty()) // \n at the beginning
                    sum += Integer.parseInt(token);
            }
            result=sum;
        }
        return result;
    }

    private static boolean isValidFormat(String numbers) {
        String regex = "(.*((\n,)|(,\n)).*|.*,$)";
        return !(Pattern.compile(regex).matcher(numbers).matches());
    }
}