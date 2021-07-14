package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate
@Table(name = "CategoryCode")
public class Number {

    @Id
    @GeneratedValue
    @Column(name = "CategoryId")
    private int CategoryId;

    @Column(name = "CategoryCode")
    private int CategoryCode;
}
