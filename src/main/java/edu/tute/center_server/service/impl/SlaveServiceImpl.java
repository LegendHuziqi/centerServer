package edu.tute.center_server.service.impl;

import edu.tute.center_server.dao.NodeMapper;
import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.devRequest.CreateServiceRequest;
import edu.tute.center_server.pojo.slaveRequest.JoinClusterRequest;
import edu.tute.center_server.pojo.slaveRequest.QuitClusterRequest;
import edu.tute.center_server.service.SlaveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SlaveServiceImpl implements SlaveService {
    @Autowired
    NodeMapper nodeMapper;

    @Override
    public ResponseMsg joinCluster(JoinClusterRequest joinClusterRequest) {
        ResponseMsg responseMsg = new ResponseMsg();
        Integer res = nodeMapper.putNode(joinClusterRequest.getNodeName(),joinClusterRequest.getNodeLocation(),String.valueOf(joinClusterRequest.getNodeAbility()),String.valueOf(joinClusterRequest.getNodeCPUCore()),String.valueOf(joinClusterRequest.getNodeCPUFrequency()),joinClusterRequest.getNodeRAM(),joinClusterRequest.getNodeDisk(),joinClusterRequest.getIp(),String.valueOf(joinClusterRequest.getRunServiceMaxAmount()));
        if(res != 1){
            responseMsg.setStatusCode(1);
            responseMsg.setMsg("写入数据库错误");
        }else {
            Integer id = nodeMapper.findIdbyName(joinClusterRequest.getNodeName());
            responseMsg.setStatusCode(0);
            responseMsg.setMsg("加入集群成功");
            responseMsg.setData(id);
        }
        return responseMsg;
    }

    @Override
    public ResponseMsg quitCluster(QuitClusterRequest quitClusterRequest) {
        ResponseMsg responseMsg = new ResponseMsg();
        System.out.println(quitClusterRequest.getId());
        Boolean res = nodeMapper.delNode(String.valueOf(quitClusterRequest.getId()));
        if(res){
            responseMsg.setStatusCode(0);
            responseMsg.setMsg("退出集群成功");
        }else{
            responseMsg.setStatusCode(1);
            responseMsg.setMsg("写入数据库错误");
        }
        return responseMsg;
    }
}
