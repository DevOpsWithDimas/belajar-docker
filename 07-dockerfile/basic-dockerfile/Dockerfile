ARG IMAGE_VERSION=7
ARG IMAGE_NAME=centos

FROM ${IMAGE_NAME}:${IMAGE_VERSION}

ENV HTML_FOLDER=/usr/share/nginx/html
# ENV POSTGRES_HOST=postgresdb
# ENV POSTGRES_USER=postgres

MAINTAINER "Dimas Maryanto <dimmaryanto@gmail.com>"
# LABEL maintainer="Dimas Maryanto <dimmaryanto@gmail.com>" org.vendor.name="PT. Tabeldata Informatika"
LABEL org.vendor.address="JL. Pratista No 17 Kab. Bandung"
LABEL version="1.6"

RUN yum install epel-release -y && \
yum install nginx -y

WORKDIR ${HTML_FOLDER}

COPY index.html .

CMD ["nginx", "-g", "daemon off;"]

HEALTHCHECK --interval=20s --timeout=3s --retries=1 --start-period=3s \
CMD curl -f http://localhost/ || exit 1
