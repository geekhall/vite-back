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
@TableName("t_mail_log")
@ApiModel(value = "MailLog对象", description = "")
public class MailLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("消息id")
    private String msgId;

    @ApiModelProperty("接收员工id")
    private Integer eId;

    @ApiModelProperty("状态(0:消息投递中1:投递成功2:投递失败)")
    private Integer status;

    @ApiModelProperty("路由键")
    private String routeKey;

    @ApiModelProperty("交换机")
    private String exchange;

    @ApiModelProperty("重试次数")
    private Integer count;

    @ApiModelProperty("重试时间")
    private LocalDateTime tryTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public LocalDateTime getTryTime() {
        return tryTime;
    }

    public void setTryTime(LocalDateTime tryTime) {
        this.tryTime = tryTime;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MailLog{" +
            "msgId=" + msgId +
            ", eId=" + eId +
            ", status=" + status +
            ", routeKey=" + routeKey +
            ", exchange=" + exchange +
            ", count=" + count +
            ", tryTime=" + tryTime +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
