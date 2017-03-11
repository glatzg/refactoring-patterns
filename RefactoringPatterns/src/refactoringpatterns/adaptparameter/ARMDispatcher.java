package refactoringpatterns.adaptparameter;

/**
 * Beispiel für "Adapt Parameter".
 * 
 * Situation: Parameter erzwingt Abhängigkeit zu einer anderen konkreten Klasse,
 * hier: HttpServletRequest.
 * 
 * Ziel: Abhängigkeit eliminiert und durch Interface ersetzt.
 * 
 * <pre>
 * public class ARMDispatcher {
 * 
 * 	public void populate(ParameterSource source) {
 * 		String someKey = "whatever";
 * 		String value = source.getParameterForName(someKey);
 * 		if (value != null) {
 * 			doSomethingWithParameterValue(value);
 * 		}
 * 		// ...
 * 	} // ...
 * }
 * </pre>
 * 
 * @author glatz
 *
 */
public class ARMDispatcher {

	public void populate(HttpServletRequest request) {
		String someKey = "whatever";
		String[] values = request.getParameterValues(someKey);
		if (values != null && values.length > 0) {
			doSomethingWithParameterValue(values[0]);
		}
		// ...
	}
	// ...

	private void doSomethingWithParameterValue(String paramValue) {
		// was auch immer :-)

	}
}
