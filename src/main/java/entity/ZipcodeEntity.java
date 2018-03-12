package entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "zipcode")
@Data
public class ZipcodeEntity {

    @Id
    @Column(name = "zipcode")
    String code;

    @Column
    String state;

    @Column
    String city;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private WarehouseEntity warehouse;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private RouteEntity route;
}
