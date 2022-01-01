package Practice03;

public class MyException extends Exception{
	
	String exMsg;
	
	public MyException(String msg) {
		exMsg = "MyException" + msg;
	}
	
	//override
	public String getmessage() {
		return exMsg;
	}

}
