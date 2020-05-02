package edu.tute.center_server.Bean;

import org.springframework.context.annotation.Bean;


public class Node {
    private String nodeId;
    private String nodeName;
    private String nodeLocation;
    private String nodeAbility;
    private String nodeCPUCore;
    private String nodeCPUFrequency;
    private String nodeRAM;
    private String nodeDisk;
    private String ip;
    private String runService;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeLocation() {
        return nodeLocation;
    }

    public void setNodeLocation(String nodeLocation) {
        this.nodeLocation = nodeLocation;
    }

    public String getNodeAbility() {
        return nodeAbility;
    }

    public void setNodeAbility(String nodeAbility) {
        this.nodeAbility = nodeAbility;
    }

    public String getNodeCPUCore() {
        return nodeCPUCore;
    }

    public void setNodeCPUCore(String nodeCPUCore) {
        this.nodeCPUCore = nodeCPUCore;
    }

    public String getNodeCPUFrequency() {
        return nodeCPUFrequency;
    }

    public void setNodeCPUFrequency(String nodeCPUFrequency) {
        this.nodeCPUFrequency = nodeCPUFrequency;
    }

    public String getNodeRAM() {
        return nodeRAM;
    }

    public void setNodeRAM(String nodeRAM) {
        this.nodeRAM = nodeRAM;
    }

    public String getNodeDisk() {
        return nodeDisk;
    }

    public void setNodeDisk(String nodeDisk) {
        this.nodeDisk = nodeDisk;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRunService() {
        return runService;
    }

    public void setRunService(String runService) {
        this.runService = runService;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
}
