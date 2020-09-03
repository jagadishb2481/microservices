package product.exception;

public class ProductNotFoundException extends Exception{

	public ProductNotFoundException (String s){
		super(s.toString());
	}
	
}
