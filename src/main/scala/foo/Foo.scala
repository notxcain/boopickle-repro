package foo

final case class Foo(value: String) extends AnyVal
object Foo {
  import boopickle.Default._
  implicitly[Pickler[Foo]]
}
