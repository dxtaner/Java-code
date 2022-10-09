package polymorphismDemo;

public class CustomerManager {
	 	private BaseLogger _logger;

	    public CustomerManager(BaseLogger logger){
	        this._logger = logger;
	    }

	    public  void add(){
	        System.out.println("Customer added.");
	        _logger.log("Customer management log message.");
	    }
}
