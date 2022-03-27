package hrms.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult{
	public ErrorDataResult(T data, boolean success, String message) {
		super(data, false, message);
	}
	public ErrorDataResult(T data, boolean success) {
		super(data, false);
	}
	public ErrorDataResult(String message) {
		super(null, false,message);
	}
	public ErrorDataResult() {
		super(null, false);
	}
}
