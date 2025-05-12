FROM node:18-alpine AS builder

WORKDIR /app

COPY . .

RUN npm install

EXPOSE 5173

CMD ["npm","run","dev"]


