package kg.itacademy.frontProj.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "f_city")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    @Column(name = "title")
    String title;
}
