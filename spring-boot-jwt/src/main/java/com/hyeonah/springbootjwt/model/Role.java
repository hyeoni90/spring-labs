package com.hyeonah.springbootjwt.model;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
@Builder
public class Role {

    @Id
    @Column(name = "role_name", length = 50)
    private String roleName;

    protected Role() {
    }

    public Role(final String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
