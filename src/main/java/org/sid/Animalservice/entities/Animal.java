package org.sid.Animalservice.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Animal {
    @Id
    @NonNull
    private String id;
    private String name;
    private String image;
    @Column(length = 2048)
    private String description;
}
