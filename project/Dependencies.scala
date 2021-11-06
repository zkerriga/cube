import sbt._

object Dependencies {

  import Jars._

  private val coreDependencies: Vector[ModuleID] = Vector(
    tapir.core,
    tapir.circe,
    tapir.cats,
    tapir.openapi.docs,
    tapir.openapi.circe,
    logback.classic,
    logback.logging,
    cats.effect,
    cats.core,
    circe.core,
    circe.generic,
    circe.parser,
    akka.stream,
    akka.http
  )

  private val testDependencies: Vector[ModuleID] = Vector(
    scalatest.scalatest,
    scalatest.scalactic
  )

  val libraryDependencies: Vector[ModuleID] =
    coreDependencies ++ testDependencies

}
