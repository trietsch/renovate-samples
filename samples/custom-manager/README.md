# Custom manager

This directory represents a custom manager of type `regex`. The dependency it manages is outdated, as there is a new minor version (3.6.1) available at the time of writing (2024-01-25).

In order to see the dependencies it will update, make sure you've installed Renovate Bot locally on your machine, using:
```shell
npm i -g renovate
```

Then, run the following command:
```shell
LOG_LEVEL=DEBUG renovate --platform=local
```

This will result in quite a bit of logging, which you can see in the renovate-logs-local-run.log file. The relevant part is this:
```
DEBUG: packageFiles with updates (repository=local)
       "config": {
         "regex": [
           {
             "deps": [
               {
                 "depName": "org.apache.kafka:kafka_2.13",
                 "currentValue": "3.6.0",
                 "datasource": "maven",
                 "extractVersion": "^(?<version>\\d+\\.\\d+\\.\\d+)",
                 "replaceString": "kafka_version := 3.6.0\n",
                 "updates": [
                   {
                     "bucket": "non-major",
                     "newVersion": "3.6.1",
                     "newValue": "3.6.1",
                     "releaseTimestamp": "2023-11-24T10:33:43.000Z",
                     "newMajor": 3,
                     "newMinor": 6,
                     "updateType": "patch",
                     "branchName": "renovate/non-major-kafka"
                   }
                 ],
                 "packageName": "org.apache.kafka:kafka_2.13",
                 "versioning": "maven",
                 "warnings": [],
                 "registryUrl": "https://repo.maven.apache.org/maven2",
                 "homepage": "https://kafka.apache.org",
                 "currentVersion": "3.6.0",
                 "isSingleVersion": true,
                 "fixedVersion": "3.6.0"
               }
             ],
             "matchStrings": [
               "kafka_version\\s?:=\\s?(?<currentValue>\\d+\\.\\d+\\.\\d+)\\n"
             ],
             "depNameTemplate": "org.apache.kafka:kafka_2.13",
             "datasourceTemplate": "maven",
             "extractVersionTemplate": "^(?<version>\\d+\\.\\d+\\.\\d+)",
             "packageFile": "Makefile"
           }
         ]
       }
```

In the `updates` section, you can see that it found the new version `3.6.1`, which in a normal Renovate run (on the actual platform), will result in a PR.
