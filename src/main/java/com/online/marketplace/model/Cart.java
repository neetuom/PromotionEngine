package com.online.marketplace.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cart implements Serializable {

    private String sku;

    private int quantity;

    private int price;
}