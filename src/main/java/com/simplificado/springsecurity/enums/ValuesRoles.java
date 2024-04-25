package com.simplificado.springsecurity.enums;

public enum ValuesRoles {
    BASIC(1L),
    ADMIN(2L);

    long roleId;

    ValuesRoles(long roleId) {
        this.roleId = roleId;
    }

    public long getRoleId() {
        return roleId;
    }

}
