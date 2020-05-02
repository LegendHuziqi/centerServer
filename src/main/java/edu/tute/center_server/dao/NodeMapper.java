package edu.tute.center_server.dao;

import edu.tute.center_server.Bean.Node;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NodeMapper {
    //写入node表
    Integer putNode(@Param("nodeName") String nodeName, @Param("nodeLocation") String nodeLocation, @Param("nodeAbility") String nodeAbility, @Param("nodeCPUCore") String nodeCPUCore, @Param("nodeCPUFrequency") String nodeCPUFrequency, @Param("nodeRAM") String nodeRAM, @Param("nodeDisk") String nodeDisk, @Param("ip") String ip, @Param("runService") String runService);

    //删除节点
    Boolean delNode(@Param("nodeId") String nodeId);

    //列出所有node
    List<Node> listNode();

    //find Id by Name
    Integer findIdbyName(@Param("nodeName") String nodeName);
}
