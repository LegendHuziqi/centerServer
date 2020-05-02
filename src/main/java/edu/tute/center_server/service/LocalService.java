package edu.tute.center_server.service;

import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.devRequest.CreateServiceRequest;
import org.springframework.stereotype.Service;

@Service
public interface LocalService {
    ResponseMsg getClusterInfo();
}
