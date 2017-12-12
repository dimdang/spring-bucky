package com.bucky.crazy.model.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by Dang Dim
 * Date     : 12-Dec-17, 1:59 PM
 * Email    : d.dim@gl-f.com
 */
@Entity
@Table(name = "td_product")
public class Product extends AbstractEntities {

    @JsonProperty("PRODUCT_NAME")
    private String productName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    @Override
    public Long getId() {
        return null;
    }

    @Column(name = "usr_code")
    @Override
    public String getCode() {
        return null;
    }

    @Column(name = "usr_desc")
    @Override
    public String getDesc() {
        return null;
    }

    @Column(name = "pro_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
