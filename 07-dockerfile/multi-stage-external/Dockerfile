FROM php:7.3-apache

ENV HTML_FOLDER=/var/www/html

LABEL maintaniner="software.dimas_m@icloud.com"
LABEL com.maryanto.dimas.image.authors="software.dimas_m@icloud.com"
LABEL com.maryanto.dimas.vendor="PT. Tabeldata Informatika"
LABEL version="1.9"

WORKDIR ${HTML_FOLDER}

COPY index.php .
COPY --from=composer:latest /usr/bin/composer /usr/bin/composer

HEALTHCHECK --interval=10s --timeout=3s --retries=1 --start-period=3s \
CMD curl -f http://localhost/ || exit 1
