#!/bin/bash

echo "🐳 Parando container antigo..."
docker stop docker-study 2>/dev/null
docker rm docker-study 2>/dev/null

echo "🔨 Construindo imagem..."
docker build -t docker-study .

echo "🚀 Iniciando container..."
docker run -p 8080:8080 docker-study
