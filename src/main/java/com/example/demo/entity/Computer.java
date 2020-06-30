package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Linh_test_computer")
@ToString(exclude = { "peopleComputer1"})
public class Computer implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "version")
    private Integer version;

    @Column(name = "computer_col_1")
//    @OneToOne(mappedBy = "peopleComputer")
//    @JsonBackReference
    private Integer computerCol1;

    @Column(name = "computer_col_2")
//    @OneToOne(mappedBy = "peopleComputer")
//    @JsonBackReference
    private String computerCol2;

    @Column(name = "computer_col_3")
//    @OneToOne(mappedBy = "peopleComputer")
//    @JsonBackReference
    private String computerCol3;

//    @OneToOne(mappedBy = "peopleComputer")
//    @JsonBackReference
//    private People peopleComputer;

    @OneToOne(mappedBy = "peopleComputer1")
    @JsonBackReference
    private People peopleComputer1;
}
