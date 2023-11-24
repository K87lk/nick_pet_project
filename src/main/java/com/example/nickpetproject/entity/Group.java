package com.example.nickpetproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "group_number", unique = true)
    private String groupNumber;

    @Column(name = "student_count", nullable = false)
    private int studentCount;


    @OneToMany(mappedBy = "group")
    private Collection<Students> students;

    public Collection<Students> getStudents() {
        return students;
    }

    public void setStudents(Collection<Students> students) {
        this.students = students;
    }
}
