package com.company.profile.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "profile")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column(name = "user_name")
    private String username;
    @Column
    private String email;
    @Column
    private Long gold;
    @Column(name = "win_count")
    private Integer winCount;
    @Column(name = "fights_count")
    private Integer fightsCount;
}
