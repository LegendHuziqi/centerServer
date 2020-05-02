package edu.tute.center_server.pojo.devRequest;

public class TakePlaceRequest {
    private String serviceId;
    private String pastNode;
    private String newNode;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getPastNode() {
        return pastNode;
    }

    public void setPastNode(String pastNode) {
        this.pastNode = pastNode;
    }

    public String getNewNode() {
        return newNode;
    }

    public void setNewNode(String newNode) {
        this.newNode = newNode;
    }
}
