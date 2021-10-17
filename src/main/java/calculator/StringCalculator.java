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
	        return total;
	    }

	private char getCustomDelimiter(String string) {
		 if (string == null || string.isEmpty()) {
	            return ',';
	        }
	        if (isNumeric(string)) {
	            return ',';
	        }
	        if (string.length() == 1) {
	            return string.charAt(0);
	        }
	        return ',';
	    }

	private boolean isNumeric(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}