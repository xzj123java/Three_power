package com.xa.UserInfo.controller;

import com.xa.UserInfo.service.UserServic;
import com.xa.UserInfo.vo.UserInfoVo;
/*import io.swagger.annotations.ApiOperation;*/
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@RestController
public class RestFulController {

    //PathVariable传值方式如下:"user_name": user_name, "user_pas": user_pas
    @RequestMapping("/call/{user_name}-{user_pas}")
    public String call(@PathVariable("user_name") String user_name, @PathVariable("user_pas") String user_pas) {
        return user_name + "：" + user_pas;
    }


    @RequestMapping("/getCookieValue")
    public String getCookieValue(@CookieValue(value = "name", required = false) String name,
                                 @CookieValue(value = "age", required = false) Integer age) {
        return name + "今年" + age;
    }

    /*上传文件*/
    @RequestMapping(value = "fileUpload", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long startTime = System.currentTimeMillis();//记录前置时间
        System.out.println("fileName：" + file.getOriginalFilename());//拿到文件
        String path = "D:/" + new Date().getTime() + file.getOriginalFilename();//文件另存目的地+新生成名字
        File newFile = new File(path);
        file.transferTo(newFile);//把原有的内容转移到新文件
        long endTime = System.currentTimeMillis();//记录结束时间
        System.out.println("运行时间：" + String.valueOf(endTime - startTime) + "ms");//记录运行时间
        return "upload success";
    }

    @RequestMapping("/testDownload")
    public ResponseEntity<byte[]> download() throws IOException {
        //创建文件
        File file = new File("D://1551696187517中文乱码.txt");
        byte[] body = null;
        //创建输入流(从硬盘读取数据)
        InputStream is = new FileInputStream(file);
        //创建字节数组并指定长度
        body = new byte[is.available()];
        //将数据从输入流导到输出流
        is.read(body);
        //创建请求头并设置指定值
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        //设置HTTP响应状态。
        HttpStatus statusCode = HttpStatus.OK;
        //创建响应实体对象
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);//io流 ，请求头 相应码
        return entity;
    }


    /* @RequestMapping(value = "doRegister", method = RequestMethod.POST)
        public String doRegister(@Valid @RequestBody
                                         UserInfoVo userInfoVo, BindingResult result, ModelMap map) {

            // 如果入参有问题，返回注册页面
            if (result.hasErrors()) {
             List<FieldError> errorList = result.getFieldErrors();
             for (FieldError error : errorList) {
                 System.out.println(error.getCode()+":"+ error.getObjectName());
                 map.put(error.getCode(),error.getObjectName());
             }
         }
            return map.toString();
        }*/
    @ApiOperation(value = "注册", notes = "post请求。")
    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String doRegister(@Valid @RequestBody UserInfoVo userInfoVo, BindingResult result, ModelMap map) {
        // 如果入参有问题，返回注册页面
        if (result.hasErrors()) {
            List<FieldError> errorList = result.getFieldErrors();
            for (FieldError error : errorList) {
                System.out.println(error.getField() + "*" + error.getDefaultMessage());
                map.put("ERR_" + error.getField(), error.getDefaultMessage());
            }
            return "1";
        }

        return "2";
    }

    @ApiOperation(value = "获得所有的学生对象list", notes = "get请求，查询所有的学生。")
    @RequestMapping(value = "/getAllUserInfo", method = RequestMethod.GET)
    public String getAllUserInfo() {
        return "login";
    }

    @ApiOperation(value = "传集合", notes = "post请求，传集合。")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_name", value = "姓名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "user_pas", value = "密码", required = true, dataType = "String")
    })
    @RequestMapping("userLong")
    public String userlong(@RequestParam String user_name, @RequestParam String user_pas) {
        if (user_name.equals("xzj") && user_pas.equals("xzj")) {
            return "index";
        } else {
            return "login";
        }
    }
}