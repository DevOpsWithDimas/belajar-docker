FROM centos:7
ENV HTML_FOLDER=/usr/share/nginx/html

RUN mkdir -p $HTML_FOLDER && \
echo "<html><head><title>Halo World</title></head><body><h3>it's Works!</h3></body></html>" > ${HTML_FOLDER}/index.html
ENTRYPOINT cat /usr/share/nginx/html/index.html
