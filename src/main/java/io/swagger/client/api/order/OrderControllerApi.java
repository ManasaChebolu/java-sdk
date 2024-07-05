package io.swagger.client.api.order;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.constants.Constants;
import io.swagger.client.model.orders.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderControllerApi {
    private ApiClient apiClient;
    private final Constants constants;

    public OrderControllerApi(Constants constants) {
        this(Configuration.getDefaultApiClient(), constants);
    }

    public OrderControllerApi(ApiClient apiClient, Constants constants) {
        this.apiClient = apiClient;
        this.constants = constants;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for brokerageCharges
     *
     * @param body                    (required)
     * @param userId                  (required)
     * @param source                  (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call brokerageChargesCall(BrokerageChargeRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("brokerageCharges");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (userId != null)
            localVarHeaderParams.put("user-id", apiClient.parameterToString(userId));
        if (source != null)
            localVarHeaderParams.put("source", apiClient.parameterToString(source));

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        localVarHeaderParams.putAll(constants.getHeaders());

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call brokerageChargesValidateBeforeCall(BrokerageChargeRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling brokerageCharges(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling brokerageCharges(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling brokerageCharges(Async)");
        }

        return brokerageChargesCall(body, propertiesMap, userId, source, progressListener, progressRequestListener);
    }

    /**
     * Brokerage Charges
     * This endpoint allows users to get broker charges
     *
     * @param body   (required)
     * @param userId (required)
     * @return BrokerageChargeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BrokerageChargeResponse brokerageCharges(BrokerageChargeRequest body, Map<String, String> propertiesMap, String userId) throws ApiException {
        ApiResponse<BrokerageChargeResponse> resp = brokerageChargesWithHttpInfo(body, propertiesMap, userId, "WEB");
        return resp.getData();
    }

    /**
     * Brokerage Charges
     * This endpoint allows users to get broker charges
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;BrokerageChargeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BrokerageChargeResponse> brokerageChargesWithHttpInfo(BrokerageChargeRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        com.squareup.okhttp.Call call = brokerageChargesValidateBeforeCall(body, propertiesMap, userId, source, null, null);
        Type localVarReturnType = new TypeToken<BrokerageChargeResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for cancelOrder
     *
     * @param body                    (required)
     * @param userId                  (required)
     * @param source                  (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelOrderCall(CancelOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("cancelOrder");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (userId != null)
            localVarHeaderParams.put("user-id", apiClient.parameterToString(userId));
        if (source != null)
            localVarHeaderParams.put("source", apiClient.parameterToString(source));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.putAll(constants.getHeaders());

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call cancelOrderValidateBeforeCall(CancelOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling cancelOrder(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling cancelOrder(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling cancelOrder(Async)");
        }

        return cancelOrderCall(body, propertiesMap, userId, source, progressListener, progressRequestListener);
    }

    /**
     * Cancel Order
     * This endpoint allows users to cancel a pending order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return CancelOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CancelOrderResponse cancelOrder(CancelOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        ApiResponse<CancelOrderResponse> resp = cancelOrderWithHttpInfo(body, propertiesMap, userId, source);
        return resp.getData();
    }

    /**
     * Cancel Order
     * This endpoint allows users to cancel a pending order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;CancelOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CancelOrderResponse> cancelOrderWithHttpInfo(CancelOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        com.squareup.okhttp.Call call = cancelOrderValidateBeforeCall(body, propertiesMap, userId, source, null, null);
        Type localVarReturnType = new TypeToken<CancelOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for exitOrder
     *
     * @param body                    (required)
     * @param userId                  (required)
     * @param source                  (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call exitOrderCall(ExitOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("exitOrder");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (userId != null)
            localVarHeaderParams.put("user-id", apiClient.parameterToString(userId));
        if (source != null)
            localVarHeaderParams.put("source", apiClient.parameterToString(source));

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call exitOrderValidateBeforeCall(ExitOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling exitOrder(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling exitOrder(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling exitOrder(Async)");
        }

        return exitOrderCall(body, propertiesMap, userId, source, progressListener, progressRequestListener);
    }

    /**
     * Exit an Order
     * This endpoint allow user to exit an order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ExitOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExitOrderResponse exitOrder(ExitOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        ApiResponse<ExitOrderResponse> resp = exitOrderWithHttpInfo(body, propertiesMap, userId, source);
        return resp.getData();
    }

    /**
     * Exit an Order
     * This endpoint allow user to exit an order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;ExitOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExitOrderResponse> exitOrderWithHttpInfo(ExitOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        com.squareup.okhttp.Call call = exitOrderValidateBeforeCall(body, propertiesMap, userId, source, null, null);
        Type localVarReturnType = new TypeToken<ExitOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for modifyOrder
     *
     * @param body                    (required)
     * @param userId                  (required)
     * @param source                  (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyOrderCall(ModifyOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("modifyOrder");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (userId != null)
            localVarHeaderParams.put("user-id", apiClient.parameterToString(userId));
        if (source != null)
            localVarHeaderParams.put("source", apiClient.parameterToString(source));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        localVarHeaderParams.putAll(constants.getHeaders());

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call modifyOrderValidateBeforeCall(ModifyOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling modifyOrder(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling modifyOrder(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling modifyOrder(Async)");
        }

        return modifyOrderCall(body, propertiesMap, userId, source, progressListener, progressRequestListener);
    }

    /**
     * Modify Order
     * This endpoint allows users to modify a pending order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ModifyOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModifyOrderResponse modifyOrder(ModifyOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        ApiResponse<ModifyOrderResponse> resp = modifyOrderWithHttpInfo(body, propertiesMap, userId, source);
        return resp.getData();
    }

    /**
     * Modify Order
     * This endpoint allows users to modify a pending order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;ModifyOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModifyOrderResponse> modifyOrderWithHttpInfo(ModifyOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        com.squareup.okhttp.Call call = modifyOrderValidateBeforeCall(body, propertiesMap, userId, source, null, null);
        Type localVarReturnType = new TypeToken<ModifyOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for placeOrder
     *
     * @param body                    (required)
     * @param userId                  (required)
     * @param source                  (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call placeOrderCall(PlaceOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("placeOrder");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        if (userId != null)
            localVarHeaderParams.put("user-id", apiClient.parameterToString(userId));
        if (source != null)
            localVarHeaderParams.put("source", apiClient.parameterToString(source));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }
        localVarHeaderParams.putAll(constants.getHeaders());

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call placeOrderValidateBeforeCall(PlaceOrderRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling placeOrder(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling placeOrder(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling placeOrder(Async)");
        }

        return placeOrderCall(body, propertiesMap, userId, source, progressListener, progressRequestListener);
    }

    /**
     * Place Order
     * This endpoint allow user to place an order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return PlaceOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaceOrderResponse placeOrder(PlaceOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        ApiResponse<PlaceOrderResponse> resp = placeOrderWithHttpInfo(body, propertiesMap, userId, source);
        System.out.println("resp: " + resp.getData());

        return resp.getData();
    }

    /**
     * Place Order
     * This endpoint allow user to place an order
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;PlaceOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaceOrderResponse> placeOrderWithHttpInfo(PlaceOrderRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        com.squareup.okhttp.Call call = placeOrderValidateBeforeCall(body, propertiesMap, userId, source, null, null);
        Type localVarReturnType = new TypeToken<PlaceOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
