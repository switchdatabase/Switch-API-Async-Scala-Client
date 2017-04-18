package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Body (
  list: Option[String],  // List name.
count: Option[Integer],  // Item count.
page: Option[Integer],  // Page number.
whereType: Option[String],  // Optional enumerator. You can assign the mode of implementation of where criterions by using AND and OR types under whereType parameter.
where: Option[List[WhereItem]],
order: Option[List_order]
)
