package io.swagger.client.api.details;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import com.google.gson.reflect.TypeToken;

import io.swagger.client.constants.Constants;
import io.swagger.client.model.details.OrderHistoryRequest;
import io.swagger.client.model.details.OrderHistorySuccess;
import io.swagger.client.model.details.TradeDetailsRequest;
import io.swagger.client.model.details.TradeDetailsSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeDetailsApi {
    private final Constants constants;
    private ApiClient apiClient;

    public TradeDetailsApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public TradeDetailsApi(Constants constants, ApiClient apiClient) {
        this.constants = constants;
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for orderDetails
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call orderDetailsCall(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("orderDetails");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
            localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (apiKey != null)
            localVarHeaderParams.put("api-key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call orderDetailsValidateBeforeCall(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling orderDetails(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling orderDetails(Async)");
        }
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling orderDetails(Async)");
        }

        return orderDetailsCall(body, authorization, apiKey, propertiesMap);
    }

    /**
     * OrderDetailsAPI
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return TradeDetailsSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TradeDetailsSuccess orderDetails(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<TradeDetailsSuccess> resp = orderDetailsWithHttpInfo(body, authorization, apiKey, propertiesMap);
        return resp.getData();
    }

    /**
     * OrderDetailsAPI
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return ApiResponse&lt;TradeDetailsSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TradeDetailsSuccess> orderDetailsWithHttpInfo(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = orderDetailsValidateBeforeCall(body, authorization, apiKey, propertiesMap);
        Type localVarReturnType = new TypeToken<TradeDetailsSuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for orderHistory
     *
     * @param authorization (required)
     * @param apiKey        (required)
     * @param body          (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call orderHistoryCall(String authorization, String apiKey, OrderHistoryRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("orderHistory");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
            localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (apiKey != null)
            localVarHeaderParams.put("api-key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call orderHistoryValidateBeforeCall(String authorization, String apiKey, OrderHistoryRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling orderHistory(Async)");
        }
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling orderHistory(Async)");
        }

        return orderHistoryCall(authorization, apiKey, body, propertiesMap);
    }

    /**
     * Order History API
     *
     * @param authorization (required)
     * @param apiKey        (required)
     * @param body          (optional)
     * @return OrderHistorySuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderHistorySuccess orderHistory(String authorization, String apiKey, OrderHistoryRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<OrderHistorySuccess> resp = orderHistoryWithHttpInfo(authorization, apiKey, body, propertiesMap);
        return resp.getData();
    }

    /**
     * Order History API
     *
     * @param authorization (required)
     * @param apiKey        (required)
     * @param body          (optional)
     * @return ApiResponse&lt;OrderHistorySuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderHistorySuccess> orderHistoryWithHttpInfo(String authorization, String apiKey, OrderHistoryRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = orderHistoryValidateBeforeCall(authorization, apiKey, body, propertiesMap);
        Type localVarReturnType = new TypeToken<OrderHistorySuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for tradeDetailsUsingOrderId
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tradeDetailsUsingOrderIdCall(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("tradeDetails");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
            localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (apiKey != null)
            localVarHeaderParams.put("api-key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call tradeDetailsUsingOrderIdValidateBeforeCall(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tradeDetailsUsingOrderId(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling tradeDetailsUsingOrderId(Async)");
        }
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling tradeDetailsUsingOrderId(Async)");
        }

        return tradeDetailsUsingOrderIdCall(body, authorization, apiKey, propertiesMap);
    }

    /**
     * TradeDetails Using OrderId API
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return TradeDetailsSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TradeDetailsSuccess tradeDetailsUsingOrderId(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<TradeDetailsSuccess> resp = tradeDetailsUsingOrderIdWithHttpInfo(body, authorization, apiKey, propertiesMap);
        return resp.getData();
    }

    /**
     * TradeDetails Using OrderId API
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return ApiResponse&lt;TradeDetailsSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TradeDetailsSuccess> tradeDetailsUsingOrderIdWithHttpInfo(TradeDetailsRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = tradeDetailsUsingOrderIdValidateBeforeCall(body, authorization, apiKey, propertiesMap);
        Type localVarReturnType = new TypeToken<TradeDetailsSuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
