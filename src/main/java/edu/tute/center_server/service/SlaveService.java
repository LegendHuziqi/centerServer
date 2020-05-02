package edu.tute.center_server.service;

import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.devRequest.CreateServiceRequest;
import edu.tute.center_server.pojo.slaveRequest.JoinClusterRequest;
import edu.tute.center_server.pojo.slaveRequest.QuitClusterRequest;
import org.springframework.stereotype.Service;

import java.util.jar.JarEntry;

@Service
public interface SlaveService {
    ResponseMsg joinCluster(JoinClusterRequest joinClusterRequest);
    ResponseMsg quitCluster(QuitClusterRequest quitClusterRequest);
}
