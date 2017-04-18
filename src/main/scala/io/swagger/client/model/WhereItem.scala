package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class WhereItem (
  _type: Option[String],  // You can explain the controls of more than one state with where. The controls of states: equal, notEqual, like, greaterThan, lessThan
column: Option[String],  // Column name
value: Option[String]  // Column value
)
