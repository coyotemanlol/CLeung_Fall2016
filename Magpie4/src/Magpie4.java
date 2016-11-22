public class Magpie4 {

	public String getGreeting() {
		return "Hello, let's talk. I am very lonely. ";
	}

	public String getResponse(String statement) {
		int psn = findKeyword(statement, "you", 0);
		String response = "";

		if (findKeyword(statement,"no") >= 0) {
			return response = "Why so negative? .";
			
		
		} else if (findKeyword(statement, "mother") >= 0
				||(findKeyword(statement,"father") >= 0
				|| (findKeyword(statement,"sister") >= 0
				|| (findKeyword(statement,"brother") >= 0)))){
			return response = "Tell me more about your family.";
		
		} else if  ((findKeyword(statement,"Mrs.Dreyer")) >= 0 ) { 
					return response = "She is an excellent Computer Science teacher!";
		} else if ((findKeyword(statement,"Mrs.Wang")) >=0) {
					return response = "She teaches Chinese!";
		} else if ((findKeyword(statement,"Mrs.Zink")) >= 0 ) {
					return response = "She teaches History!";
		} else if ((findKeyword(statement,"Mrs.Liu")) >= 0 ) {
					return response = "She teaches Physics!";
		} else if ((findKeyword(statement,"Mrs.Ronina")) >= 0 ) {
					return response = "She teaches Math!";
		}
		else if (findKeyword(statement, "I want", 0) >= 0) {
			return response = transformIWantToStatement(statement);
		}
		else if (findKeyword(statement, "lol", 0) >= 0) {
			return response = "What's so funny?";
		}
		else if (findKeyword(statement, "?", 0) >= 0) {
				return response = "I don't know the answer to that question";
		}
		else if (findKeyword(statement, "school", 0) >= 0) {
					return response = "education is key, especially when applying to get a job";
				}
		else if (findKeyword(statement, "hate", 0) >= 0) {
			return response = "Why are you so mean?";
		}
		else if (findKeyword(statement, "dab", 0) >= 0) {
				return response = "My robotic dabs are so lit";
		}else if (findKeyword(statement, "lmao", 0) >= 0) {
					return response = "Black lives matter.";
		}else if (findKeyword(statement, "hello", 0) >= 0) {
			return response = "suuh duude";
		}else if (findKeyword(statement, "wow", 0) >= 0) {
			return response = "Amazing right?";
		}
		
		else if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
				return response = transformYouMeStatement(statement);
			} else if((psn >= 0 && findKeyword(statement, "you", psn) >= 0) ){ 
				return response = ImeStatement(statement);
			}else{
				return response = getRandomResponse();
			}
		}

	private String ImeStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfMe = findKeyword(statement, "you", 0);
		int psnOfYou = findKeyword(statement, "me", psnOfMe + 3);

		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe)
				.trim();
		return "Do you " + restOfStatement + " me?";
	}
	
	private String transformIWantToStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "I want", 0);
		String restOfStatement = statement.substring(psn + 6).trim();
		return "I dont think you would want " + restOfStatement + ",but if you really need it then sure!";
	}

	private String transformYouMeStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfYou = findKeyword(statement, "you", 0);
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);

		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe)
				.trim();
		return "Why do you " + restOfStatement + " me?";
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
			response = "Astonishing!";
		} else if (whichResponse == 5) {
			response = "I totally agree with you!";
		}

		return response;
	}
}
	