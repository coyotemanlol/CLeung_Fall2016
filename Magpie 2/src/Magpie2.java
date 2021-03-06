
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("Mrs.Dreyer") >= 0
				|| statement.indexOf("Mrs.Wang") >= 0
				|| statement.indexOf("Mrs.Zink") >= 0
				|| statement.indexOf("Mrs.Liu") >= 0
				|| statement.indexOf("Mrs.Ronina") >= 0
				|| statement.indexOf("Mrs.Petersen") >= 0
				|| statement.indexOf("Mills") >= 0
				|| statement.indexOf("Vikings") >= 0
				|| statement.indexOf("School") >= 0) {
			response = "Tell me more about your school.";
		} else if (statement.indexOf("") >= 0) {
			response = "Say Something Please, I Am Very Lonely :( ";
		} else {
			response = getRandomResponse();
		
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "I agree with you";
		} else if (whichResponse == 5) {
			response = "I am a bot, how would i know?";
		}

		return response;
	}
}
