package cn.geekhall.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yiny
 * @since 2022-02-10
 */
@TableName("t_nation")
@ApiModel(value = "Nation对象", description = "")
public class Nation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("民族id")
    private Integer id;

    @ApiModelProperty("民族名称")
    private String name;

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

    @Override
    public String toString() {
        return "Nation{" +
            "id=" + id +
            ", name=" + name +
        "}";
    }
}
