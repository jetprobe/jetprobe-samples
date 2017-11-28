package com.jetprobe.sample

import com.jetprobe.core.TestScenario
import com.jetprobe.core.annotation.TestSuite
import com.jetprobe.core.structure.ExecutableScenario
import com.jetprobe.mongo.sink.MongoSink
import scala.concurrent.duration._

/**
  * @author Shad.
  */

@TestSuite
class MongoTestSuite extends TestScenario{

  val mongoDB = MongoSink("mongodb://${mongo.host}/")

  override def buildScenario: ExecutableScenario = {
    scenario("Mongo Test suite")
      .exec(
        mongoDB.createCollection("some", "employee2")
      )
      .exec(
        mongoDB.createDatabase("interesting-database")
      )
      .exec(
        mongoDB.dropCollection("some", "employee")
      )
      .exec(
        mongoDB.insertDocuments(db = "some", collection = "employee32", rows = Seq("""{_id : 1}""","""{_id : 2}"""))
      )
      .exec(
        mongoDB.insertDocuments(db = "some", collection = "employee3", rows = Seq("""{_id : 1}""","""{_id : 2}""","""{_id : 3}"""))
      )
      .exec(
        mongoDB.createCollection("anotherdb", "colll", Seq("emp.name"))
      )
      .exec(
        mongoDB.removeAllDocuments("some", "employee32")
      )
      .pause(2.seconds)
      .build
  }


}
