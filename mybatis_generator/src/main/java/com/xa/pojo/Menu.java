package com.xa.pojo;

import java.math.BigDecimal;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MENU.MENU_ID
     *
     * @mbggenerated
     */
    private BigDecimal menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MENU.MENU_NAME
     *
     * @mbggenerated
     */
    private String menuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MENU.MENU_ICO
     *
     * @mbggenerated
     */
    private String menuIco;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MENU.MENU_URL
     *
     * @mbggenerated
     */
    private String menuUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MENU.FATHERID
     *
     * @mbggenerated
     */
    private BigDecimal fatherid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MENU.MENU_ID
     *
     * @return the value of MENU.MENU_ID
     *
     * @mbggenerated
     */
    public BigDecimal getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MENU.MENU_ID
     *
     * @param menuId the value for MENU.MENU_ID
     *
     * @mbggenerated
     */
    public void setMenuId(BigDecimal menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MENU.MENU_NAME
     *
     * @return the value of MENU.MENU_NAME
     *
     * @mbggenerated
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MENU.MENU_NAME
     *
     * @param menuName the value for MENU.MENU_NAME
     *
     * @mbggenerated
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MENU.MENU_ICO
     *
     * @return the value of MENU.MENU_ICO
     *
     * @mbggenerated
     */
    public String getMenuIco() {
        return menuIco;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MENU.MENU_ICO
     *
     * @param menuIco the value for MENU.MENU_ICO
     *
     * @mbggenerated
     */
    public void setMenuIco(String menuIco) {
        this.menuIco = menuIco == null ? null : menuIco.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MENU.MENU_URL
     *
     * @return the value of MENU.MENU_URL
     *
     * @mbggenerated
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MENU.MENU_URL
     *
     * @param menuUrl the value for MENU.MENU_URL
     *
     * @mbggenerated
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MENU.FATHERID
     *
     * @return the value of MENU.FATHERID
     *
     * @mbggenerated
     */
    public BigDecimal getFatherid() {
        return fatherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MENU.FATHERID
     *
     * @param fatherid the value for MENU.FATHERID
     *
     * @mbggenerated
     */
    public void setFatherid(BigDecimal fatherid) {
        this.fatherid = fatherid;
    }
}