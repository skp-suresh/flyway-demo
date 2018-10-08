package com.demo.flywaydemo.models;

import java.io.Serializable;

import javax.persistence.Entity;

public class Book implements Serializable {
    private Integer id;
    private String name;
    private String isbn;
}