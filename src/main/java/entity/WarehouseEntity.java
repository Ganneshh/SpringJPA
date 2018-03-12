package entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Immutable
@EqualsAndHashCode
@Entity
@Table(name = "warehouse")
public class WarehouseEntity {

    @Id
    private Long id;

    @Basic
    private UUID resourceId;

    @Column
    private String name;

    @Column(name = "plant_number")
    private Integer plantNumber;

    @Column(name = "warehouse_code")
    private String code;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "address_city")
    private String addressCity;

    @Column(name = "address_state")
    private String addressState;

    @Column(name = "address_zip")
    private String addressZip;

    @OneToMany
    @JoinColumn(name = "warehouse_id")
    private List<ZipcodeEntity> zipCodes;

}
