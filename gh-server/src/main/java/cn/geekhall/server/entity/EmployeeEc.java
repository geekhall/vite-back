package cn.geekhall.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author yiny
 * @since 2022-02-09
 */
@TableName("t_employee_ec")
@ApiModel(value = "EmployeeEc对象", description = "")
public class EmployeeEc implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("员工编号")
    private Integer eid;

    @ApiModelProperty("奖罚日期")
    private LocalDate ecDate;

    @ApiModelProperty("奖罚原因")
    private String ecReason;

    @ApiModelProperty("奖罚分")
    private Integer ecPoint;

    @ApiModelProperty("奖罚类别，0：奖，1：罚")
    private Integer ecType;

    @ApiModelProperty("备注")
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
    public LocalDate getEcDate() {
        return ecDate;
    }

    public void setEcDate(LocalDate ecDate) {
        this.ecDate = ecDate;
    }
    public String getEcReason() {
        return ecReason;
    }

    public void setEcReason(String ecReason) {
        this.ecReason = ecReason;
    }
    public Integer getEcPoint() {
        return ecPoint;
    }

    public void setEcPoint(Integer ecPoint) {
        this.ecPoint = ecPoint;
    }
    public Integer getEcType() {
        return ecType;
    }

    public void setEcType(Integer ecType) {
        this.ecType = ecType;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "EmployeeEc{" +
            "id=" + id +
            ", eid=" + eid +
            ", ecDate=" + ecDate +
            ", ecReason=" + ecReason +
            ", ecPoint=" + ecPoint +
            ", ecType=" + ecType +
            ", remark=" + remark +
        "}";
    }
}
