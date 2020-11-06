package de.adesso.model;

import java.util.UUID;

public class SendSessionID {
    String id;
    public SendSessionID(){

    }
    public SendSessionID( String id){

     this.id = id;
    }

    public String getContent() {
        return id;
    }
}
