package edu.tute.center_server.controller;


import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.devRequest.CreateServiceRequest;
import edu.tute.center_server.service.DevService;
import edu.tute.center_server.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {
    @Autowired
    LocalService localService;
    //申请加入集群
    @PostMapping("/getClusterInfo")
    public ResponseMsg getClusterInfo(){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = localService.getClusterInfo();
        return responseMsg;
    }



}
