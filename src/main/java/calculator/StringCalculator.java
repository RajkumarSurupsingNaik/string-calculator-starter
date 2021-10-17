package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.isEmpty())	
    		return 0;
    	else if(input.contains(",")) {
    		String [] tk= input.split(",");
    		return Integer.parseInt(tk[0])+ Integer.parseInt(tk[1]);
    	}else
    		return Integer.parseInt(input);
    }

}