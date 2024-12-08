## Run:
```
mvnw clean spring-boot:run
```
## Test:
1. Run the DB-filling script
```
python3 ./scripts/data_gatherer/data_gatherer.py
```
This will fetch the countries from restcountries.com and populate the db by sending POST requests to 'localhost:8080/countries'

2. Hit the endpoint
```
curl localhost:8080/countries/<cca3_code>
```
If country with specified cca3 code exists this will result in an output of this sort:
```
{
   "code":"POL",
   "name":"Poland",
   "official_name":"Republic of Poland",
   "region":"Europe",
   "subregion":"Central Europe",
   "population":37950802,
   "currencies":[
      {
         "code":"PLN",
         "name":"Polish złoty",
         "symbol":"zł"
      }
   ],
   "languages":[
      {
         "code":"pol",
         "name":"Polish"
      }
   ],
   "timezones":[
      "UTC+01:00"
   ],
   "capital":[
      "Warsaw"
   ],
   "borders":[
      "BLR",
      "CZE",
      "DEU",
      "LTU",
      "RUS",
      "SVK",
      "UKR"
   ]
}
```

