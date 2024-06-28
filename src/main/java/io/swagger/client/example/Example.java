package io.swagger.client.example;

import io.swagger.client.ApiException;
import io.swagger.client.api.login.LoginApi;
import io.swagger.client.api.order.OrderControllerApi;
import io.swagger.client.api.portfolio.TradeBookApi;
import io.swagger.client.constants.Constants;
import io.swagger.client.model.login.LoginBody;
import io.swagger.client.model.login.LoginResponse;
import io.swagger.client.model.orders.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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

        LoginResponse loginResponse = defaultAPI.loginPost(body, properties);
        String accessToken = loginResponse.getData().getAccessToken();

        //todo need to add api_key in header here.
        constants.setAuthString(accessToken);
    }

    public void placeOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        PlaceOrderRequest body = new PlaceOrderRequest();

        body.setSymbol("HDFCBANK-EQ");
        body.setExcToken("1333");
        body.setOrdAction(PlaceOrderRequest.OrdActionEnum.BUY);
        body.setOrdValidity(PlaceOrderRequest.OrdValidityEnum.DAY);
        body.setOrdType(PlaceOrderRequest.OrdTypeEnum.LIMIT);
        body.setPrdType(PlaceOrderRequest.PrdTypeEnum.NRML);
        body.setQty(1);
        body.setTriggerPrice(0.0);
        body.setLimitPrice(1712.05);
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

        orderApi.brokerageCharges(requestBody, properties, "DBG101");
    }

    public void getOrderBook(TradeBookApi tradeBookAPI, Map<String, String> properties) throws ApiException {
        tradeBookAPI.getOrderBook("DBG101", properties, "WEB");
    }

    public void modifyOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        ModifyOrderRequest requestBody = new ModifyOrderRequest();
        requestBody.setTriggerPrice(0.0);
        requestBody.setOrdType(ModifyOrderRequest.OrdTypeEnum.LIMIT);
        requestBody.setPrdType(ModifyOrderRequest.PrdTypeEnum.CASH);
        requestBody.setInstrument(ModifyOrderRequest.InstrumentEnum.STK);
        requestBody.setExc(ModifyOrderRequest.ExcEnum.NSE);
        requestBody.setQty(5);
        requestBody.setLotSize(0);
        requestBody.setSymbol("HDFCBANK-EQ");
        requestBody.setOrdId(getOrderId());
        requestBody.setOrdAction(ModifyOrderRequest.OrdActionEnum.BUY);
        requestBody.limitPrice(0.0);
        requestBody.setDisQty(0);
        requestBody.setOrdValidity(ModifyOrderRequest.OrdValidityEnum.DAY);
        requestBody.setTradedQty(0);
        requestBody.setOrdValidityDays(0);
        requestBody.setExchangeToken("1333");
        requestBody.setAmo(false);
        orderApi.modifyOrder(requestBody, properties, "DBG101", "WEB");
    }

    public void cancelOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        CancelOrderRequest requestBody = new CancelOrderRequest();
        requestBody.setSymbol("HDFCBANK-EQ");
        requestBody.setOrdId(getOrderId());
        requestBody.setExc(CancelOrderRequest.ExcEnum.NSE);

        orderApi.cancelOrder(requestBody, properties, "DBG101", "WEB");
    }

    public void getTradeBook(TradeBookApi tradeBookApi, Map<String, String> properties) {
        tradeBookApi.tradeBook("DBG101", properties, "WEB");
    }

    public static void main(String[] args) throws ApiException {
        System.out.println("started");
        Map<String, String> properties = readProperties(CONFIG_FILE_PATH);

        System.out.println("logging in");
        Example obj = new Example(constants);

        LoginApi loginApi = new LoginApi(constants);
        OrderControllerApi orderApi = new OrderControllerApi(constants);
        TradeBookApi tradeBookApi = new TradeBookApi(constants);
        System.out.println("object created");

        // login
        obj.login(loginApi, properties);

        // order book
        obj.getOrderBook(tradeBookApi, properties);

        // place order
        obj.placeOrder(orderApi, properties);

        // modify Order
        obj.modifyOrder(orderApi, properties);

        // brokerage charges
        obj.brokerageChargeResponse(orderApi, properties);

        // cancel order
        obj.cancelOrder(orderApi, properties);

        // todo exit orders


        // trade book

    }
}
