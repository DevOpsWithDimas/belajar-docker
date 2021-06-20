ARG IMAGE_VERSION=7
ARG IMAGE_NAME=centos

FROM ${IMAGE_NAME}:${IMAGE_VERSION}

# ENV POSTGRES_HOST=postgresdb
# ENV POSTGRES_USER=postgres

MAINTAINER "Dimas Maryanto <dimmaryanto@gmail.com>"
# LABEL maintainer="Dimas Maryanto <dimmaryanto@gmail.com>" org.vendor.name="PT. Tabeldata Informatika"
LABEL org.vendor.address="JL. Pratista No 17 Kab. Bandung"
LABEL version="0.10"

RUN yum install epel-release -y && \
yum install nginx -y && \
yum clean all

ENTRYPOINT ["nginx", "-g", "daemon off;"]
