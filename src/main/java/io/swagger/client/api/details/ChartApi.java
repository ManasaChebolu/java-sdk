package io.swagger.client.api.details;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.constants.Constants;
import io.swagger.client.model.details.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartApi {
    private final Constants constants;
    private ApiClient apiClient;

    public ChartApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public ChartApi(Constants constants, ApiClient apiClient) {
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
     * Build call for historicalData
     *
     * @param symbol        (required)
     * @param resolution    (required)
     * @param from          (required)
     * @param to            (required)
     * @param exc           (required)
     * @param streamSymbol  (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call historicalDataCall(String symbol, String resolution, String from, String to, String countback, String exc, String streamSymbol, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("historicalData");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (resolution != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resolution", resolution));
        if (from != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (to != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
        if (countback != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countback", countback));
        if (exc != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("exc", exc));
        if (streamSymbol != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("streamSymbol", streamSymbol));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

    private com.squareup.okhttp.Call historicalDataValidateBeforeCall(String symbol, String resolution, String from, String to, String countback, String exc, String streamSymbol, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling historicalData(Async)");
        }
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new ApiException("Missing the required parameter 'resolution' when calling historicalData(Async)");
        }
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling historicalData(Async)");
        }
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling historicalData(Async)");
        }
        // verify the required parameter 'countback' is set
        if (countback == null) {
            throw new ApiException("Missing the required parameter 'countback' when calling historicalData(Async)");
        }
        // verify the required parameter 'exc' is set
        if (exc == null) {
            throw new ApiException("Missing the required parameter 'exc' when calling historicalData(Async)");
        }
        // verify the required parameter 'streamSymbol' is set
        if (streamSymbol == null) {
            throw new ApiException("Missing the required parameter 'streamSymbol' when calling historicalData(Async)");
        }

        return historicalDataCall(symbol, resolution, from, to, countback, exc, streamSymbol, propertiesMap);
    }

    /**
     * HistoricalDataAPI
     *
     * @param symbol        (required)
     * @param resolution    (required)
     * @param from          (required)
     * @param to            (required)
     * @param exc           (required)
     * @param streamSymbol  (required)
     * @return HistorySuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HistorySuccess historicalData(
            String symbol,
            String resolution,
            String from,
            String to,
            String countback,
            String exc,
            String streamSymbol,
            Map<String, String> propertiesMap
    ) throws ApiException {
        ApiResponse<HistorySuccess> resp = historicalDataWithHttpInfo(symbol, resolution, from, to, countback, exc, streamSymbol, propertiesMap);
        return resp.getData();
    }

    /**
     * HistoricalDataAPI
     *
     * @param symbol        (required)
     * @param resolution    (required)
     * @param from          (required)
     * @param to            (required)
     * @param exc           (required)
     * @param streamSymbol  (required)
     * @return ApiResponse&lt;HistorySuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HistorySuccess> historicalDataWithHttpInfo(String symbol, String resolution, String from, String to, String countback, String exc, String streamSymbol, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = historicalDataValidateBeforeCall(symbol, resolution, from, to, countback, exc, streamSymbol, propertiesMap);
        Type localVarReturnType = new TypeToken<HistorySuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for intraday
     *
     * @param body          (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call intradayCall(IntradayRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("intradayData");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

    private com.squareup.okhttp.Call intradayValidateBeforeCall(IntradayRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling intraday(Async)");
        }

        return intradayCall(body, propertiesMap);
    }

    /**
     * IntradayAPI
     *
     * @param body          (required)
     * @return IntradaySuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IntradaySuccess intraday(IntradayRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<IntradaySuccess> resp = intradayWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }

    /**
     * IntradayAPI
     *
     * @param body          (required)
     * @return ApiResponse&lt;IntradaySuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IntradaySuccess> intradayWithHttpInfo(IntradayRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = intradayValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<IntradaySuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for sparkLine
     *
     * @param body          (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sparkLineCall(SparklineRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("sparkline");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

    private com.squareup.okhttp.Call sparkLineValidateBeforeCall(SparklineRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling sparkLine(Async)");
        }

        return sparkLineCall(body, propertiesMap);
    }

    /**
     * SparkLineAPI
     *
     * @param body          (required)
     * @return SparklineResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SparklineResponse sparkLine(SparklineRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<SparklineResponse> resp = sparkLineWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }

    /**
     * SparkLineAPI
     *
     * @param body          (required)
     * @return ApiResponse&lt;SparklineResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SparklineResponse> sparkLineWithHttpInfo(SparklineRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = sparkLineValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<SparklineResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
