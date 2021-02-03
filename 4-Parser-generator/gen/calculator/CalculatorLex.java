package calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorLex {
	private StringBuilder inputSB;
	private List<TokensHolder> tokenPatterns = new ArrayList<>();
	private List<TokensHolder> skipTokenPatterns = new ArrayList<>();
	private List<CalculatorToken> tokens = new ArrayList<>();
	private List<String> tokensToString = new ArrayList<>();
	private int currentPosition = 0;

	public CalculatorLex(String input) throws Exception {
		inputSB = new StringBuilder(input);

		tokenPatterns.add(new TokensHolder(CalculatorToken.PLUS,"\\+"));
		tokenPatterns.add(new TokensHolder(CalculatorToken.MINUS,"-"));
		tokenPatterns.add(new TokensHolder(CalculatorToken.MUL,"\\*"));
		tokenPatterns.add(new TokensHolder(CalculatorToken.DIV,"\\/"));
		tokenPatterns.add(new TokensHolder(CalculatorToken.POW,"\\^"));
		tokenPatterns.add(new TokensHolder(CalculatorToken.LBRACKET,"\\("));
		tokenPatterns.add(new TokensHolder(CalculatorToken.RBRACKET,"\\)"));
		tokenPatterns.add(new TokensHolder(CalculatorToken.NUMBER,"[1-9]+[0-9]*|0"));

		skipTokenPatterns.add(new TokensHolder(CalculatorToken.SPACE,"[ \n\r]+"));
		getTokens();
	}

	public CalculatorToken getCurrentToken() {
		return tokens.get(currentPosition);
 	}

	public String getCurrentTokenString() {
		return tokensToString.get(currentPosition);
	}

	public CalculatorToken getNextToken() {
		return tokens.get(++currentPosition);
	}

	private void getTokens() throws Exception {
		while (!(inputSB.length() == 0)) {
			CalculatorToken t = findFirstToken();
			if (t != null) {
				tokens.add(t);
			} else if (!findFirstSkipToken()) {
				throw new Exception("Not find matching with tokens.");
			}
		}
		tokens.add(CalculatorToken._END);
	}

	private boolean findFirstSkipToken() {
		for (TokensHolder item : skipTokenPatterns) {
			Matcher m = item.pattern.matcher(inputSB.toString());
			if (m.lookingAt()) {
				inputSB.delete(0, m.end());
				return true;
			}
		}
		return false;
	}

	private CalculatorToken findFirstToken() {
		for (TokensHolder item : tokenPatterns) {
			Matcher m = item.pattern.matcher(inputSB.toString());
			if (m.lookingAt()) {
				tokensToString.add(inputSB.substring(0, m.end()));
				inputSB.delete(0, m.end());
				return item.token;
			}
		}
		return null;
	}

	private static class TokensHolder {
		CalculatorToken token;
		Pattern pattern;
		TokensHolder(CalculatorToken token, String s) {
			this.token = token;
			pattern = Pattern.compile(s);
		}
	}
}
