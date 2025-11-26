#!/bin/bash

echo "🐳 Stopping old container..."
docker stop docker-study 2>/dev/null
docker rm docker-study 2>/dev/null

echo "🔨 Building image..."
docker build -t docker-study .

echo "🚀 Starting container..."
docker run -p 8080:8080 docker-study
