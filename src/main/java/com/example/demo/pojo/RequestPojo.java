package com.example.demo.pojo;

import com.example.demo.enums.RequestStatus;

import java.sql.Timestamp;

public class RequestPojo {

    private int reqID;
    private int empID;
    private String description;
    private double cost ;
    private Timestamp purchaseDate ;
    private String requestDate ;
    private RequestStatus status ;
    private String receiptPic;


    public RequestPojo(int reqID, int empID, String description, double cost, Timestamp purchaseDate, String requestDate, RequestStatus status, String receiptPic) {
        super();
        this.reqID = reqID;
        this.empID = empID;
        this.description = description;
        this.cost = cost;
        this.purchaseDate = purchaseDate;
        this.requestDate = requestDate;
        this.status = status;
        this.receiptPic = receiptPic;
    }


    public int getReqID() {
        return reqID;
    }

    public void setReqID(int reqID) {
        this.reqID = reqID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public String getReceiptPic() {
        return receiptPic;
    }

    public void setReceiptPic(String receiptPic) {
        this.receiptPic = receiptPic;
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "reqID=" + reqID +
                ", empID=" + empID +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", requestDate='" + requestDate + '\'' +
                ", status='" + status + '\'' +
                ", receiptPic='" + receiptPic + '\'' +
                '}';
    }

}
