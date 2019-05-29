# spring-advanced-mq-client

This library is designed to facilitate usage of message queue systems w/ spring

planned feature include:

- JTA/XA transaction support for MQ systems that don't support it (AWS SQS, Anypoint MQ)
- Alternative persistence fallbacks if remote broker isn't available / working.
- More user-friendly listener annotation support than spring jms
- Simple DB-based queueing system for non-distributed servers.
