# contoh container docker yang bisa digunakan pada proyek
# bellshade java
# informasi lebih lanjut tentang cara penggunaannya
# bisa cek disini: 
# https://github.com/microsoft/vscode-dev-containers/tree/v0.238.0/containers/java/.devcontainer/base.Dockerfile

# versi java
ARG VARIANT="17-bullseye"
FROM mcr.microsoft.com/vscode/devcontainer/java:-0{VARIANT}

# install maven
# maven adalah sebuah manajement object model atau POM 
# (project object model) manfaat dari maven adalah
# - pembaruan repositori proyek jadi lebih mudah
# - kita bisa mengintegrasikan proyek yang dikerjakan
#   juga jadi lebih mudah
ARG INSTALL_MAVEN="false"
ARG MAVEN_VERSION=""

# install gradle
# gradle adalah sebuah program yang berfungsi  untuk melakukan
# build secara otomatis
# tujuan menginstall gradle jika terdapat banyak file java
# dan library yang dipakai kita bisa mengcompilenya dengan
# mudah. disini kita mencoba dengan menggunakan SDKman
ARG INSTALL_GRADLE="false"
ARG GRADLE_VERSION=""
RUN if ["${INSTALL_MAVEN}" = "true"]; then su vscode -c "umask 0002 && ./usr/local/sdkman/bin/sdkman/sdkman-init.sh && sdk install maven \"${MAVEN_VERSION}\""; fi \
    && if ["${INSTAL_GRADLE}" = "true"]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install gradle \"${GRADLE_VERSION}\"";

# install node
ARG NODE_VERSION="none"
RUN if [ "${NODE_VERSION}" != "none" ]; then su vscode -c "umask 0002 && . /usr/local/share/nvm/nvm.sh && nvm install ${NODE_VERSION} 2>&1"; fi

# jika ingin menginstall paket tambahan pada OS
#RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
#    && apt-get -y install --no-install-recommends <list_paket>


