Gradle Custom Plugin Defined in `build.gradle` Demo
===================================================

Publish the plugin to maven local:

```
./gradlew install
```

Then use in testing project, see `testing-project/build.gradle`.

Test:

```
cd testing-project
./gradlew hello
```