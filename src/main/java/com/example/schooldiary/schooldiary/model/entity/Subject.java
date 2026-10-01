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
@Audited.Table(name = "subject")
@NoArgsConstructor
public class Subject extends BaseEntity {

    private String  title;
}
