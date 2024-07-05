package io.swagger.client.api.details;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.details.FundsSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LimitApi {
    private ApiClient apiClient;

    public LimitApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LimitApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for fundView
     * @param authorization  (required)
     * @param apiKey  (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fundViewCall(String authorization, String apiKey) throws ApiException {
        // create path and map variables
        String localVarPath = "/funds/v1/get-funds";

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
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call fundViewValidateBeforeCall(String authorization, String apiKey) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling fundView(Async)");
        }
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling fundView(Async)");
        }

        return fundViewCall(authorization, apiKey);
    }

    /**
     * FundViewAPI
     * 
     * @param authorization  (required)
     * @param apiKey  (required)
     * @return FundsSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FundsSuccess fundView(String authorization, String apiKey) throws ApiException {
        ApiResponse<FundsSuccess> resp = fundViewWithHttpInfo(authorization, apiKey);
        return resp.getData();
    }

    /**
     * FundViewAPI
     * 
     * @param authorization  (required)
     * @param apiKey  (required)
     * @return ApiResponse&lt;FundsSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FundsSuccess> fundViewWithHttpInfo(String authorization, String apiKey) throws ApiException {
        com.squareup.okhttp.Call call = fundViewValidateBeforeCall(authorization, apiKey);
        Type localVarReturnType = new TypeToken<FundsSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
