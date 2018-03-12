package entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Entity(name = "route")
@Table(name="route")
public class RouteEntity implements Serializable{

    @Id
    private Integer id;

    @Column(name = "route")
    private String name;

    @Column(name = "route_days")
    private String days;

    @OneToMany
    @JoinColumn(name = "route_id")
    private List<ZipcodeEntity> zipCodes;
}
