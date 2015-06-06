package co.edu.udea.appempresariales.codebreaker;

public class CodeBreaker {

	private String number = "1234";

	public String guessNumber(String userNumber) {
	if (userNumber.equals(number)) {
			return "XXXX";
		}
		
		String resultado="";
		for (int i = 0; i < number.length(); i++) {
			if (userNumber.substring(i, i+1).equals(number.substring(i, i+1))) {
				resultado+= "X";
			}
		}
		
		for (int i = 1; i < number.length()+1; i++) {
			String withOutActual= number.substring(0, i-1).concat(number.substring(i, number.length()));
			if(withOutActual.contains(userNumber.substring(i-1,i))){
				resultado += "-";
			}
			
		}
	
		return resultado;
	}

}
