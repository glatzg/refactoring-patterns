package refactoringpatterns.adaptparameter;

/**
 * Diese Klasse ist ein Platzhalter für die "echte" HttpServletRequest-Klasse.
 * 
 * @author glatz
 *
 */
public class HttpServletRequest {

	private String[] parameterValues = { "42", "foo", "bar" };
	
	public String[] getParameterValues(String someKey) {
		return parameterValues;
	}

}
