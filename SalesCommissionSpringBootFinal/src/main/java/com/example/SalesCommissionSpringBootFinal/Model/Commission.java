package com.example.SalesCommissionSpringBootFinal.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "commission")
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commissionId")
    private Long commissionId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "salesmanName")
    private String salesmanName;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "salesAmount")
    private Double salesAmount;

    @Column(name = "salesmanArea")
    private String salesmanArea;

    @Column(name = "salesmanCommission")
    private Double salesmanCommission;
    @Column(name = "createdDate")
    private String createdDate;
}
