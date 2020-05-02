package edu.tute.center_server.service;

import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.UserId;
import edu.tute.center_server.pojo.devRequest.CreateServiceRequest;
import edu.tute.center_server.pojo.devRequest.DeleteServiceRequest;
import edu.tute.center_server.pojo.devRequest.LoginRequest;
import edu.tute.center_server.pojo.ServiceId;
import org.springframework.stereotype.Service;

@Service
public interface DevService {
    ResponseMsg createService(CreateServiceRequest createServiceRequest);
    ResponseMsg login(LoginRequest loginRequest);
    ResponseMsg register(LoginRequest registerRequest);
    ResponseMsg deleteService(DeleteServiceRequest deleteServiceRequest);
    ResponseMsg listUserService(UserId userId);
    ResponseMsg listServiceNode(ServiceId serviceId);
}
