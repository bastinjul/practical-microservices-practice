FROM node:lts-iron

RUN mkdir -p /opt/app && chown node:node /opt/app

WORKDIR /opt/app

COPY --chown=node:node package.json package-lock.json ./
RUN npm ci --quiet
