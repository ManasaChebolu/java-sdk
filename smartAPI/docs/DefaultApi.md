# DefaultApi

All URIs are relative to *https://umsxtend.blinkx.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authApiV1LoginNormalLoginPost**](DefaultApi.md#authApiV1LoginNormalLoginPost) | **POST** /auth/api/v1/login/normal-login | User Login

<a name="authApiV1LoginNormalLoginPost"></a>
# **authApiV1LoginNormalLoginPost**
> InlineResponse200 authApiV1LoginNormalLoginPost(body)

User Login

Endpoint to authenticate users

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
LoginNormalloginBody body = new LoginNormalloginBody(); // LoginNormalloginBody | 
try {
    InlineResponse200 result = apiInstance.authApiV1LoginNormalLoginPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authApiV1LoginNormalLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginNormalloginBody**](LoginNormalloginBody.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

