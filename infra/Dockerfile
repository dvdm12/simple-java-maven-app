FROM jenkins/jenkins:lts

USER root

# Instala dependencias necesarias
RUN apt-get update && apt-get install -y \
    docker.io \
    git \
    maven \
    curl \
    && rm -rf /var/lib/apt/lists/*

# Permite que Jenkins use Docker CLI del host
RUN usermod -aG docker jenkins

USER jenkins
