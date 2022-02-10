package cn.geekhall.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("t_salary")
@ApiModel(value = "Salary对象", description = "")
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("基本工资")
    private Double basicSalary;

    @ApiModelProperty("奖金")
    private Double bonus;

    @ApiModelProperty("午餐补助")
    private Double lunchSalary;

    @ApiModelProperty("交通补助")
    private Double trafficSalary;

    @ApiModelProperty("应发工资")
    private Double allSalary;

    @ApiModelProperty("养老基金数")
    private Double pensionBase;

    @ApiModelProperty("养老金比率")
    private Double pensionPer;

    @ApiModelProperty("启用时间")
    private LocalDateTime createDate;

    @ApiModelProperty("医疗基数")
    private Integer medicalBase;

    @ApiModelProperty("医疗保险比率")
    private Float medicalPer;

    @ApiModelProperty("公积金基数")
    private Integer accumulationFundBase;

    @ApiModelProperty("公积金比率")
    private Float accumulationFundPer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    public Double getLunchSalary() {
        return lunchSalary;
    }

    public void setLunchSalary(Double lunchSalary) {
        this.lunchSalary = lunchSalary;
    }
    public Double getTrafficSalary() {
        return trafficSalary;
    }

    public void setTrafficSalary(Double trafficSalary) {
        this.trafficSalary = trafficSalary;
    }
    public Double getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(Double allSalary) {
        this.allSalary = allSalary;
    }
    public Double getPensionBase() {
        return pensionBase;
    }

    public void setPensionBase(Double pensionBase) {
        this.pensionBase = pensionBase;
    }
    public Double getPensionPer() {
        return pensionPer;
    }

    public void setPensionPer(Double pensionPer) {
        this.pensionPer = pensionPer;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public Integer getMedicalBase() {
        return medicalBase;
    }

    public void setMedicalBase(Integer medicalBase) {
        this.medicalBase = medicalBase;
    }
    public Float getMedicalPer() {
        return medicalPer;
    }

    public void setMedicalPer(Float medicalPer) {
        this.medicalPer = medicalPer;
    }
    public Integer getAccumulationFundBase() {
        return accumulationFundBase;
    }

    public void setAccumulationFundBase(Integer accumulationFundBase) {
        this.accumulationFundBase = accumulationFundBase;
    }
    public Float getAccumulationFundPer() {
        return accumulationFundPer;
    }

    public void setAccumulationFundPer(Float accumulationFundPer) {
        this.accumulationFundPer = accumulationFundPer;
    }

    @Override
    public String toString() {
        return "Salary{" +
            "id=" + id +
            ", name=" + name +
            ", basicSalary=" + basicSalary +
            ", bonus=" + bonus +
            ", lunchSalary=" + lunchSalary +
            ", trafficSalary=" + trafficSalary +
            ", allSalary=" + allSalary +
            ", pensionBase=" + pensionBase +
            ", pensionPer=" + pensionPer +
            ", createDate=" + createDate +
            ", medicalBase=" + medicalBase +
            ", medicalPer=" + medicalPer +
            ", accumulationFundBase=" + accumulationFundBase +
            ", accumulationFundPer=" + accumulationFundPer +
        "}";
    }
}
