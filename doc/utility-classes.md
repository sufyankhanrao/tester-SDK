
# Utility Classes Documentation

## ApiHelper Class

This is a Helper class with commonly used utilities for the SDK.

### Fields

| Name | Description | Type |
|  --- | --- | --- |
| mapper | Deserialization of Json data. | `ObjectMapper` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `serializeXml(T obj, String rootName, Class<T> cls)` | Xml Serialization of a given object. | `<T> String` |
| `serializeXmlArray(T[] objArray, String rootName, String nodeName, Class<T> cls)` | Xml Serialization of a given object list. | `<T> String` |
| `serialize(Object obj)` | Json Serialization of a given object. | `String` |
| `deserialize(String json)` | Json deserialization of the given Json string. | `LinkedHashMap<String, Object>` |
| `deserialize(String json, Class<T> clazz)` | Json deserialization of the given Json string. | `<T extends Object> T` |
| `deserialize(String json, TypeReference<T> typeReference)` | JSON Deserialization of the given json string. | `<T extends Object> T` |
| `deserializeArray(String json, Class<T[]> classArray)` | JSON Deserialization of the given json string. | `<T extends Object> List<T>` |
| `deserializeXml(String xml, Class<T> cls)` | XML Deserialization of the given xml string. | `<T extends Object> T` |
| `deserializeXmlArray(String xml, Class<T[]> cls)` | XML Deserialization of the given xml string. | `<T extends Object> List<T>` |
| `deserializeXmlSimpleTypesArray(String xml, Class<T> cls)` | XML Deserialization of the given xml string for simple types. | `<T extends Object> List<T>` |

## FileWrapper Class

Class to wrap file and contentType to be sent as part of a HTTP request.

### Constructors

| Name | Description |
|  --- | --- |
| `FileWrapper(File file)` | Initialization constructor. |
| `FileWrapper(File file, String contentType)` | Initialization constructor. |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getFile()` | File instance. | `File` |
| `getContentType()` | Content type of the file. | `String` |


