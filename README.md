# DI-Example

Benefits of Dependency Injection

1. Separation of Concerns
2. Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector component
3. Configurable components makes application easily extendable
4. Unit testing is easy with mock objects

Disadvantages of Dependency Injection

1. If overused, it can lead to maintenance issues because effect of changes are known at runtime
2. Dependency injection hides the service class dependencies that can lead to runtime errors that would have been caught at compile time.