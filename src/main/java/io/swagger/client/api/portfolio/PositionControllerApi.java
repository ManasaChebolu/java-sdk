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

public class PositionControllerApi {
    private ApiClient apiClient;
    private final Constants constants;

    public PositionControllerApi(Constants constants) {
        this(Configuration.getDefaultApiClient(), constants);
    }

    public PositionControllerApi(ApiClient apiClient, Constants constants) {
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
     * Build call for convertPosition
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call convertPositionCall(PositionConversionRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("convertPosition");

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
        localVarHeaderParams.putAll(constants.getHeaders());

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call convertPositionValidateBeforeCall(PositionConversionRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling convertPosition(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling convertPosition(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling convertPosition(Async)");
        }

        return convertPositionCall(body, propertiesMap, userId, source);
    }

    /**
     * Position Conversion
     * This endpoint allow user to convert positions
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return PositionConversionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PositionConversionResponse convertPosition(PositionConversionRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        ApiResponse<PositionConversionResponse> resp = convertPositionWithHttpInfo(body, propertiesMap, userId, source);
        return resp.getData();
    }

    /**
     * Position Conversion
     * This endpoint allow user to convert positions
     *
     * @param body   (required)
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;PositionConversionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PositionConversionResponse> convertPositionWithHttpInfo(PositionConversionRequest body, Map<String, String> propertiesMap, String userId, String source) throws ApiException {
        com.squareup.okhttp.Call call = convertPositionValidateBeforeCall(body, propertiesMap, userId, source);
        Type localVarReturnType = new TypeToken<PositionConversionResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for doHoldings
     *
     * @param userId (required)
     * @param source (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call doHoldingsCall(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("doHoldings");

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

    private com.squareup.okhttp.Call doHoldingsValidateBeforeCall(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling doHoldings(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling doHoldings(Async)");
        }

        return doHoldingsCall(userId, propertiesMap, source);
    }

    /**
     * Holdings
     * This endpoint allow user to view holdings
     *
     * @param userId (required)
     * @param source (required)
     * @return HoldingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HoldingResponse doHoldings(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        ApiResponse<HoldingResponse> resp = doHoldingsWithHttpInfo(userId, propertiesMap, source);
        return resp.getData();
    }

    /**
     * Holdings
     * This endpoint allow user to view holdings
     *
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;HoldingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HoldingResponse> doHoldingsWithHttpInfo(String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        com.squareup.okhttp.Call call = doHoldingsValidateBeforeCall(userId, propertiesMap, source);
        Type localVarReturnType = new TypeToken<HoldingResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for getPositionBook
     *
     * @param userId (required)
     * @param source (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPositionBookCall(List<Pair> queryParams, String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("positionBook");

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

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
        return apiClient.buildCall(localVarPath, "GET", queryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call getPositionBookValidateBeforeCall(List<Pair> queryParams, String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getPositionBook(Async)");
        }
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling getPositionBook(Async)");
        }

        return getPositionBookCall(queryParams, userId, propertiesMap, source);
    }

    /**
     * Position Book
     * This endpoint allow user to view positions
     *
     * @param userId (required)
     * @param source (required)
     * @return PositionBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PositionBookResponse getPositionBook(List<Pair> queryParams, String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        ApiResponse<PositionBookResponse> resp = getPositionBookWithHttpInfo(queryParams, userId, propertiesMap, source);
        return resp.getData();
    }

    /**
     * Position Book
     * This endpoint allow user to view positions
     *
     * @param userId (required)
     * @param source (required)
     * @return ApiResponse&lt;PositionBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PositionBookResponse> getPositionBookWithHttpInfo(List<Pair> queryParams, String userId, Map<String, String> propertiesMap, String source) throws ApiException {
        com.squareup.okhttp.Call call = getPositionBookValidateBeforeCall(queryParams, userId, propertiesMap, source);
        Type localVarReturnType = new TypeToken<PositionBookResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
