[comment]: # (AOP - Breaking a program into logical distinct parts called concerns)
[comment]: # (A function that's called in several points of an application is called crosscutting concern)
[comment]: # (types of aspects:)
[comment]: # (* logging)
[comment]: # (* auditing)
[comment]: # (* transactions)
[comment]: # (* security)
[comment]: # (* caching)
[comment]: # (|                     |   OOP     |   AOP    |)
[comment]: # (|---------------------|-----------|----------|)
[comment]: # (| unit of modularity  |   class   |   aspect |)

# Begin

## Index ##

* [Terminology](#terminology)
  * [Aspect](#aspect)
  * [Join point](#join-point)
  * [Advice](#advice)
  * [Pointcut](#pointcut)
  * [Introduction](#introduction)
  * [Target object](#target-object)
  * [Weaving](#weaving)
* [Implementations](#implementations)
  * [Spring AOP](#spring-aop)

## Terminology ##

### Aspect ###
A module

Examples of aspects:
 * Logging
 * Security
 * Caching

### Join point ###

A point to plug in an aspect

### Advice ###

An action to be taken

types of advice:
  * before - run advice before a method execution
  * after - run advice after a method execution regardless of its outcome
  * after-returning - run advice after a method execution only if method completes successfully
  * after-throwing - run advice after a method execution only if method exits by throwing an exception
  * around - run advice before and after advised method is invoked

### Pointcut ###

A set of joint points

#### Pointcut expressions ####

An example of a pointcut expression is the following: `execution(* com.jvosantos.examples.services.MessagePrinter.printMessage(..))`

The `*` means that the method can be of any modified, i.e., public/private/protected/default

The `..` means that it will match to any number of arguments

There is only the need to use the fully qualified name if the method is on an object outside of the aspect package

It's possible to match several methods using the wildcard `*`. For instance `execution(* com.jvosantos.examples.services.MessagePrinter.*(..))` will match all methods of MessagePrinter with any arguments.

It's also possible to refine by parameters, for instance `execution(* com.jvosantos.examples.services.MessagePrinter.printMessage(String, ..))` will match all methods named printMessage that have as the first parameter a String.

It's also possible to refine by modifier access, for instance `execution(public com.jvosantos.examples.services.MessagePrinter.printMessage(String, ..))` will match all methods named printMessage that have as the first parameter a String and are public.

The following expression will match all methods on all classes with any modifiers and any arguments `execution(* *.*(..))`

### Introduction ###

Add a method or attribute to existing classes

### Target object ###

An object being advised or the target of an advice

### Weaving ###

Process of linking aspects with other applications or objects

## Implementations

### Spring AOP ###

Spring implementation of aspects uses behind the scenes the [proxy design pattern](https://en.wikipedia.org/wiki/Proxy_pattern)

A proxy, in its most general form, is a class functioning as an interface to something else. The proxy could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or impossible to duplicate. In short, a proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes.



