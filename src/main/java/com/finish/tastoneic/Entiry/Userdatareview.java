package com.finish.tastoneic.Entiry;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Userdatareview {
    @Id
    @SequenceGenerator(sequenceName = "reviewId", name = "reviewId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reviewId")
    private long id;
    @Column(nullable = false)
    private String UserName;
    @Column(nullable = false)
    @Email(message = "Enter the valid mail")
    private String Email;
    @Column
    private long Age;
    @Column(nullable = false)
    private String Gender;
    @Column(length = 300,nullable = false)
    private String Feedback;
}
