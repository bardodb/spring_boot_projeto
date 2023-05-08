FROM ubuntu:latest
LABEL authors="bsins"

ENTRYPOINT ["top", "-b"]