# Arabic Analysis Plugin for Elasticsearch

Arabic Analysis plugin for Elasticsearch. It uses [lucene-arabic-analyzer](https://github.com/msarhan/lucene-arabic-analyzer) to extract arabic token roots.


## Features
- Normalizes input text by removing diacritics and Hamza-like characters
- Extracts word's roots.

## Components
- `arabic-root` analyzer

## Example

```
GET _analyze
{
  "analyzer": "arabic-root",
  "text": "اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ"
}

// Result:
['هدن','هدي','صرط','قوم']
```

## Configuration
This plugin is preconfigured with builtin normalization, stop-words and a stemmer  which is derived from [lucene-arabic-analyzer](https://github.com/msarhan/lucene-arabic-analyzer).

## Plugin in action
1. Build the plugin:
````
mvn clean package
````
2. Run Elasticsearch and install plugin inside a docker container:
````
docker compose up
````
3. Open `http://localhost:5601/` and login with `elastic/elastic` credentials.
4. Go to `Dev Tools` and examine the plugin:
````
GET _analyze
{
  "text": "اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ",
  "analyzer": "arabic-root"
}
````
