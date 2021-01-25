package com.cosminflorica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Document(collation = "Bill")
public class Bill {
    @Id
    @GeneratedValue
    private String id;
//    @NotBlank(message="Name is required")
    private String name;
//    @NotBlank(message = "Description is required")
    private String description;
//    @NotBlank(message="Value is required")
    private Long value;
//    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date created_at;
//    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date bill_date;


    public Bill(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    @PrePersist
    protected void onCreate(){this.created_at = new Date();}
}
