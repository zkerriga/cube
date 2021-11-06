package main.scala.ru.zkerriga.cube

import cats.effect.{IOApp, IO, ExitCode}

object Main extends IOApp:
  def run(args: List[String]): IO[ExitCode] =
    Option("cube") match
      case Some(name) =>
        IO(println(s"Hello, $name.")).as(ExitCode.Success)
      case None =>
        IO(System.err.println("Usage: MyApp name")).as(ExitCode(2))
