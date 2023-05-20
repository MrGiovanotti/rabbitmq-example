package com.mrgiovanotti.rabbitmq.dummy;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Data implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String message;
    
}
