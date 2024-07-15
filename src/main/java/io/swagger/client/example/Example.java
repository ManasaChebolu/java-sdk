package io.swagger.client.example;

import io.swagger.client.ApiException;
import io.swagger.client.Pair;
import io.swagger.client.api.login.LoginApi;
import io.swagger.client.api.order.OrderControllerApi;
import io.swagger.client.api.portfolio.PositionControllerApi;
import io.swagger.client.api.portfolio.TradeBookApi;
import io.swagger.client.constants.Constants;
import io.swagger.client.model.login.LoginBody;
import io.swagger.client.model.login.LoginResponse;
import io.swagger.client.model.orders.*;
import io.swagger.client.model.portfolio.OrderTrailRequest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Example {
    private static final String CONFIG_FILE_PATH = "src/main/resources/application.properties";

    private static Constants constants = new Constants();
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Example(Constants constants) {
        Example.constants = constants;
    }

    public static Map<String, String> readProperties(String filePath) {
        Properties properties = new Properties();
        Map<String, String> propertyMap = new HashMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);

            // Iterate through each property and add it to the map
            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                propertyMap.put(key, value);
            }
        } catch (IOException e) {
            System.out.println("exception : " + e);
        }

        return propertyMap;
    }

    public void login(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        LoginBody body = new LoginBody();
        body.setPassword("Akshaya@12");
        body.setUserId("DBG101");
        body.setMobileNumber("7305989193");

        constants.setApiKey("vFP4PGYvD19qhJ67wR");

        LoginResponse loginResponse = defaultAPI.loginPost(body, properties, constants.apiKey);

        System.out.println("response: " + loginResponse);
        String accessToken = loginResponse.getData().getAccessToken();

        constants.setAuthString(accessToken);

    }

    public void placeOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        PlaceOrderRequest body = new PlaceOrderRequest();

        body.setSymbol("NATIONALUM-EQ");
        body.setExcToken("6364");
        body.setOrdAction(PlaceOrderRequest.OrdActionEnum.BUY);
        body.setOrdValidity(PlaceOrderRequest.OrdValidityEnum.DAY);
        body.setOrdType(PlaceOrderRequest.OrdTypeEnum.LIMIT);
        body.setPrdType(PlaceOrderRequest.PrdTypeEnum.NRML);
        body.setQty(1);
        body.setTriggerPrice(0.0);
        body.setLimitPrice(192.55);
        body.setTriggerPrice(0.0);
        body.setDisQty(0);
        body.setInstrument(PlaceOrderRequest.InstrumentEnum.STK);
        body.setExc(PlaceOrderRequest.ExcEnum.NSE);
        body.setLotSize(0);
        body.setAmo(false);
        body.setBuild("MOB");
        body.setBoStpLoss(0);
        body.setBoTgtPrice(0);
        body.setTrailingSL(0.0);

        PlaceOrderResponse response = orderApi.placeOrder(body, properties, "DBG101", "WEB");

        setOrderId(response.getRespnseData().getOrdId());
    }

    public void brokerageChargeResponse(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        BrokerageChargeRequest requestBody = new BrokerageChargeRequest();
        requestBody.setSymbol("");
        requestBody.setExc(BrokerageChargeRequest.ExcEnum.NSE);
        requestBody.setProduct(BrokerageChargeRequest.ProductEnum.NRML);
        requestBody.setTriggerPrice("");
        requestBody.setPrice("3000");
        requestBody.setQty("100");
        requestBody.setInstrument(BrokerageChargeRequest.InstrumentEnum.STK);
        requestBody.setOrderAction(BrokerageChargeRequest.OrderActionEnum.BUY);
        requestBody.setExcToken("25");

        System.out.println("response: " + orderApi.brokerageCharges(requestBody, properties, "DBG101"));
    }

    public void getOrderBook(TradeBookApi tradeBookAPI, Map<String, String> properties) throws ApiException {
        System.out.println("response: " + tradeBookAPI.getOrderBook("DBG101", properties, "WEB"));
    }

    public void modifyOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        ModifyOrderRequest requestBody = new ModifyOrderRequest();
        requestBody.setTriggerPrice(0.0);
        requestBody.setOrdType(ModifyOrderRequest.OrdTypeEnum.LIMIT);
        requestBody.setPrdType(ModifyOrderRequest.PrdTypeEnum.NRML);
        requestBody.setInstrument(ModifyOrderRequest.InstrumentEnum.STK);
        requestBody.setExc(ModifyOrderRequest.ExcEnum.NSE);
        requestBody.setQty(5);
        requestBody.setLotSize(0);
        requestBody.setSymbol("NATIONALUM-EQ");
        requestBody.setOrdId(getOrderId());
        requestBody.setOrdAction(ModifyOrderRequest.OrdActionEnum.BUY);
        requestBody.limitPrice(192.55);
        requestBody.setDisQty(0);
        requestBody.setOrdValidity(ModifyOrderRequest.OrdValidityEnum.DAY);
        requestBody.setTradedQty(0);
        requestBody.setOrdValidityDays(0);
        requestBody.setExchangeToken("6364");
        requestBody.setAmo(false);
        System.out.println("response: " + orderApi.modifyOrder(requestBody, properties, "DBG101", "WEB"));
    }

    public void cancelOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        CancelOrderRequest requestBody = new CancelOrderRequest();
        System.out.println("order id: " + getOrderId());
        requestBody.setSymbol("NATIONALUM-EQ");
        requestBody.setOrdId(getOrderId());
        requestBody.setExc(CancelOrderRequest.ExcEnum.NSE);

        System.out.println("response: " + orderApi.cancelOrder(requestBody, properties, "DBG101", "WEB"));
    }

    public void getTradeBook(TradeBookApi tradeBookApi, Map<String, String> properties) throws ApiException {
        System.out.println("trade book");
        tradeBookApi.tradeBook("DBG101", properties, "WEB");
    }

    public void getPositionBook(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        List<Pair> query = new ArrayList<>();
        query.add(new Pair("type", "net"));
        System.out.println("response: " + positionControllerApi.getPositionBook(query, "", properties, "WEB"));
    }

    public static void main(String[] args) throws ApiException {
        System.out.println("started");
        Map<String, String> properties = readProperties(CONFIG_FILE_PATH);

        System.out.println("logging in");
        Example obj = new Example(constants);

        LoginApi loginApi = new LoginApi(constants);
        OrderControllerApi orderApi = new OrderControllerApi(constants);
        TradeBookApi tradeBookApi = new TradeBookApi(constants);
        PositionControllerApi positionControllerApi = new PositionControllerApi(constants);
        System.out.println("object created");

        // login
        obj.login(loginApi, properties);

        // brokerage charges
        obj.brokerageChargeResponse(orderApi, properties);

        // place order
        obj.placeOrder(orderApi, properties);

        // modify Order
        obj.modifyOrder(orderApi, properties);

        // order book
        obj.getOrderBook(tradeBookApi, properties);

        // trade book
        obj.getTradeBook(tradeBookApi, properties);

        // cancel order
        obj.cancelOrder(orderApi, properties);

        // todo exit orders

        // todo convert position

        // todo holdings

        // position book
        obj.getPositionBook(positionControllerApi, properties);
    }
}
