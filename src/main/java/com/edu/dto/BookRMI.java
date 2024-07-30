package com.edu.dto;

import lombok.Data;

@Data
public class BookRMI {

    private Long id;

    private String title;

    private String author;

    private int totalPages;

    private String coverImage;
}