#!/usr/bin/env bash
pkill -f "org.springframework.boot" || true
docker compose down || true
echo "All services stopped."
