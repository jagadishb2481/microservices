package product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<Object> exceptionHandler(ProductNotFoundException ex){
		
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
		
	}
	
}
