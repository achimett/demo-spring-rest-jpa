package com.achimett.demopositionemployee;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String desc;

    protected Position() {}

    public Position(@NotNull String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Position)) {
            return false;
        }

        Position p = (Position) obj;

        return name.equals(p.name) && desc.equals(p.desc);
    }

    @Override
    public String toString() {
        return "Professional Position: " + name + "\n"
                + "Description: " + desc + "\n";
    }
}
