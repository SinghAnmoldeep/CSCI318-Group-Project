#!/usr/bin/env bash
set -e
docker compose up -d
mvn -q -DskipTests package
echo "Open 4 terminals and run:"
echo "  mvn -q -pl identity-service spring-boot:run     # 8083"
echo "  mvn -q -pl appointments-service spring-boot:run # 8081"
echo "  mvn -q -pl billing-service spring-boot:run      # 8082"
echo "  mvn -q -pl analytics-service spring-boot:run    # 8086"
