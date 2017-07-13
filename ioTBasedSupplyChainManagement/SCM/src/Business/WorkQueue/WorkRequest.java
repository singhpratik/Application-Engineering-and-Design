/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount warehouseUserName;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Product product;
    private int productQuantity;
    private String warehouseUpdate;
    private String shipmentNumber;
    private String transportUpdate;
    private String requestOrderDate;
    private String deliveryAddress;
    private int requestId;
    private int orderRequestStatus;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getWarehouseUpdate() {
        return warehouseUpdate;
    }

    public void setWarehouseUpdate(String warehouseUpdate) {
        this.warehouseUpdate = warehouseUpdate;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getTransportUpdate() {
        return transportUpdate;
    }

    public void setTransportUpdate(String transportUpdate) {
        this.transportUpdate = transportUpdate;
    }

    public UserAccount getWarehouseUserName() {
        return warehouseUserName;
    }

    public void setWarehouseUserName(UserAccount warehouseUserName) {
        this.warehouseUserName = warehouseUserName;
    }

    public String getRequestOrderDate() {
        return requestOrderDate;
    }

    public void setRequestOrderDate(String requestOrderDate) {
        this.requestOrderDate = requestOrderDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getOrderRequestStatus() {
        return orderRequestStatus;
    }

    public void setOrderRequestStatus(int orderRequestStatus) {
        this.orderRequestStatus = orderRequestStatus;
    }

    
        
    
    @Override
    public String toString()
    {
         return this.message;
    }
    
    
}
