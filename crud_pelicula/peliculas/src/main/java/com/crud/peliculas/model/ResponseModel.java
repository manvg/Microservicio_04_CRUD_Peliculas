package com.crud.peliculas.model;

public class ResponseModel {
    private boolean status;
    private String message;

    public ResponseModel(boolean status, String mensaje) {
        this.status = status;
        this.message = mensaje;
    }

    public boolean getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
