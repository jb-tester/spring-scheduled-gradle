# Spring Scheduled Debugger test

with the `org.springframework.boot:spring-boot-devtools` starter enabled the @Scheduled methods triggering fails,
both in Run and in Debug modes.
The events are triggered normally by Spring Boot itself.

If you remove the `org.springframework.boot:spring-boot-devtools` dependency, re-import the project with the Spring Boot Run Configuration re-creating, then the Scheduled Debugger starts working as expected