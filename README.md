# axxell-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>axxell-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:axxell-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/axxell-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.cinaq.axxell.client.*;
import com.cinaq.axxell.client.auth.*;
import com.cinaq.axxell.client.model.*;
import com.cinaq.axxell.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://axxell.cinaq.com/v1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**aggregateCountEvents**](docs/DefaultApi.md#aggregateCountEvents) | **GET** /aggregates/countevents/{eventType} | 
*DefaultApi* | [**aggregateEffective**](docs/DefaultApi.md#aggregateEffective) | **GET** /aggregates/effective/{eventType} | 
*DefaultApi* | [**aggregateEvents**](docs/DefaultApi.md#aggregateEvents) | **GET** /aggregates/events/{eventType} | 
*DefaultApi* | [**aggregateRecent**](docs/DefaultApi.md#aggregateRecent) | **GET** /aggregates/recent/{eventType} | 
*DefaultApi* | [**aggregateTop**](docs/DefaultApi.md#aggregateTop) | **GET** /aggregates/top/{eventType} | 
*DefaultApi* | [**authStore**](docs/DefaultApi.md#authStore) | **POST** /auth | 
*DefaultApi* | [**deleteAllEvents**](docs/DefaultApi.md#deleteAllEvents) | **DELETE** /events | 
*DefaultApi* | [**deleteAllItems**](docs/DefaultApi.md#deleteAllItems) | **DELETE** /items | 
*DefaultApi* | [**deleteItem**](docs/DefaultApi.md#deleteItem) | **DELETE** /items/{itemid} | 
*DefaultApi* | [**recommendInteresting**](docs/DefaultApi.md#recommendInteresting) | **GET** /recommendations/interesting | 
*DefaultApi* | [**recommendSimilar**](docs/DefaultApi.md#recommendSimilar) | **GET** /recommendations/similar | 
*DefaultApi* | [**registerEvent**](docs/DefaultApi.md#registerEvent) | **POST** /events | 
*DefaultApi* | [**registerItem**](docs/DefaultApi.md#registerItem) | **POST** /items | 
*DefaultApi* | [**registerStore**](docs/DefaultApi.md#registerStore) | **POST** /store | 
*DefaultApi* | [**retrieveEvents**](docs/DefaultApi.md#retrieveEvents) | **GET** /events | 
*DefaultApi* | [**retrieveItems**](docs/DefaultApi.md#retrieveItems) | **GET** /items | 


## Documentation for Models

 - [DataPoint](docs/DataPoint.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Event](docs/Event.md)
 - [Item](docs/Item.md)
 - [Store](docs/Store.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKey

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



Auto generated, see https://github.com/cinaq/axxell-specifications
