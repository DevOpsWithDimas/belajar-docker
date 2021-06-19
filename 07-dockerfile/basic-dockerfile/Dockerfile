ARG IMAGE_VERSION=7
ARG IMAGE_NAME=centos

FROM ${IMAGE_NAME}:${IMAGE_VERSION}
ENV HTML_FOLDER=/usr/share/nginx/html
RUN yum install tree -y

RUN mkdir -p $HTML_FOLDER

# COPY index?.html ${HTML_FOLDER}/
# ADD https://github.com/BootcampYoutubeChannel/belajar-docker/archive/refs/tags/07b-copy-resource.tar.gz ${HTML_FOLDER}/

# ADD belajar-docker-07b-copy-resource.tar.gz ${HTML_FOLDER}/
COPY . ${HTML_FOLDER}

ENTRYPOINT tree /usr/share/nginx/html
# ENTRYPOINT cat /etc/redhat-release
