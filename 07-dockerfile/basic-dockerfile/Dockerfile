ARG IMAGE_VERSION
ARG IMAGE_NAME=centos

FROM ${IMAGE_NAME}:${IMAGE_VERSION}
ENV HTML_FOLDER=/usr/share/nginx/html
RUN mkdir -p $HTML_FOLDER && \
echo "<html><head><title>Halo World</title></head><body><h3>it's Works! ${IMAGE_NAME}:${IMAGE_VERSION} @ ${HTML_FOLDER}</h3></body></html>" > ${HTML_FOLDER}/index.html
RUN echo ${HTTP_PROXY} > $HTML_FOLDER/http-proxy.txt

ENTRYPOINT cat /usr/share/nginx/html/http-proxy.txt
# ENTRYPOINT cat /etc/redhat-release
