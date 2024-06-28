package io.swagger.client.api.login;

import com.squareup.okhttp.Call;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import com.google.gson.reflect.TypeToken;


import io.swagger.client.constants.Constants;
import io.swagger.client.model.login.LoginResponse;
import io.swagger.client.model.login.LoginBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginApi {
    private final Constants constants;
    private final ApiClient apiClient;

    public LoginApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public LoginApi(Constants constants, ApiClient apiClient) {
        this.constants = constants;
        this.apiClient = apiClient;
    }

    /**
     * Build call for authApiV1LoginNormalLoginPost
     *
     * @param body (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call loginPostCall(LoginBody body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("login");

        apiClient.setBasePath("https://training-apiconnect.nitroxp.com");

        if (apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

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

        String[] localVarAuthNames = new String[] { "" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private Call loginPostValidateBeforeCall(LoginBody body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authApiV1LoginNormalLoginPost(Async)");
        }

        return loginPostCall(body, propertiesMap);
    }

    /**
     * User Login
     * Endpoint to authenticate users
     * @param body  (required)
     * @return LoginResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoginResponse loginPost(
            LoginBody body,
            Map<String, String> propertiesMap
    ) throws ApiException {
        ApiResponse<LoginResponse> resp = loginPostWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }

    /**
     * User Login
     * Endpoint to authenticate users
     * @param body  (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<LoginResponse> loginPostWithHttpInfo(
            LoginBody body,
            Map<String, String> propertiesMap
    ) throws ApiException {
        Call call = loginPostValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<LoginResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
