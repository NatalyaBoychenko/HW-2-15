package org.todolist.hw214.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Note {

    private Long id;
    private String title;
    private String content;
}
