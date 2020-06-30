package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Linh_test_people")
@ToString(exclude = { "peopleComputer"})
public class People {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

//    @Column(name = "people_col_1")
//    private Integer peopleCol1;

//    @Column(name = "people_col_2")
//    private String peopleCol2;
//
//    @Column(name = "people_col_3")
//    private String peopleCol3;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name = "computer_id", referencedColumnName = "id")
//    @JoinColumns({
//            @JoinColumn(name="computer_id", referencedColumnName="id"),
//            @JoinColumn(name="people_col_1", referencedColumnName="computer_col_1"),
//            @JoinColumn(name="people_col_2", referencedColumnName="computer_col_2"),
//            @JoinColumn(name="people_col_3", referencedColumnName="computer_col_3")
//    })
    private Computer peopleComputer;
}
