Steps to reproduce:
------------------

1. Run `./gradlew socketTest --info`
2. Observe that it runs the test (which intentionally throws an exception, to make it more obvious.
3. Upgrade wrapper to gradle 9.0.0-rc-3
4. Run `./gradlew socketTest --info`

Expected
--------
With gradle 9, the test should still run

Actual
------
With gradle 9, the `socketTest` task terminates wth `NO-SOURCE` and doesn't run the test.
