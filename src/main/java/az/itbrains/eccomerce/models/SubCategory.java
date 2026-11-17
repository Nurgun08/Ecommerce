package az.itbrains.eccomerce.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @FieldDefaults(level= AccessLevel.PRIVATE)
    @Entity
    @Table(name="sub_categories")
    public class SubCategory {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        @Column(length=50 , nullable=false)
        String name ;

        @ManyToOne
        Category category ;

    @OneToMany(mappedBy="category")
    List<Product> products=new ArrayList<>();


}
