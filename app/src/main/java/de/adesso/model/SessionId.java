package de.adesso.model;
import java.util.UUID;

public class SessionId {
    public String id;
   public SessionId(){
    }
    public SessionId(String id){
        this.id = id;
    }
    public String getId() {
        UUID uuid = UUID.randomUUID();
        id = String.valueOf(uuid);
        return id;
    }
}
