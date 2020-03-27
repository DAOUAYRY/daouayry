package semifir.cinexo.aop;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import semifir.cinexo.errors.NotFoundException;

@ControllerAdvice
public class RestControllerException  extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ NotFoundException.class })
    public ResponseEntity<Object> handleAccessDeniedException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
	        		"Not trouvé : " + ex.getMessage() , 
	        		new HttpHeaders(), 
	        		HttpStatus.FORBIDDEN
        		);
    }
}
