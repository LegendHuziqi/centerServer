package edu.tute.center_server.controller;


import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.ServiceId;
import edu.tute.center_server.pojo.UserId;
import edu.tute.center_server.pojo.devRequest.*;
import edu.tute.center_server.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
public class DevController {
    @Autowired
    DevService devService;
    //创建服务
    @PostMapping("/createService")
    public ResponseMsg createService(@RequestBody CreateServiceRequest createServiceRequest){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = devService.createService(createServiceRequest);
        return responseMsg;
    }

    @PostMapping("/login")
    public ResponseMsg login(@RequestBody LoginRequest loginRequest){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = devService.login(loginRequest);
        return responseMsg;
    }

    @PostMapping("/register")
    public ResponseMsg register(@RequestBody LoginRequest loginRequest){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = devService.register(loginRequest);
        return responseMsg;
    }

    @PostMapping("/deleteService")
    public ResponseMsg deleteService(@RequestBody DeleteServiceRequest deleteServiceRequest){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = devService.deleteService(deleteServiceRequest);
        return responseMsg;
    }

    @PostMapping("/listUserService")
    public ResponseMsg listUserService(@RequestBody UserId userId){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = devService.listUserService(userId);
        return responseMsg;
    }

    @PostMapping("/listServiceNode")
    public ResponseMsg listServiceNode(@RequestBody ServiceId serviceId){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = devService.listServiceNode(serviceId);
        return responseMsg;
    }

    @PostMapping("/takePlaceaNode")
    public ResponseMsg takePlaceaNode(@RequestBody TakePlaceRequest takePlaceRequest){
        ResponseMsg responseMsg = new ResponseMsg();
//        responseMsg = devService.listServiceNode(serviceId);
        return responseMsg;
    }

    @RequestMapping("fileUpload")
    public String  fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        System.out.println("fileName："+file.getOriginalFilename());
        String path="E:/"+System.currentTimeMillis()+file.getOriginalFilename();

        File newFile=new File(path);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(newFile);
        return "/success";
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
    }
}
