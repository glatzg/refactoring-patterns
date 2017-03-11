package refactoringpatterns.extractinterface;

/**
 * Beispiel für "Extract Interface".
 * 
 * Situation: Klasse ist von Implementierung anderer Klasse abhängig
 * 
 * Ziel: Testfall mit Mock-Objekt erstellen, wobei das Mock-Objekt ein Interface
 * implementiert. Dafür muss auch TransactionLog dieses Interface
 * implementieren.
 * 
 *
 * @author glatz
 *
 */
public class PaydayTransaction extends Transaction {

	public PaydayTransaction(PayrollDatabase db, TransactionLog log) {
		super(db, log);
	}

	public void run() {
		// ...
	}

}
