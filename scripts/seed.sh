#!/usr/bin/env bash
set -e
# create user (8083)
curl -s -X POST http://localhost:8083/api/users -H 'Content-Type: application/json'   -d '{"email":"p1@example.com","role":"PATIENT"}' | jq . || true

# create appointment (8081)
curl -s -X POST http://localhost:8081/api/appointments -H 'Content-Type: application/json'   -d '{"patientId":"p-001","clinicianId":"c-101","startTime":"2025-10-06T10:30:00Z"}' | jq . || true

# confirm appointment id=1 (8081)
curl -s -X POST http://localhost:8081/api/appointments/1/confirm | jq . || true

# create invoice (8082)
curl -s -X POST http://localhost:8082/api/invoices -H 'Content-Type: application/json'   -d '{"appointmentId":1,"amount":120.0}' | jq . || true

# read analytics counts (8086)
curl -s http://localhost:8086/api/analytics/status-counts | jq . || true
