
# Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationTime** | **String** | Read-only |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event, consumer cannot set recommend |  [optional]
**eventId** | **String** | Read-only |  [optional]
**eventTime** | **String** | Read-only |  [optional]
**entityType** | **String** | Read-only |  [optional]
**entityId** | **String** | The user that triggered this event. You are free to choose whatever you like but it has to be consistent. Good examples are email address, internal user id or sha256 hash of these values. |  [optional]
**targetEntityType** | **String** | Read-only |  [optional]
**targetEntityId** | **String** | Way to identify your product. Use the product id from your shop |  [optional]
**body** | **String** | Meta information that doesn&#39;t fit into above fields. Read-only |  [optional]


<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
VIEW | &quot;view&quot;
PURCHASE | &quot;purchase&quot;
RECOMMEND | &quot;recommend&quot;



