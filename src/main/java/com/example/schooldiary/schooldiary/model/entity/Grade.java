package com.example.schooldiary.schooldiary.model.dto.entity;

import com.example.schooldiary.schooldiary.model.dto.entity.parent.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Audited;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Audited.Table(name = "grade")
@NoArgsConstructor
public class Grade extends BaseEntity {

    private int value;

    private LocalDate date;

}
