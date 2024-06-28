package io.swagger.client.api.portfolio;

import com.google.gson.reflect.TypeToken;
import com.sun.org.apache.bcel.internal.Const;
import io.swagger.client.*;
import io.swagger.client.constants.Constants;
import io.swagger.client.model.portfolio.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeBookApi {
    private ApiClient apiClient;
    private final Constants constants;

    public TradeBookApi(Constants constants) {
        this(Configuration.getDefaultApiClient(), constants);
    }

    public TradeBookApi(ApiClient apiClient, Constants constants) {
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
     * Build call for getOrderBook
     * @param userId  (required)
     * @param source  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderBookCall(String userId, Map<String, String> propertiesMap, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("orderBook");

        ApiClient apiClient = new ApiClient();
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
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.putAll(constants.getHeaders());

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call getOrderBookValidateBeforeCall(String userId, Map<String, String> propertiesMap, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getOrderBook(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling getOrderBook(Async)");
        }

        return getOrderBookCall(userId, propertiesMap, source, progressListener, progressRequestListener);
    }

    /**
     * Get orders
     * This endpoint allows users view orders
     * @param userId  (required)
     * @param source  (required)
     * @return OrderBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderBookResponse getOrderBook(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        ApiResponse<OrderBookResponse> resp = getOrderBookWithHttpInfo(userId, propertiesMap, source);
        return resp.getData();
    }

    /**
     * Get orders
     * This endpoint allows users view orders
     * @param userId  (required)
     * @param source  (required)
     * @return ApiResponse&lt;OrderBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderBookResponse> getOrderBookWithHttpInfo(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOrderBookValidateBeforeCall(userId, propertiesMap, source, null, null);
        Type localVarReturnType = new TypeToken<OrderBookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for getOrderTrail
     * @param body  (required)
     * @param userId  (required)
     * @param source  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderTrailCall(OrderTrailRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("getOrderTrail");

        ApiClient apiClient = new ApiClient();
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

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call getOrderTrailValidateBeforeCall(OrderTrailRequest body, Map<String, String> propertiesMap, String userId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getOrderTrail(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getOrderTrail(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling getOrderTrail(Async)");
        }

        return getOrderTrailCall(body, propertiesMap, userId, source, progressListener, progressRequestListener);
    }

    /**
     * Order Trail
     * This endpoint allows users to get events of particular order
     * @param body  (required)
     * @param userId  (required)
     * @param source  (required)
     * @return OrderTrailResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderTrailResponse getOrderTrail(OrderTrailRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        ApiResponse<OrderTrailResponse> resp = getOrderTrailWithHttpInfo(body, propertiesMap, userId, source);
        return resp.getData();
    }

    /**
     * Order Trail
     * This endpoint allows users to get events of particular order
     * @param body  (required)
     * @param userId  (required)
     * @param source  (required)
     * @return ApiResponse&lt;OrderTrailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderTrailResponse> getOrderTrailWithHttpInfo(OrderTrailRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOrderTrailValidateBeforeCall(body, propertiesMap, userId, source, null, null);
        Type localVarReturnType = new TypeToken<OrderTrailResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for tradeBook
     * @param userId  (required)
     * @param source  (required)
     * @param orderIds  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tradeBookCall(String userId, Map<String, String> propertiesMap, String source, List<String> orderIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("tradeBook");

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (orderIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "orderIds", orderIds));

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
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call tradeBookValidateBeforeCall(String userId, Map<String, String> propertiesMap, String source, List<String> orderIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling tradeBook(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling tradeBook(Async)");
        }
        // verify the required parameter 'orderIds' is set
        if (orderIds == null) {
            throw new ApiException("Missing the required parameter 'orderIds' when calling tradeBook(Async)");
        }

        return tradeBookCall(userId, propertiesMap, source, orderIds, progressListener, progressRequestListener);
    }

    /**
     * Trades
     * This endpoint allows users to view trades
     * @param userId  (required)
     * @param source  (required)
     * @param orderIds  (required)
     * @return TradeBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TradeBookResponse tradeBook(String userId, Map<String, String> propertiesMap, String source, List<String> orderIds) throws ApiException {
        ApiResponse<TradeBookResponse> resp = tradeBookWithHttpInfo(userId, propertiesMap, source, orderIds);
        return resp.getData();
    }

    /**
     * Trades
     * This endpoint allows users to view trades
     * @param userId  (required)
     * @param source  (required)
     * @param orderIds  (required)
     * @return ApiResponse&lt;TradeBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TradeBookResponse> tradeBookWithHttpInfo(String userId, Map<String, String> propertiesMap, String source, List<String> orderIds) throws ApiException {
        com.squareup.okhttp.Call call = tradeBookValidateBeforeCall(userId, propertiesMap, source, orderIds, null, null);
        Type localVarReturnType = new TypeToken<TradeBookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
