package com.example.SalesCommissionSpringBootFinal.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long salesId;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "products")
    private List<Product> products;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "salesman")
    private List<Salesman> salesman;

}
