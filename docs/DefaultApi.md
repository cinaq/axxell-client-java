# DefaultApi

All URIs are relative to *https://axxell.cinaq.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregateCountEvents**](DefaultApi.md#aggregateCountEvents) | **GET** /aggregates/countevents/{eventType} | 
[**aggregateEffective**](DefaultApi.md#aggregateEffective) | **GET** /aggregates/effective/{eventType} | 
[**aggregateEvents**](DefaultApi.md#aggregateEvents) | **GET** /aggregates/events/{eventType} | 
[**aggregateRecent**](DefaultApi.md#aggregateRecent) | **GET** /aggregates/recent/{eventType} | 
[**aggregateTop**](DefaultApi.md#aggregateTop) | **GET** /aggregates/top/{eventType} | 
[**authStore**](DefaultApi.md#authStore) | **POST** /auth | 
[**deleteAllEvents**](DefaultApi.md#deleteAllEvents) | **DELETE** /events | 
[**deleteAllItems**](DefaultApi.md#deleteAllItems) | **DELETE** /items | 
[**deleteItem**](DefaultApi.md#deleteItem) | **DELETE** /items/{itemid} | 
[**recommendInteresting**](DefaultApi.md#recommendInteresting) | **GET** /recommendations/interesting | 
[**recommendSimilar**](DefaultApi.md#recommendSimilar) | **GET** /recommendations/similar | 
[**registerEvent**](DefaultApi.md#registerEvent) | **POST** /events | 
[**registerItem**](DefaultApi.md#registerItem) | **POST** /items | 
[**registerStore**](DefaultApi.md#registerStore) | **POST** /store | 
[**retrieveEvents**](DefaultApi.md#retrieveEvents) | **GET** /events | 
[**retrieveItems**](DefaultApi.md#retrieveItems) | **GET** /items | 


<a name="aggregateCountEvents"></a>
# **aggregateCountEvents**
> DataPoint aggregateCountEvents(storeid, eventType, dataPeriod)



Return list of counts per event

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String eventType = "eventType_example"; // String | Valid values purchase, view or recommend
String dataPeriod = "dataPeriod_example"; // String | Valid values are last7days, last30days, today, yesterday
try {
    DataPoint result = apiInstance.aggregateCountEvents(storeid, eventType, dataPeriod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aggregateCountEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **eventType** | **String**| Valid values purchase, view or recommend |
 **dataPeriod** | **String**| Valid values are last7days, last30days, today, yesterday |

### Return type

[**DataPoint**](DataPoint.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="aggregateEffective"></a>
# **aggregateEffective**
> List&lt;DataPoint&gt; aggregateEffective(storeid, eventType)



Return list of aggregated data points correlated with recommendationa and eventType

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String eventType = "eventType_example"; // String | Valid values purchase, view or recommend
try {
    List<DataPoint> result = apiInstance.aggregateEffective(storeid, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aggregateEffective");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **eventType** | **String**| Valid values purchase, view or recommend |

### Return type

[**List&lt;DataPoint&gt;**](DataPoint.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="aggregateEvents"></a>
# **aggregateEvents**
> List&lt;DataPoint&gt; aggregateEvents(storeid, eventType)



Return list of aggregated data points

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String eventType = "eventType_example"; // String | Valid values purchase, view or recommend
try {
    List<DataPoint> result = apiInstance.aggregateEvents(storeid, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aggregateEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **eventType** | **String**| Valid values purchase, view or recommend |

### Return type

[**List&lt;DataPoint&gt;**](DataPoint.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="aggregateRecent"></a>
# **aggregateRecent**
> List&lt;Item&gt; aggregateRecent(storeid, eventType)



Returns recent products

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String eventType = "eventType_example"; // String | Valid values purchase, view or recommend
try {
    List<Item> result = apiInstance.aggregateRecent(storeid, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aggregateRecent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **eventType** | **String**| Valid values purchase, view or recommend |

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="aggregateTop"></a>
# **aggregateTop**
> List&lt;Item&gt; aggregateTop(storeid, eventType)



Returns top products

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String eventType = "eventType_example"; // String | Valid values purchase, view or recommend
try {
    List<Item> result = apiInstance.aggregateTop(storeid, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aggregateTop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **eventType** | **String**| Valid values purchase, view or recommend |

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authStore"></a>
# **authStore**
> Store authStore(store)



Retrieve authentication token using password

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Store store = new Store(); // Store | Store
try {
    Store result = apiInstance.authStore(store);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **store** | [**Store**](Store.md)| Store |

### Return type

[**Store**](Store.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllEvents"></a>
# **deleteAllEvents**
> Event deleteAllEvents(storeid)



Delete all events

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
try {
    Event result = apiInstance.deleteAllEvents(storeid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteAllEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |

### Return type

[**Event**](Event.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllItems"></a>
# **deleteAllItems**
> Item deleteAllItems(storeid)



Delete all items

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
try {
    Item result = apiInstance.deleteAllItems(storeid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteAllItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |

### Return type

[**Item**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItem"></a>
# **deleteItem**
> Item deleteItem(storeid, itemid)



Delete existing item

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String itemid = "itemid_example"; // String | Item identifier
try {
    Item result = apiInstance.deleteItem(storeid, itemid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **itemid** | **String**| Item identifier |

### Return type

[**Item**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recommendInteresting"></a>
# **recommendInteresting**
> List&lt;Item&gt; recommendInteresting(storeid, userid, count)



Return list of recommended items

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String userid = "userid_example"; // String | Interesting items for visitor
Double count = 3.4D; // Double | Return exactly this amount of suggestions. Maximum value is 50, default is 5.
try {
    List<Item> result = apiInstance.recommendInteresting(storeid, userid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recommendInteresting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **userid** | **String**| Interesting items for visitor |
 **count** | **Double**| Return exactly this amount of suggestions. Maximum value is 50, default is 5. | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recommendSimilar"></a>
# **recommendSimilar**
> List&lt;Item&gt; recommendSimilar(storeid, userid, itemid, count)



Return list of recommended items

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
String userid = "userid_example"; // String | User requesting the recommendation
String itemid = "itemid_example"; // String | Similar items bought by others
Double count = 3.4D; // Double | Return exactly this amount of suggestions. Maximum value is 50, default is 5.
try {
    List<Item> result = apiInstance.recommendSimilar(storeid, userid, itemid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recommendSimilar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **userid** | **String**| User requesting the recommendation |
 **itemid** | **String**| Similar items bought by others |
 **count** | **Double**| Return exactly this amount of suggestions. Maximum value is 50, default is 5. | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerEvent"></a>
# **registerEvent**
> Event registerEvent(storeid, event)



Register new event

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
Event event = new Event(); // Event | Single event to register
try {
    Event result = apiInstance.registerEvent(storeid, event);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#registerEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **event** | [**Event**](Event.md)| Single event to register |

### Return type

[**Event**](Event.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerItem"></a>
# **registerItem**
> Item registerItem(storeid, item)



Register new item

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
Item item = new Item(); // Item | Single item to register
try {
    Item result = apiInstance.registerItem(storeid, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#registerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |
 **item** | [**Item**](Item.md)| Single item to register |

### Return type

[**Item**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerStore"></a>
# **registerStore**
> Store registerStore(store)



Register new Store

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Store store = new Store(); // Store | Store
try {
    Store result = apiInstance.registerStore(store);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#registerStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **store** | [**Store**](Store.md)| Store |

### Return type

[**Store**](Store.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveEvents"></a>
# **retrieveEvents**
> List&lt;Event&gt; retrieveEvents(storeid)



Get recent events

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
try {
    List<Event> result = apiInstance.retrieveEvents(storeid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveItems"></a>
# **retrieveItems**
> List&lt;Item&gt; retrieveItems(storeid)



Get recent items

### Example
```java
// Import classes:
//import com.cinaq.axxell.client.ApiClient;
//import com.cinaq.axxell.client.ApiException;
//import com.cinaq.axxell.client.Configuration;
//import com.cinaq.axxell.client.auth.*;
//import com.cinaq.axxell.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String storeid = "storeid_example"; // String | Store identifier
try {
    List<Item> result = apiInstance.retrieveItems(storeid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeid** | **String**| Store identifier |

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

