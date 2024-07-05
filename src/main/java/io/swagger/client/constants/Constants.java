package io.swagger.client.constants;

import io.swagger.client.interfaces.ConstantsInterface;

import java.util.HashMap;
import java.util.Map;

public class Constants implements ConstantsInterface {
    public Map<String, String> headers = new HashMap<>();
    public String apiKey = "";
    public Map<String, String> getHeaders() {
        if (!getApiKey().isEmpty() && !getAuthString().isEmpty()) {
            this.headers.put("api-key", getApiKey());
            this.headers.put("Authorization", "Bearer " + getAuthString());
        }
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> endPoints = new HashMap<>();
    public Map<String, String> getEndPoints() {
        return endPoints;
    }

    public String authString = "";

    public String getAuthString() {
        return authString;
    }

    public void setAuthString(String authString) {
        this.authString = authString;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public Constants() {
        // End Points
        this.endPoints.put("exitOrder", "/orderApi/v1/exit-order");

        this.endPoints.put("convertPosition", "/detailsApi/portfolio/v1/convert-positions");
        this.endPoints.put("doHoldings", "/detailsApi/portfolio/v1/holdings");


        // done
        this.endPoints.put("login", "/auth-services/api/auth/v1/login");

        this.endPoints.put("placeOrder", "/wrapper-order-service/api/order/v1/place-order");
        this.endPoints.put("modifyOrder", "/wrapper-order-service/api/order/v1/modify-order");
        this.endPoints.put("brokerageCharges", "/wrapper-details-service/api/trade/v1/brokerage");
        this.endPoints.put("cancelOrder", "/wrapper-order-service/api/order/v1/cancel-order");

        this.endPoints.put("orderBook", "/wrapper-details-service/api/order/v1/order-book");
        this.endPoints.put("tradeBook", "/wrapper-details-service/api/order/v1/trade-book");
        this.endPoints.put("positionBook", "/wrapper-details-service/api/portfolio/v1/position-book?type=");
    }
}
