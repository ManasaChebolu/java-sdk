package io.swagger.client.api.details;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.constants.Constants;
import io.swagger.client.model.details.GetProfileRequest;
import io.swagger.client.model.details.GetProfileSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginApi {
    private final Constants constants;
    private ApiClient apiClient;

    public LoginApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public LoginApi(Constants constants, ApiClient apiClient) {
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
     * Build call for getProfile
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProfileCall(GetProfileRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("getProfile");

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

    private com.squareup.okhttp.Call getProfileValidateBeforeCall(GetProfileRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getProfile(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getProfile(Async)");
        }
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling getProfile(Async)");
        }

        return getProfileCall(body, authorization, apiKey, propertiesMap);
    }

    /**
     * Get ProfileAPI
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return GetProfileSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetProfileSuccess getProfile(GetProfileRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<GetProfileSuccess> resp = getProfileWithHttpInfo(body, authorization, apiKey, propertiesMap);
        return resp.getData();
    }

    /**
     * Get ProfileAPI
     *
     * @param body          (required)
     * @param authorization (required)
     * @param apiKey        (required)
     * @return ApiResponse&lt;GetProfileSuccess &gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetProfileSuccess> getProfileWithHttpInfo(GetProfileRequest body, String authorization, String apiKey, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = getProfileValidateBeforeCall(body, authorization, apiKey, propertiesMap);
        Type localVarReturnType = new TypeToken<GetProfileSuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
