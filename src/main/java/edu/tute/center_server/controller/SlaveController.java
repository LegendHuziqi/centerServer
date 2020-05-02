package edu.tute.center_server.controller;


import com.alibaba.fastjson.JSONObject;
import edu.tute.center_server.Bean.Node;
import edu.tute.center_server.pojo.ResponseMsg;

import edu.tute.center_server.pojo.slaveRequest.JoinClusterRequest;
import edu.tute.center_server.pojo.slaveRequest.QuitClusterRequest;
import edu.tute.center_server.service.SlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlaveController {
    @Autowired
    SlaveService slaveService;
    //申请加入集群
    @PostMapping("/joinCluster")
    public ResponseMsg joinCluster(@RequestBody JoinClusterRequest joinClusterRequest){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = slaveService.joinCluster(joinClusterRequest);
        return responseMsg;
    }

    @PostMapping("/quitCluster")
    public ResponseMsg quitCluster(@RequestBody QuitClusterRequest quitClusterRequest){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = slaveService.quitCluster(quitClusterRequest);
        return responseMsg;
    }


}
