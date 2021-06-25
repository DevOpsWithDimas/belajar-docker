## first stage
FROM node:16-alpine3.11 as builder

WORKDIR /sources
COPY package.json .
RUN npm install --prod

## second stage
FROM nginx

ENV HTML_FOLDER=/usr/share/nginx/html

LABEL maintaniner="software.dimas_m@icloud.com"
LABEL com.maryanto.dimas.image.authors="software.dimas_m@icloud.com"
LABEL com.maryanto.dimas.vendor="PT. Tabeldata Informatika"
LABEL version="1.8"

WORKDIR ${HTML_FOLDER}

COPY index.html .
COPY --from=builder /sources/node_modules node_modules/

CMD ["nginx", "-g", "daemon off;"]

HEALTHCHECK --interval=10s --timeout=3s --retries=1 --start-period=3s \
CMD curl -f http://localhost/ || exit 1
