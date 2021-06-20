ARG IMAGE_VERSION=7
ARG IMAGE_NAME=centos

FROM ${IMAGE_NAME}:${IMAGE_VERSION}

ENV HTML_FOLDER=/usr/share/nginx/html
# ENV POSTGRES_HOST=postgresdb
# ENV POSTGRES_USER=postgres

MAINTAINER "Dimas Maryanto <dimmaryanto@gmail.com>"
# LABEL maintainer="Dimas Maryanto <dimmaryanto@gmail.com>" org.vendor.name="PT. Tabeldata Informatika"
LABEL org.vendor.address="JL. Pratista No 17 Kab. Bandung"
LABEL version="1.1"

RUN yum install epel-release -y && \
yum install nginx -y && \
yum clean all

RUN sed -i "s|80|8080|g" /etc/nginx/nginx.conf

COPY index.html ${HTML_FOLDER}/index.html

ENTRYPOINT ["nginx", "-g", "daemon off;"]
EXPOSE 8080/tcp
