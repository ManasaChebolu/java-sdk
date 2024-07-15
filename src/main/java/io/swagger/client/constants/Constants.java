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
        this.endPoints.put("exitOrder", "/wrapper-order-service/api/order/v1/exit-order");
        this.endPoints.put("convertPosition", "/wrapper-order-service/api/portfolio/v1/convert-positions");
        this.endPoints.put("doHoldings", "/wrapper-details-service/api/portfolio/v1/holdings");

        this.endPoints.put("historicalData", "/wrapper-details-service/api/chart/v1/historical-candle-data");
        this.endPoints.put("intradayData", "/wrapper-details-service/api/chart/v1/intraday-candle-data");
        this.endPoints.put("sparkline", "/wrapper-details-service/api/quote/v1/get-ohlc");
        this.endPoints.put("funds", "/wrapper-details-service/api/funds/v1/get-funds");
        this.endPoints.put("getProfile", "/wrapper-details-service/api/user/v1/get-profile");
        this.endPoints.put("quotes", "/wrapper-details-service/api/market/v1/quote");
        this.endPoints.put("profitLoss", "/wrapper-details-service/api/trade/v1/profit-loss-report");

        this.endPoints.put("orderDetails", "/wrapper-details-service/api/order/v1/order-details");
        this.endPoints.put("orderHistory", "/wrapper-details-service/api/order/v1/order-history");
        this.endPoints.put("tradeDetails", "/wrapper-details-service/api/order/v1/trade-details");

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
