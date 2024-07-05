package io.swagger.client.api.details;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.details.ProfitLossRequest;
import io.swagger.client.model.details.ProfitLossSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportApi {
    private ApiClient apiClient;

    public ReportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for profitLossReport
     * @param body  (required)
     * @param authorization  (required)
     * @param apiKey  (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call profitLossReportCall(ProfitLossRequest body, String authorization, String apiKey) throws ApiException {

        // create path and map variables
        String localVarPath = "/trade/v1/profit-loss-report";

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, (Object) body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call profitLossReportValidateBeforeCall(ProfitLossRequest body, String authorization, String apiKey) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling profitLossReport(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling profitLossReport(Async)");
        }
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling profitLossReport(Async)");
        }

        return profitLossReportCall(body, authorization, apiKey);
    }

    /**
     * ProfitLossReportAPI
     * 
     * @param body  (required)
     * @param authorization  (required)
     * @param apiKey  (required)
     * @return ProfitLossSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProfitLossSuccess profitLossReport(ProfitLossRequest body, String authorization, String apiKey) throws ApiException {
        ApiResponse<ProfitLossSuccess> resp = profitLossReportWithHttpInfo(body, authorization, apiKey);
        return resp.getData();
    }

    /**
     * ProfitLossReportAPI
     * 
     * @param body  (required)
     * @param authorization  (required)
     * @param apiKey  (required)
     * @return ApiResponse&lt;ProfitLossSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProfitLossSuccess> profitLossReportWithHttpInfo(ProfitLossRequest body, String authorization, String apiKey) throws ApiException {
        com.squareup.okhttp.Call call = profitLossReportValidateBeforeCall(body, authorization, apiKey);
        Type localVarReturnType = new TypeToken<ProfitLossSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
