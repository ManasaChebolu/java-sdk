package io.swagger.client.api.portfolio;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.constants.Constants;
import io.swagger.client.model.portfolio.*;

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
     *
     * @param userId (required)
     * @param source (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderBookCall(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call getOrderBookValidateBeforeCall(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getOrderBook(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling getOrderBook(Async)");
        }

        return getOrderBookCall(userId, propertiesMap, source);
    }

    /**
     * Get orders
     * This endpoint allows users view orders
     *
     * @param userId (required)
     * @param source (required)
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
     *
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;OrderBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderBookResponse> getOrderBookWithHttpInfo(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOrderBookValidateBeforeCall(userId, propertiesMap, source);
        Type localVarReturnType = new TypeToken<OrderBookResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for tradeBook
     *
     * @param userId (required)
     * @param source (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tradeBookCall(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call tradeBookValidateBeforeCall(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling tradeBook(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling tradeBook(Async)");
        }

        return tradeBookCall(userId, propertiesMap, source);
    }

    /**
     * Trades
     * This endpoint allows users to view trades
     *
     * @param userId (required)
     * @param source (required)
     * @return TradeBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TradeBookResponse tradeBook(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        ApiResponse<TradeBookResponse> resp = tradeBookWithHttpInfo(userId, propertiesMap, source);
        return resp.getData();
    }

    /**
     * Trades
     * This endpoint allows users to view trades
     *
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;TradeBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TradeBookResponse> tradeBookWithHttpInfo(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        com.squareup.okhttp.Call call = tradeBookValidateBeforeCall(userId, propertiesMap, source);
        Type localVarReturnType = new TypeToken<TradeBookResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
