package com.example.problemmanagement.entity;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data// Getter ve Setter için
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode // equals ve hashcode metodunu override ediyor.
@Table(name = "issue")
public class Issue extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description",length = 400)
    private String description;

    @Column(name = "details", length = 100)
    private String details;

    @Column(name = "date")
    private Date date;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assigne_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY) // many to one ile join yaptım. Many(bir çok issue clası birtane user clasına bağlanabilri.)
    private User assigne;

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;
}
