# Debate RAG Service

A simple service for retreiving information that corresponds to a certain input according to either the DNC or the GOP 2024 platform document.

This was created as a demo for a [debate tool](https://github.com/jzelAdmin2006/ollama-debate-PoC) used as an experiment in my general eduction in-depth project.

## Vector Database

The service uses pgvector. Use the following command to start an instance that can be used by this service:
```bash
docker run -e POSTGRES_PASSWORD=admin -it -p 5432:5432 pgvector/pgvector:0.6.2-pg15
```
