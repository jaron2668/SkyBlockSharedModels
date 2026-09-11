# SkyBlock Shared Models

This library contains the Java model classes shared by the backend services for my Hypixel SkyBlock mod. It defines the objects used when auction and flip data is serialized to or deserialized from Kafka messages.

## Contents

The library currently includes models for auctions, items, weapons, tools, armor, pets, enchantments, gemstones, and flips. It is deliberately limited to data models and small model-related utilities; it does not connect to Kafka or PostgreSQL.

## Requirements

-   Java 21
-   Maven

## Build and install

The updater and flipper services use this artifact as a local Maven dependency. Run the following command from this directory:

```bash
mvn clean install
```

The current version is `1.0-SNAPSHOT`, with coordinates:

```text
io.github.jaron2668:SkyBlockSharedModels:1.0-SNAPSHOT
```

## License

See [LICENSE.txt](LICENSE.txt).

## Disclaimer

This project is not affiliated with, endorsed by, or associated with Hypixel Inc. "Hypixel" and related names are trademarks of Hypixel Inc. This is an independent community project intended for educational and personal use.
