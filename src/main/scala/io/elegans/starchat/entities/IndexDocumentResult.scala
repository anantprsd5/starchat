package io.elegans.starchat.entities

/**
  * Created by Angelo Leto <angelo.leto@elegans.io> on 02/07/16.
  */

case class IndexDocumentResult(index: String,
                    dtype: String,
                    id: String,
                    version: Long,
                    created: Boolean
                   )
