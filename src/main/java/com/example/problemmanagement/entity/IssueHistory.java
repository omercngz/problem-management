package com.example.problemmanagement.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "issue_history")
public class IssueHistory extends BaseEntity { // issueların geçmişini görmek için

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "issue_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private Issue issue;

    @Column(name = "description",length = 1000)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @Column(name = "details",length = 4000)
    private String details ;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne( optional = true, fetch = FetchType.LAZY)
    private User assignee;
}
