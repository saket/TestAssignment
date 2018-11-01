I'm building this assignment to help people get started with writing tests and TDD. I've so far managed to write two basic chapters that involve date calculations. Date calculations are usually error prone because Maths is hard and dates are harder. Writing tests will give us confidence.

### Chapters

#### 1. Validate date of birth
For a hypothetical user profile screen, the user’s date of birth needs to validated. 

* The date’s pattern should be `d/MM/yyyy`.  E.g., `11/04/1992`. 
* The date should not be in the future.

The unit tests for this can be found in [DateOfBirthValidatorTest](https://github.com/saket/TestAssignment/blob/master/app/src/test/java/me/saket/testassignment/DateOfBirthValidatorTest.kt). The tests are named to match the business spec, but they’re empty. Your mission, should you choose to accept it, is to complete them with expected results and make them pass.

#### 2. Calculate relative timestamp
Given a date, generate relative timestamps that will be displayed on the UI. Assume that the dates will only be in the past for simplicity.

* If the date is of today, generate `Today`.
* If the date is of yesterday, generate `Yesterday`.
* If the date is within the current month, generate `{days} ago`. E.g., `24 days ago`.
* For dates older than that, print `{date} {month}, {year}`. E.g., `5 Jun 2018`, `21 Oct 2017`, etc.

These strings must be accessed through `strings.xml` keeping localization in mind. Because accessing them requires Android's context, tests for this chapter will run as Android tests and are present in [RelativeTimestampGeneratorAndroidTest](https://github.com/saket/TestAssignment/blob/master/app/src/androidTest/java/me/saket/testassignment/RelativeTimestampGeneratorAndroidTest.kt)

### Useful information

#### Running tests from terminal
Although I recommend running the tests from Studio because the results are nicer too look at, but just in case:

Unit tests:

```
./gradlew testDebug
```

Android tests: 
```
./gradlew connectedDebugAndroidTest
```

#### ThreeTenABP
This assignment uses lazythreetenbp for working with date and time. Due to some limitations in IntelliJ, the IDE doesn't know how to find and download its sources. As a work around, the sources are included with this project as a JAR inside [libraries](https://github.com/saket/TestAssignment/tree/master/libraries) package that can be manually attached to Android Studio.
