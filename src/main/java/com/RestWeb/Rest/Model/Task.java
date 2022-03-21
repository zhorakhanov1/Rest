package com.RestWeb.Rest.Model;

import com.RestWeb.Rest.enums.TaskStatus;
import lombok.*;

import javax.persistence.*;


@Table(name = "task")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    private Integer priority;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;
}
