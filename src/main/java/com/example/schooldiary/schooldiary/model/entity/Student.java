package com.example.schooldiary.schooldiary.model.dto.entity;

import com.example.schooldiary.schooldiary.model.dto.entity.parent.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Audited;

@Getter
@Setter
@Entity
@Audited.Table(name = "student")
@NoArgsConstructor
public class Student extends BaseEntity {

    private String firstName;

    private String lastName;

    private int  gradeLevel;
}
