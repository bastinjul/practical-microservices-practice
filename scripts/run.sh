#!/bin/bash
PATH_TO_APP=$1
dos2unix mvnw
./mvnw spring-boot:run -pl "${PATH_TO_APP}" -Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005" &
while true; do
  inotifywait -e modify,create,delete,move -r "${PATH_TO_APP}/src/" && ./mvnw clean compile
done