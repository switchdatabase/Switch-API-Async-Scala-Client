package io.swagger.client.api

import io.swagger.client.model.Error
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AuthorizationApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def tokenGet(aPIKey: String,
      signature: String,
      expire: Long)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/Token"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (aPIKey == null) throw new Exception("Missing required parameter 'aPIKey' when calling AuthorizationApi->tokenGet")

    if (signature == null) throw new Exception("Missing required parameter 'signature' when calling AuthorizationApi->tokenGet")

    headerParams += "APIKey" -> aPIKey.toString
    headerParams += "Signature" -> signature.toString
    headerParams += "Expire" -> expire.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
