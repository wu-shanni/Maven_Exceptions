package org.example;

public class NotFound extends RuntimeException {
//    private int statusCode = 0;

    public NotFound(String message) {
        super(message);
    }

//    public NotFound(String message, int statusCode){
//        super(message);
//        this.statusCode = statusCode;
//    }
//
//    public int getStatusCode() {
//        return statusCode;
//    }

}
