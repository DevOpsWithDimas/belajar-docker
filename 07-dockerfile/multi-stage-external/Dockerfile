# first stage
FROM php:7.3-apache as php_composer

COPY --from=composer:latest /usr/bin/composer /usr/bin/composer


## second stage 
FROM node:14-alpine3.10 as node_install
WORKDIR /var/www/html
COPY package.json .
RUN npm install --prod

## third stage
FROM php_composer

ENV HTML_FOLDER=/var/www/html

LABEL maintaniner="software.dimas_m@icloud.com"
LABEL com.maryanto.dimas.image.authors="software.dimas_m@icloud.com"
LABEL com.maryanto.dimas.vendor="PT. Tabeldata Informatika"
LABEL version="2.0"

WORKDIR ${HTML_FOLDER}

COPY index.php .
COPY --from=node_install /var/www/html/node_modules node_modules

HEALTHCHECK --interval=10s --timeout=3s --retries=1 --start-period=3s \
CMD curl -f http://localhost/ || exit 1
