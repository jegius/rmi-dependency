package com.edu.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookRMI implements Serializable {

    private Long id;

    private String title;

    private String author;

    private int totalPages;

    private String coverImage;
}