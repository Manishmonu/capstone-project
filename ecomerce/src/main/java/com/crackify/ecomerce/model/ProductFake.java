package com.crackify.ecomerce.model;

import lombok.Data;

@Data
public class ProductFake {

	private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private RatingFake rating;
}
