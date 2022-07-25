package com.roryscode.springboottodoapplication.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name ="todo_item")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean isComplete;

    @Getter
    @Setter
    private Instant createdDate;

    @Getter
    @Setter
    private Instant modifiedDate;

    public TodoItem() {}

    public TodoItem(String description) {
        this.description = description;
        this.isComplete = false;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();

    }

    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', isComplete='%s', createdDate='%s', modifiedDate='%s'}",
                id, description, isComplete, createdDate, modifiedDate);
    }


}
