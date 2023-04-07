# Architecture
Demonstration of CQRS using Apache Kafka as an event-store (the C in CQRS), elasticsearch as an eventually consistent data store for the Q in CQRS, and Spring Boot/Cloud for convenience and ["12 factorness."](https://12factor.net/)

![High Level Architecture](./elastic-kafka-spring.drawio.png "architecture")

# elastic-kafka-spring
You will need `docker-compose` and `make` to run the command to spin up instances of kafka and elasticsearch. 
```
make local # build local target
```
