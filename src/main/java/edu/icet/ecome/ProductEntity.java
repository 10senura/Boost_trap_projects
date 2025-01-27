package edu.icet.ecome;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String name;
        private String vendor;
        private String category;
        private Double price;
}
