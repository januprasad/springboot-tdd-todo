package com.jk.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDo {
    @Id
    @GeneratedValue
    private long id;
    private String description;
    private boolean completed;
    public ToDo(){

    }

    public ToDo(long id, String description, boolean completed) {

        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public ToDo(String description, boolean completed) {

        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }
}
