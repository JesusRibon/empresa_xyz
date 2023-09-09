package com.example.empresa_jrb.exceptions;

import org.springframework.http.HttpStatus;

public class Exeption extends BaseException{
public Exeption(String message){
  super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.PRODUCT_NOT_FOUND);
}
}
