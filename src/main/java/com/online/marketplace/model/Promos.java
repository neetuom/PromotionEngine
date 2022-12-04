package com.online.marketplace.model;


import lombok.*;


import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *  Promos Entity Pojo used to perform CRUD operation on the PROMOS table in MySQL database.
 */
@Entity
@Table(name="PROMOS",schema="promotion")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Promos implements Serializable {

    /**
     * serialVersionUID - used to serialize and deserialize the object.
     *  This class used Lombok to generate
     * @Getter
     * @Setter
     * @NoArgsConstructor
     * @EqualsAndHashCode
     * @ToString
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     *  promotionId - type int
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PROMOTION_ID", columnDefinition = "int")
    private int promotionId; // PROMOTION_ID;

    /**
     *  skuType - type String
     */
    @Column(name="SKU_TYPE", columnDefinition = "varchar(10)")
    private String skuType; // SKU_TYPE;

    /**
     *  promotionRule - type String
     */
    @Column(name="PROMOTION_RULE", columnDefinition = "varchar(200)")
    private String promotionRule; // PROMOTION_RULE;

    /**
     *  creationDate - type LocalDate
     */
    @Column(name="CREATION_DATE", columnDefinition = "DATE")
    private LocalDate creationDate; // CREATION_DATE;

    /**
     *  startDate - type LocalDate
     */
    @Column(name="START_DATE", columnDefinition = "DATE")
    private LocalDate startDate; // START_DATE;

    /**
     *  startDate - type LocalDate
     */
    @Column(name="END_DATE", columnDefinition = "DATE")
    private LocalDate endDate; // END_DATE;
}
