package refactoringpatterns.extractinterface;

/**
 * Sollte in der Praxis eine Transaktion repr�sentieren.
 * 
 * @author glatz
 *
 */
public class Transaction {

	private PayrollDatabase db;

	public Transaction(PayrollDatabase db, TransactionLog log) {
		this.db = db;
	}

}
