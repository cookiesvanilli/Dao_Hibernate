package com.example.Dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "persons")
@NamedNativeQuery(
        name = "findPersonByCity",
        query = "select * from persons p where p.cityOfLiving = :city"
)
public class Person {
    @EmbeddedId
    private Human human;
    @Column(length = 25, name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(length = 50, name = "cityOfLiving", nullable = false)
    private String cityOfLiving;


}