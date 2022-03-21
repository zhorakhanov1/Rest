package com.RestWeb.Rest.Model;


import com.RestWeb.Rest.enums.ProjectStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "project")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity

//This is entity class for Project
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Integer priority;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @OneToMany(
            mappedBy = "project",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Task> tasks = new ArrayList<>();
}
