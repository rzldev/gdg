package life.genny.datagenerator.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "baseentity")
@Table(indexes = @Index(columnList = "realm, status, code, name"))
public class BaseEntity {
    @Column(length = 31, nullable = false, name = "d_type")
    @ColumnDefault("\"BaseEntity\"")
    private String dType;

    @Id
    @Column(length = 20)
    @GeneratedValue()
    private Long id;

    @CreationTimestamp
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(length = 6)
    private Date created;

    @Column()
    private String name;

    @Column(nullable = false)
    @ColumnDefault("\"genny\"")
    private String realm;

    @UpdateTimestamp
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(length = 6)
    private Date updated;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    @ColumnDefault("0")
    private int status;

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
