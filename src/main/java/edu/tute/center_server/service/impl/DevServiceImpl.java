package edu.tute.center_server.service.impl;

import com.alibaba.fastjson.JSONObject;
import edu.tute.center_server.Bean.Relationship;
import edu.tute.center_server.Bean.Service;
import edu.tute.center_server.Bean.User;
import edu.tute.center_server.dao.RelationshipMapper;
import edu.tute.center_server.dao.ServiceMapper;
import edu.tute.center_server.dao.UserMapper;
import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.ServiceId;
import edu.tute.center_server.pojo.UserId;
import edu.tute.center_server.pojo.devRequest.CreateServiceRequest;
import edu.tute.center_server.pojo.devRequest.DeleteServiceRequest;
import edu.tute.center_server.pojo.devRequest.LoginRequest;
import edu.tute.center_server.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class DevServiceImpl implements DevService {
    @Autowired
    ServiceMapper serviceMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    RelationshipMapper relationshipMapper;

    @Override
    public ResponseMsg createService(CreateServiceRequest createServiceRequest) {
        ResponseMsg responseMsg = new ResponseMsg();
        try {
            serviceMapper.putService(createServiceRequest);
        } catch (Exception e) {
            responseMsg.setStatusCode(1);
            responseMsg.setMsg("写入数据库错误");
            return responseMsg;
        }
        responseMsg.setStatusCode(0);
        responseMsg.setMsg("创建服务成功");
        responseMsg.setData(createServiceRequest.getServiceId());
        File serviceDir = new File(System.getProperty("user.home") + "/serverless/" + createServiceRequest.getServiceId());
        if (!serviceDir.exists()) {
            serviceDir.mkdir();
        }
        return responseMsg;
    }

    @Override
    public ResponseMsg deleteService(DeleteServiceRequest deleteServiceRequest) {
        ResponseMsg responseMsg = new ResponseMsg();
        Integer res = serviceMapper.delService(deleteServiceRequest.getServiceId());
        if (res != 1) {
            responseMsg.setStatusCode(1);
            responseMsg.setMsg("删除服务失败");
        } else {
            responseMsg.setStatusCode(0);
            responseMsg.setMsg("删除服务成功");
            responseMsg.setData(res);
        }
        return responseMsg;
    }

    @Override
    public ResponseMsg listUserService(UserId userId) {
        ResponseMsg responseMsg = new ResponseMsg();
        List<Service> result = serviceMapper.listUserService(userId.getUserId());
        responseMsg.setStatusCode(0);
        responseMsg.setData(JSONObject.toJSONString(result));
        return responseMsg;
    }

    @Override
    public ResponseMsg listServiceNode(ServiceId serviceId) {
        ResponseMsg responseMsg = new ResponseMsg();
        List<Relationship> result = relationshipMapper.findInfobyServiceId(serviceId.getServiceId());
        responseMsg.setStatusCode(0);
        responseMsg.setData(JSONObject.toJSONString(result));
        return responseMsg;
    }

    @Override
    public ResponseMsg login(LoginRequest loginRequest) {
        ResponseMsg responseMsg = new ResponseMsg();
        User res = userMapper.getUser(loginRequest.getUserName(), loginRequest.getPassword());
        if (res != null) {
            responseMsg.setStatusCode(0);
            responseMsg.setMsg("登录成功");
            responseMsg.setData(JSONObject.toJSONString(res));
        } else {
            responseMsg.setStatusCode(1);
            responseMsg.setMsg("登录失败");
        }
        return responseMsg;
    }

    @Override
    public ResponseMsg register(LoginRequest registerRequest) {
        ResponseMsg responseMsg = new ResponseMsg();
        try {
            Integer res = userMapper.putUser(registerRequest.getUserName(), registerRequest.getPassword());
        } catch (Exception e) {
            if (e.getCause().toString().contains("Duplicate")) {
                responseMsg.setStatusCode(1);
                responseMsg.setMsg("用户名已注册,请联系管理员");
                return responseMsg;
            } else {
                responseMsg.setStatusCode(1);
                responseMsg.setMsg("数据库写入错误");
                return responseMsg;
            }
        }
        responseMsg.setStatusCode(0);
        responseMsg.setMsg("注册成功");
        return responseMsg;
    }
}
