package com.xa.pojo;

import java.math.BigDecimal;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.ROLE_ID
     *
     * @mbggenerated
     */
    private BigDecimal roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE.ROLE_NAME
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.ROLE_ID
     *
     * @return the value of ROLE.ROLE_ID
     *
     * @mbggenerated
     */
    public BigDecimal getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.ROLE_ID
     *
     * @param roleId the value for ROLE.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE.ROLE_NAME
     *
     * @return the value of ROLE.ROLE_NAME
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE.ROLE_NAME
     *
     * @param roleName the value for ROLE.ROLE_NAME
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}