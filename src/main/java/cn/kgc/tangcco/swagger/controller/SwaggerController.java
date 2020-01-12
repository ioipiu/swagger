package cn.kgc.tangcco.swagger.controller;

import cn.kgc.tangcco.swagger.entity.Result;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: swagger
 * @description: TODO
 * @author: cuihao
 * @create: 2020-01-12 20:14
 * @version: V1.0
 **/
@Controller
@Api(tags = "这是XX的类")
public class SwaggerController {


    @PostMapping("/lianxi")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sid", value = "sid", dataType = "String"),
            @ApiImplicitParam(name = "pwd", value = "pwd", dataType = "String")

    })
    @ApiResponses({
            @ApiResponse(code = 2001, message = "登录成功"),
            @ApiResponse(code = 2002, message = "登录失败")
    })
    @ResponseBody
    @ApiOperation(value = "输入学号和密码，验证信息", notes = "对了就给学生数据，错了就返回字符串")
    public Result login(@RequestParam(value = "sid") String sid, @RequestParam(value = "pwd") String pwd) {
        return new Result();
    }
}
