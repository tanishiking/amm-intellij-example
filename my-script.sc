import $ivy.`io.circe::circe-core:0.14.5`
import $ivy.`io.circe::circe-parser:0.14.5`
import $ivy.`io.circe::circe-generic:0.14.5`

import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

sealed trait Foo

case class Bar(xs: Vector[String]) extends Foo

case class Qux(i: Int, d: Option[Double]) extends Foo

@main
def main(thing: String = "World"): Unit = {
  val foo: Foo = Qux(13, Some(14.0))

  val json = foo.asJson.noSpaces
  pprint.pprintln(json)

  val decodedFoo = decode[Foo](json)
  pprint.pprintln(decodedFoo)
}
