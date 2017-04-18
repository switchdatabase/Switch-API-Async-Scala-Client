package io.swagger.client.api

import io.swagger.client.model.AddResponse
import io.swagger.client.model.Body
import io.swagger.client.model.Error
import io.swagger.client.model.SetResponse
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class DBOperationsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addPost(aPIKey: String,
      accessToken: String,
      list: String,
      body: String)(implicit reader: ClientResponseReader[AddResponse], writer: RequestWriter[String]): Future[AddResponse] = {
    // create path and map variables
    val path = (addFmt("/Add"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DBOperationsApi->addPost")

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DBOperationsApi->addPost")

    if (list == null) throw new Exception("Missing required parameter 'list' when calling DBOperationsApi->addPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling DBOperationsApi->addPost")

    headerParams += "APIKey" -> aPIKey.toString
    headerParams += "AccessToken" -> accessToken.toString
    headerParams += "List" -> list.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listPost(aPIKey: String,
      accessToken: String,
      list: String,
      body: Body)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Body]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/List"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DBOperationsApi->listPost")

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DBOperationsApi->listPost")

    if (list == null) throw new Exception("Missing required parameter 'list' when calling DBOperationsApi->listPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling DBOperationsApi->listPost")
    headerParams += "APIKey" -> aPIKey.toString
    headerParams += "AccessToken" -> accessToken.toString
    headerParams += "List" -> list.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setDelete(aPIKey: String,
      accessToken: String,
      list: String,
      listItemId: String)(implicit reader: ClientResponseReader[SetResponse]): Future[SetResponse] = {
    // create path and map variables
    val path = (addFmt("/Set"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DBOperationsApi->setDelete")

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DBOperationsApi->setDelete")

    if (list == null) throw new Exception("Missing required parameter 'list' when calling DBOperationsApi->setDelete")

    if (listItemId == null) throw new Exception("Missing required parameter 'listItemId' when calling DBOperationsApi->setDelete")

    headerParams += "APIKey" -> aPIKey.toString
    headerParams += "AccessToken" -> accessToken.toString
    headerParams += "List" -> list.toString
    headerParams += "ListItemId" -> listItemId.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setPost(aPIKey: String,
      accessToken: String,
      list: String,
      listItemId: String,
      body: String)(implicit reader: ClientResponseReader[SetResponse], writer: RequestWriter[String]): Future[SetResponse] = {
    // create path and map variables
    val path = (addFmt("/Set"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling DBOperationsApi->setPost")

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DBOperationsApi->setPost")

    if (list == null) throw new Exception("Missing required parameter 'list' when calling DBOperationsApi->setPost")

    if (listItemId == null) throw new Exception("Missing required parameter 'listItemId' when calling DBOperationsApi->setPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling DBOperationsApi->setPost")

    headerParams += "APIKey" -> aPIKey.toString
    headerParams += "AccessToken" -> accessToken.toString
    headerParams += "List" -> list.toString
    headerParams += "ListItemId" -> listItemId.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
