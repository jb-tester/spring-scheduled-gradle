# Spring Scheduled Debugger test
https://youtrack.jetbrains.com/issue/IDEA-353846
with the `org.springframework.boot:spring-boot-devtools` starter enabled the @Scheduled methods triggering fails,
both in Run and in Debug modes.
The events are triggered normally by Spring Boot itself.

If you remove the `org.springframework.boot:spring-boot-devtools` dependency, re-import the project with the Spring Boot Run Configuration re-creating, then the Scheduled Debugger starts working as expected

testing:
Try with File | Settings | Advanced Settings | Frameworks-Spring Boot | Run Using Gradle ON and OFF