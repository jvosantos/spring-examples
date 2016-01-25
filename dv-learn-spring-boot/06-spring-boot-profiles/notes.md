# Property sources #

- - -

## Priority ##

1. Command Line arguments
2. JNDI attributes from `java:com/env`
3. Java System properties (`System.getProperties()`)
4. OS environment variables
5. A `RandomValuePropertySource` that only has properties in `random.*`.
6. Profile-specific application properties outside of your packaged jar (`application-{profile}.properties` and YAML variants)
7. Profile-specific application properties packaged inside your jar (`application-{profile}.properties` and YAML variants)
8. Application properties outside of your packaged jar (`application.properties` and YAML variants)
9. Application properties packaged inside your jar(`application.properties`) and YAML variants)
10. `@PropertySource` annotations on your `@Configuration` classes.
11. Default properties (specified using `SpringApplication.setDefaultProperties`).

- - - 

## Locations for application.properties ##

* A _/config_ subdir of the current directory
* The current directory
* A classpath /config package
* The classpath root

- - - 

## YAML ##

For example, the following YAML document:

```YAML
environments:
    dev:
        url: http://dev.bar.com
        name: Developer Setup
    prod:
        url: http://foo.bar.com
        name: My Cool App
```

Would be transformed into these properties:

```YAML
environments.dev.url=http://dev.bar.com
environments.dev.name=Developer Setup
environments.prod.url=http://foo.bar.com
environments.prod.name=My Cool App
```

## Configuration properties ##

Spring Boot allows mapping properties to POJOs

* @EnableConfigurationProperties
* @ConfigurationProperties
* Type Safe
* IDE Support
* Validation (@Valid)

