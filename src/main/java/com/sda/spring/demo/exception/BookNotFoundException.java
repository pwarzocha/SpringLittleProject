package com.sda.spring.demo.exception;

public class BookNotFoundException
        extends RuntimeException{
    public BookNotFoundException(Long id){
        super("Nie moge znalezc ksiazki " + id);
    }
}
