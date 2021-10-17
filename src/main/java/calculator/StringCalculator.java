package calculator;



import java.util.ArrayList;
import java.util.List;

class StringCalculator {
	 public int calculate(String input) {
	        List<String> negatives = new ArrayList<String>();

	        if (input == null || input.isEmpty()) {
	            return 0;
	        }
	        char customDelimiter = getCustomDelimiter(input.split("\n")[0]);

	        String[] chuncks = (customDelimiter == ',') ? 
	        		input.split(",|\n") : input.split("\n|" + customDelimiter);
	        int total = 0;
	        int skip = (customDelimiter == ',') ? 0 : 2;
	        for (String item : chuncks) {
	            if (skip > 0) {
	                --skip;
	            } else {
	                int num = Integer.parseInt(item);
	                if (num < 0) {
	                    negatives.add(item);
	                }
	                total += num;
	            }
	        }
	        if (!negatives.isEmpty()) {
	            throw new IllegalArgumentException(
	                "negatives not allowed " + String.join(",", negatives));
	        }
	        return total;
	    }

	private char getCustomDelimiter(String string) {
		return 0;
	}
}