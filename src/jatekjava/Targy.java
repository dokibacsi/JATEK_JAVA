package jatekjava;

import java.util.UUID;

public class Targy {
    private UUID id;
    private String name, desc;

    public Targy(String name, String desc) {
        id = UUID.randomUUID();
        this.name = name;
        this.desc = desc;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Tárgyunk:\n\tEgyedi azonosítója = " + id + "\n\tMegnevezés = " + name + "\n\t desc = " + desc;
    }
    
    
    
    
}
