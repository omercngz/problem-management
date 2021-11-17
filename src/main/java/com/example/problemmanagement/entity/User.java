package com.example.problemmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
@EqualsAndHashCode
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "uname",length = 200,unique = true)
    private String userName;

    @Column(name = "name_surname",length = 200)
    private String nameSurname;

    @Column(name = "email",length = 200)
    private String email;

    @Column(name = "pwd",length = 200)
    private String password;

    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)// bir kullanıcıya bir çok issue bağlanabilir.(layz) ihtiyaç duyduğumda
    private List<Issue> issues;


}
