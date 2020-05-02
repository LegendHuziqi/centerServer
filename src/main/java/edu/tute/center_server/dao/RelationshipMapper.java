package edu.tute.center_server.dao;

import edu.tute.center_server.Bean.Node;
import edu.tute.center_server.Bean.Relationship;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RelationshipMapper {
    //写入node表
    Integer putRelationship(@Param("serviceId") String serviceId, @Param("nodeIp") String nodeIp, @Param("nodeId") String nodeId);

    //根据serviceId查找服务部署在了哪些节点
    List<Relationship> findInfobyServiceId(@Param("serviceId") String serviceId);
}
