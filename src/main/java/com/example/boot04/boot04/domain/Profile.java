package com.example.boot04.boot04.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString(exclude = "member")
@Entity
@Table(name="tbl_profile")
@EqualsAndHashCode(of="fno")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fno;
    private String name;
    private boolean current;

    @ManyToOne
    private Member member;
}
