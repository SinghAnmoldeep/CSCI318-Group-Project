# CareFlow (CSCI318) — No‑Error Pack

## Ports
- identity-service: 8083
- appointments-service: 8081
- billing-service: 8082
- analytics-service: 8086

## Run
```bash
docker compose up -d
mvn -q -DskipTests package

# in four terminals:
mvn -q -pl identity-service spring-boot:run
mvn -q -pl appointments-service spring-boot:run
mvn -q -pl billing-service spring-boot:run
mvn -q -pl analytics-service spring-boot:run
```

## Test
```bash
bash scripts/seed.sh
# then visit:
http://localhost:8086/api/analytics/status-counts
```
