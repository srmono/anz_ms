package com.anz.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHander {
	
	//Handling specific exception
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundHandling(
			ResourceNotFoundException exception,
			WebRequest request
			) {
		ErrorDetails errorDetails = new ErrorDetails(
					new Date(),
					exception.getMessage(),
					request.getDescription(false)
				);
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	//Handling global exception
	public ResponseEntity<?> globalExceptionHandler(
			Exception exception,
			WebRequest request
			){
		ErrorDetails errorDetails = new ErrorDetails(
				new Date(),
				exception.getMessage(),
				request.getDescription(false)
			);
		
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
//		@ExceptionHandler(ApiException.class)
//		public ResponseEntity<?> globalAPIExceptionHandler(
//				ApiException exception,
//				WebRequest request
//				){
//			ErrorDetails errorDetails = new ErrorDetails(
//					new Date(),
//					exception.getMessage(),
//					request.getDescription(false)
//				);
//			
//			return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
//		}

}
