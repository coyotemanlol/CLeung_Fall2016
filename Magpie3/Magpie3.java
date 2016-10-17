public class Magpie3 {

	public String getGreeting() {
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.findKeyword("Mrs.Dreyer") >= 0
				|| statement.findKeyword("Mrs.Wang") >= 0
				|| statement.findKeyword("Mrs.Zink") >= 0
				|| statement.findKeyword("Mrs.Liu") >= 0
				|| statement.findKeyword("Mrs.Ronina") >= 0
				|| statement.findKeyword("Mrs.Petersen") >= 0
				|| statement.findKeyword("Mills") >= 0
				|| statement.findKeyword("Vikings") >= 0
				|| statement.findKeyword("School") >= 0) {
			response = "Tell me more about your school.";
		} else if (statement.indexOf("") >= 0) {
			response = "Say Something Please, I Am Very Lonely :( ";
		} else {
			response = getRandomResponse();
		
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		while (psn >= 0) {
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),
						psn + goal.length() + 1).toLowerCase();
			}
			if (before.equals(" ") && after.equals(" ")) {
				return psn;
			}
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}

		return -1;
	}

	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}
	if (statement.findKeyword("") > = 0) {
		response = Hello?;
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

}
