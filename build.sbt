lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.13.10"
    )),
    libraryDependencies ++= Seq(
      "com.lihaoyi" % "ammonite" % "2.5.8" cross CrossVersion.full,
      "io.circe" %% "circe-core" % "0.14.5",
      "io.circe" %% "circe-generic" % "0.14.5",
      "io.circe" %% "circe-parser" % "0.14.5"
    )
  )
