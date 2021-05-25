package bootcamp.hrms.core;

public class SuccesResult extends Result {

	public SuccesResult() {
		super(true);
	}

	public SuccesResult(String message) {
		super(true, message);
	}
}
