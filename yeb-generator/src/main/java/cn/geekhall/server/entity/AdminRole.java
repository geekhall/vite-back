package cn.geekhall.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author yiny
 * @since 2022-02-10
 */
@TableName("t_admin_role")
@ApiModel(value = "AdminRole对象", description = "")
public class AdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("adminid")
    private Integer aid;

    @ApiModelProperty("角色id")
    private Integer rid;

    @ApiModelProperty("创建时间")
    private LocalDateTime gmtCreate;

    private String remark;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "AdminRole{" +
            "aid=" + aid +
            ", rid=" + rid +
            ", gmtCreate=" + gmtCreate +
            ", remark=" + remark +
        "}";
    }
}
