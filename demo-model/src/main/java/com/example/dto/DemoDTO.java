package com.example.dto;

import java.util.Date;

public class DemoDTO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo.d_id
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    /* @Comment() */
    private Long dId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo.name
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    /* @Comment() */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo.create_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    /* @Comment() */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo.update_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    /* @Comment() */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo.delete_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    /* @Comment() */
    private Date deleteTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo.d_id
     *
     * @return the value of demo.d_id
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public Long getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo.d_id
     *
     * @param dId the value for demo.d_id
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public void setdId(Long dId) {
        this.dId = dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo.name
     *
     * @return the value of demo.name
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo.name
     *
     * @param name the value for demo.name
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo.create_time
     *
     * @return the value of demo.create_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo.create_time
     *
     * @param createTime the value for demo.create_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo.update_time
     *
     * @return the value of demo.update_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo.update_time
     *
     * @param updateTime the value for demo.update_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo.delete_time
     *
     * @return the value of demo.delete_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo.delete_time
     *
     * @param deleteTime the value for demo.delete_time
     *
     * @mbggenerated Tue May 02 16:51:02 CST 2017
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}