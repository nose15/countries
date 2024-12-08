import json
import requests

URL = "http://localhost:8080/countries"

with open("data.json", "r") as file:
    data = json.load(file)
    for entry in data:
        new_currencies = []
        for key, val in entry["currencies"].items():
            new_currencies.append({
                "code": key,
                "name": val["name"],
                "symbol": val["symbol"],
            })

        new_languages = []
        for key, val in entry["languages"].items():
            new_languages.append({
                "code": key,
                "name": val,
            })

        reqBody = {
            "code": entry["cca3"], 
            "name": entry["name"]["common"],
            "official_name": entry["name"]["official"],
            "region": entry["region"],
            "subregion": entry["subregion"],
            "capital": entry["capital"],
            "borders": entry["borders"],
            "population": entry["population"],
            "currencies": new_currencies,
            "languages": new_languages,
            "timezones": list(map(lambda x: {"code": x}, entry["timezones"])),
        }

        print(reqBody)
        res = requests.post(url=URL, data=json.dumps(reqBody), headers={'content-type': 'application/json'})
        print(res)
    file.close()

    
