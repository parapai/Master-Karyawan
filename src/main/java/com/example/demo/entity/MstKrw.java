package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "mst_krw")
public class MstKrw {
    @Id
    private Long nik;
    
    @Column
    private String nameKrw;
    
    @Column
    private String phoneKrw;
 
    // getters and setters...
}
