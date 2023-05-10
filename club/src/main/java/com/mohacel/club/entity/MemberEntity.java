package com.mohacel.club.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "MEMBER_TBL")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID_COL")
    private Integer id;
    @Column(name = "MEMBER_NAME_COL")
    private String name;
    @Column(name = "MEMBER_GENDER_COL")
    private String gender;
    @Column(name = "MEMBER_AGE_COL")
    private Integer age;
    @Column(name = "MEMBER_DEPARTMENT_COL")
    private String department;

}
