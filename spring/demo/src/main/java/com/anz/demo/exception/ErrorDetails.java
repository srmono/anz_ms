package com.anz.demo.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor 
@ToString
public class ErrorDetails {

	private Date timeStamp;
	private String message;
	private String details;
}
