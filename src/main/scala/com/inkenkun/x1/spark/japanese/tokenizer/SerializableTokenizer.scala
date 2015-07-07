package com.inkenkun.x1.spark.japanese.tokenizer

import scala.collection.JavaConverters._
import org.atilika.kuromoji.{Token, Tokenizer}

object SerializableTokenizer {

  val tokenizer = Tokenizer.builder().build()

  def tokenize( text: String ): Seq[Token] =
    tokenizer.tokenize( text ).asScala
}
