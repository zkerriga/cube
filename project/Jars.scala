import sbt._

object Jars {

  object cats {
    val effectVersion = "3.2.8"
    val coreVersion = "2.6.1"

    val effect = "org.typelevel" %% "cats-effect" % effectVersion
    val core = "org.typelevel" %% "cats-core" % coreVersion
  }

  object monix {
    val version = "3.4.0"

    val execution = "io.monix" %% "monix-execution" % version
  }

  object circe {
    val version = "0.14.1"

    val core = "io.circe" %% "circe-core" % version
    val generic = "io.circe" %% "circe-generic" % version
    val parser = "io.circe" %% "circe-parser" % version
  }

  object tapir {
    val version = "0.19.0-M14"

    val core = "com.softwaremill.sttp.tapir" %% "tapir-core" % version
    val circe = "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % version
    val cats = "com.softwaremill.sttp.tapir" %% "tapir-cats" % version

    object openapi {
      val docs = "com.softwaremill.sttp.tapir" %% "tapir-openapi-docs" % version
      val circe = "com.softwaremill.sttp.tapir" %% "tapir-openapi-circe-yaml" % version
    }
  }

  object akka {
    val httpVersion = "10.2.7"
    val akkaVersion = "2.6.17"

    val stream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
    val http = ("com.typesafe.akka" %% "akka-http" % httpVersion).cross(CrossVersion.for3Use2_13)
  }

  object scalatest {
    val version = "3.2.10"

    val scalactic = "org.scalactic" %% "scalactic" % version
    val scalatest = "org.scalatest" %% "scalatest" % version % Test
  }

  object logback {
    val version = "3.9.4"

    val classic = "ch.qos.logback" % "logback-classic" % "1.2.6"
    val logging = "com.typesafe.scala-logging" %% "scala-logging" % version
  }

  object pureconfig {
    val version = "0.17.0"

    val core = ("com.github.pureconfig" %% "pureconfig" % version).cross(CrossVersion.for3Use2_13)
  }

}
