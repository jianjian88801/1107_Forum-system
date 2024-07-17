package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 版主
 *
 * @author 
 * @email
 */
@TableName("banzhu")
public class BanzhuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BanzhuEntity() {

	}

	public BanzhuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 版主姓名
     */
    @TableField(value = "banzhu_name")

    private String banzhuName;


    /**
     * 头像
     */
    @TableField(value = "banzhu_photo")

    private String banzhuPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 联系方式
     */
    @TableField(value = "banzhu_phone")

    private String banzhuPhone;


    /**
     * 邮箱
     */
    @TableField(value = "banzhu_email")

    private String banzhuEmail;


    /**
     * 假删
     */
    @TableField(value = "banzhu_delete")

    private Integer banzhuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：版主姓名
	 */
    public String getBanzhuName() {
        return banzhuName;
    }
    /**
	 * 获取：版主姓名
	 */

    public void setBanzhuName(String banzhuName) {
        this.banzhuName = banzhuName;
    }
    /**
	 * 设置：头像
	 */
    public String getBanzhuPhoto() {
        return banzhuPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setBanzhuPhoto(String banzhuPhoto) {
        this.banzhuPhoto = banzhuPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getBanzhuPhone() {
        return banzhuPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setBanzhuPhone(String banzhuPhone) {
        this.banzhuPhone = banzhuPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getBanzhuEmail() {
        return banzhuEmail;
    }
    /**
	 * 获取：邮箱
	 */

    public void setBanzhuEmail(String banzhuEmail) {
        this.banzhuEmail = banzhuEmail;
    }
    /**
	 * 设置：假删
	 */
    public Integer getBanzhuDelete() {
        return banzhuDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setBanzhuDelete(Integer banzhuDelete) {
        this.banzhuDelete = banzhuDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Banzhu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", banzhuName=" + banzhuName +
            ", banzhuPhoto=" + banzhuPhoto +
            ", sexTypes=" + sexTypes +
            ", banzhuPhone=" + banzhuPhone +
            ", banzhuEmail=" + banzhuEmail +
            ", banzhuDelete=" + banzhuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
