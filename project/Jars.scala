import sbt._

object Jars {

  object tapir {
    val version = "0.19.0-M14"

    val core = "com.softwaremill.sttp.tapir" %% "tapir-core" % version
  }

  object scalatest {
    val version = "3.2.10"

    val scalactic = "org.scalactic" %% "scalactic" % version
    val scalatest = "org.scalatest" %% "scalatest" % version % Test
  }

}
