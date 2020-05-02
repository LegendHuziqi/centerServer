package edu.tute.center_server.service.impl;

import com.alibaba.fastjson.JSONObject;
import edu.tute.center_server.Bean.Node;
import edu.tute.center_server.dao.NodeMapper;
import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.slaveRequest.JoinClusterRequest;
import edu.tute.center_server.service.LocalService;
import edu.tute.center_server.service.SlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocalServiceImpl implements LocalService {
    @Autowired
    NodeMapper nodeMapper;

    @Override
    public ResponseMsg getClusterInfo() {
        ResponseMsg responseMsg = new ResponseMsg();
        List<Node> nodeList = nodeMapper.listNode();
        ArrayList<JSONObject> result = new ArrayList<>();
        JSONObject jsonObject = new JSONObject();
        for (Node node : nodeList){
            JSONObject singleNode = new JSONObject();
            singleNode.put("id",node.getNodeId());
            singleNode.put("name",node.getNodeName());
            singleNode.put("location",node.getNodeLocation());
            singleNode.put("ability",node.getNodeAbility());
            singleNode.put("core",node.getNodeCPUCore());
            singleNode.put("freq",node.getNodeCPUFrequency());
            singleNode.put("ram",node.getNodeRAM());
            singleNode.put("disk",node.getNodeDisk());
            singleNode.put("ip",node.getIp());
            singleNode.put("service",node.getRunService());
            result.add(singleNode);
        }
        responseMsg.setStatusCode(0);
        responseMsg.setMsg("获取集群信息成功");
        responseMsg.setData(result);
        return responseMsg;
    }
}
