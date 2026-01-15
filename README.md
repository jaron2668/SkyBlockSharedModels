# Shared Models Library

A Java library for my Hypixel-Skyblock mod containing shared model classes.

---

## Overview

This library provides common data models used across different microservices to ensure consistency when serializing and deserializing messages exchanged via Kafka.

---

## Features

- Java model classes for Kafka message payloads
- Versioned and published to local Maven repository

---

## Getting Started

### Prerequisites

- Java 21

### Build and Install Locally

#### 1. Clone the repository

    git clone https://github.com/jaron2668/SkyblockSharedModels.git
    cd SkyblockSharedModels

#### 2. Build and install to local Maven repository for other microservices

```bash
    mvn clean install

## 🛑 Disclaimer

> This project is **not affiliated with, endorsed by, or associated with Hypixel Inc.**  
> "Hypixel" and any associated names are trademarks of Hypixel Inc.
>
> This is an independent, community-created project intended for educational or personal use only.
