package edu.tute.center_server.pojo.devRequest;

public class CreateServiceRequest {
    private String serviceId;
    private String serviceName;
    private String serviceUpdater;
    private String serviceDate;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceUpdater() {
        return serviceUpdater;
    }

    public void setServiceUpdater(String serviceUpdater) {
        this.serviceUpdater = serviceUpdater;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
