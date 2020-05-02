package edu.tute.center_server.pojo.slaveRequest;

public class JoinClusterRequest {
    private String nodeName;
    private String nodeLocation;
    private int nodeAbility;
    private int nodeCPUCore;
    private int nodeCPUFrequency;
    private String nodeRAM;
    private String nodeDisk;
    private String ip;
    private int runServiceMaxAmount;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeLocation() {
        return nodeLocation;
    }

    public void setNodeLocation(String nodeLocation) {
        this.nodeLocation = nodeLocation;
    }

    public int getNodeAbility() {
        return nodeAbility;
    }

    public void setNodeAbility(int nodeAbility) {
        this.nodeAbility = nodeAbility;
    }

    public int getNodeCPUCore() {
        return nodeCPUCore;
    }

    public void setNodeCPUCore(int nodeCPUCore) {
        this.nodeCPUCore = nodeCPUCore;
    }

    public int getNodeCPUFrequency() {
        return nodeCPUFrequency;
    }

    public void setNodeCPUFrequency(int nodeCPUFrequency) {
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

    public int getRunServiceMaxAmount() {
        return runServiceMaxAmount;
    }

    public void setRunServiceMaxAmount(int runServiceMaxAmount) {
        this.runServiceMaxAmount = runServiceMaxAmount;
    }
}
