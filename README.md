# rabbitmq-example
A little example of creating a Consumer and a Producer in the same project for RabbitMQ

This small project counts also with an example of how to separate properies in several properties files.

# IMPORTANT
To run this project, you have to have a RabbitMQ running, for my case, I made it with docker:

docker run -d —name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
