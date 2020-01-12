package cn.kgc.tangcco.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: swagger
 * @description: TODO
 * @author: cuihao
 * @create: 2020-01-12 20:20
 * @version: V1.0
 **/
@Data
@ApiModel(description = "这是返回的对象")
public class Result {
    @ApiModelProperty(value = "这是状态码")
    private int code;
    @ApiModelProperty(value = "提示信息")
    private String message;
    @ApiModelProperty(value = "数据")
    private String data;

}
