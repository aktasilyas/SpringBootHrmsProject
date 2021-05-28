package akt.hrms.core.utilities;

public class DataResult<T> extends Result{

	private T data;
	public DataResult(T data,boolean success,String message) {
		super(success,message);
		this.data=data;
		
	}
	public DataResult(T data,boolean success) {
		super(success);//base'de ki tek parametreli constructor'a succes'i gonderdik
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}

}
