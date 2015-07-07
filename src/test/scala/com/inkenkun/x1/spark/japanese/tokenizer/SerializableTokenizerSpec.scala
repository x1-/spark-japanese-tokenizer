package com.inkenkun.x1.spark.japanese.tokenizer

import org.specs2.mutable.SpecificationWithJUnit

class SerializableTokenizerSpec extends SpecificationWithJUnit {
  "SerializableTokenizer.tokenize" should {
    "When empty String given, Return Nil." in {
      SerializableTokenizer.tokenize( "" ) must beEmpty
    }
    "When japanese words given, Return Seq[Token]." in {
      val tokens = SerializableTokenizer.tokenize( "すもももももももものうち" )
      tokens(0).getSurfaceForm mustEqual "すもも"
      tokens(1).getSurfaceForm mustEqual "も"
      tokens(2).getSurfaceForm mustEqual "もも"
      tokens(3).getSurfaceForm mustEqual "も"
      tokens(4).getSurfaceForm mustEqual "もも"
      tokens(5).getSurfaceForm mustEqual "の"
      tokens(6).getSurfaceForm mustEqual "うち"
    }
  }
}
