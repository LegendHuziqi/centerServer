package edu.tute.center_server.dao;

import edu.tute.center_server.Bean.Service;
import edu.tute.center_server.pojo.devRequest.CreateServiceRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ServiceMapper {
    //写入service表
    Integer putService(CreateServiceRequest createServiceRequest);

    //根据name和updater查serviceId
    Integer getId(@Param("serviceName") String serviceName,@Param("serviceUpdater") String serviceUpdater);

    Integer delService(@Param("serviceId") String serviceId);

    List<Service> listUserService(@Param("userId") String userId);
}
