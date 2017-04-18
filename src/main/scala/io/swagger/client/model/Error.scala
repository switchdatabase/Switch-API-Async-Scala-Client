package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Error (
  ResponseTime: Option[Long],
Response: Option[String],
ErrorMessage: Option[String]
)
