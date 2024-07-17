package com.entity.model;

import com.entity.BanzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 版主
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BanzhuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 版主姓名
     */
    private String banzhuName;


    /**
     * 头像
     */
    private String banzhuPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 联系方式
     */
    private String banzhuPhone;


    /**
     * 邮箱
     */
    private String banzhuEmail;


    /**
     * 假删
     */
    private Integer banzhuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：版主姓名
	 */
    public String getBanzhuName() {
        return banzhuName;
    }


    /**
	 * 设置：版主姓名
	 */
    public void setBanzhuName(String banzhuName) {
        this.banzhuName = banzhuName;
    }
    /**
	 * 获取：头像
	 */
    public String getBanzhuPhoto() {
        return banzhuPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setBanzhuPhoto(String banzhuPhoto) {
        this.banzhuPhoto = banzhuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：联系方式
	 */
    public String getBanzhuPhone() {
        return banzhuPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setBanzhuPhone(String banzhuPhone) {
        this.banzhuPhone = banzhuPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getBanzhuEmail() {
        return banzhuEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setBanzhuEmail(String banzhuEmail) {
        this.banzhuEmail = banzhuEmail;
    }
    /**
	 * 获取：假删
	 */
    public Integer getBanzhuDelete() {
        return banzhuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setBanzhuDelete(Integer banzhuDelete) {
        this.banzhuDelete = banzhuDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
