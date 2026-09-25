package com.tads20262.catalago.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@AllArgsConstructor
@Data
@NoArgsConstructor

@Entity
@Table(name = "tb_category")
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant creatAt;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updateAt;
    @PrePersist
    public void PrePersist(){
        creatAt = Instant.now();
    }

    @PreUpdate
    public void PreUpdate(){
        updateAt = Instant.now();
    }
}
