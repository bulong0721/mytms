package org.mytms.common.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.GenericEntity;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@NoArgsConstructor
@Entity
@Table(name = "res_client")
public class Client extends GenericEntity<Long, Client> {
    private static final long serialVersionUID = 1L;
    @Column(nullable = false, unique = true, length = 40)
    private String name = null;
    @Column(nullable = false, unique = true, name = "cl_nr", length = 20)
    private String number = null;
    @Column(name = "cl_code", length = 20)
    private String code = "";
    @Email
    @Column(length = 20)
    private String email = "";
    @Column(length = 20)
    private String phone = "";
    @Column(length = 20)
    private String fax = "";

    public Client(long id) {
        super();
        setId(id);
    }

    @Override
    public String toUniqueString() {
        return getNumber();
    }

    @Transient
    public boolean isSystemClient() {
        if (getId() == 0)
            return true;
        else
            return false;
    }
}
