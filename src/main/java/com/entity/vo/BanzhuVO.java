package com.entity.vo;

import com.entity.BanzhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 版主
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("banzhu")
public class BanzhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
