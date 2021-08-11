package com.aydar.test.bars.entity;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = "CONTRACTS")
public class Contract {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    private Integer number;
    private Calendar createdDate;
    private Calendar lastUpdatedDate;

    public Contract(Integer number, Calendar createdDate, Calendar lastUpdatedDate) {
        this.number = number;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Contract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Calendar lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

}

