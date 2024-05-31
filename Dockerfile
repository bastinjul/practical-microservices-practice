FROM bellsoft/liberica-openjdk-alpine-musl:21
RUN apk update && apk upgrade && apk --no-cache add inotify-tools dos2unix
WORKDIR $HOME