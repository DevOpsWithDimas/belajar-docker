ARG IMAGE_VERSION=7
ARG IMAGE_NAME=centos

FROM ${IMAGE_NAME}:${IMAGE_VERSION}

ENV HTML_FOLDER=/usr/share/nginx/html
# ENV POSTGRES_HOST=postgresdb
# ENV POSTGRES_USER=postgres

MAINTAINER "Dimas Maryanto <dimmaryanto@gmail.com>"
# LABEL maintainer="Dimas Maryanto <dimmaryanto@gmail.com>" org.vendor.name="PT. Tabeldata Informatika"
LABEL org.vendor.address="JL. Pratista No 17 Kab. Bandung"
LABEL version="1.4"

RUN groupadd www-data && \
adduser -r -g www-data www-data

USER www-data:www-data
WORKDIR ${HTML_FOLDER}

COPY --chown=www-data:www-data index.html .

RUN mkdir root
WORKDIR root
COPY index.html index.html

CMD pwd && ls -l ../ && ls -l .

