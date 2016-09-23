# bl4ckb0t

IRC-Bot for Java 8, made with PircBotX 2.1 | [See the bot in action](webchat.esper.net/?channels=bl4ckscor3) | Used libraries: [PircBotX](https://github.com/thelq/pircbotx), [HtmlUnitDriver](https://github.com/SeleniumHQ/htmlunit-driver), [JSoup](https://jsoup.org/), [Pushbullet library for Java 8](https://github.com/Sheigutn/pushbullet-java-8), some AOSP classes (see Apache-License part) and their dependencies.

[![Dependency Status](https://www.versioneye.com/user/projects/57e5039bbd6fa600512dfb56/badge.svg?style=flat)](https://www.versioneye.com/user/projects/560c145b5a262f001e00081d) [![Build Status](https://travis-ci.org/bl4ckscor3/bl4ckb0t.svg?branch=master)](https://travis-ci.org/bl4ckscor3/bl4ckb0t.svg)

Thanks to Lord_Ralex for help on the [restructure commit](http://github.com/bl4ckscor3/bl4ckb0t/commit/0703810f5870d2cdb7c678ff983671c2884fa7e9), he basically did the whole work :)

Additionally to the Maven dependencies, you have to download, and add to your build path, the latest **STANDALONE** version of [HtmlUnitDriver](https://github.com/SeleniumHQ/htmlunit-driver) to build the bot.

_Software used under the [Apache-License](https://github.com/bl4ckscor3/bl4ckb0t/blob/master/APACHELICENSE.md):_
- **Objects.java** from libcore (The Android Open Source Project)
- **EmptyArray.java** from libcore (The Android Open Source Project)
- **ArrayMap.java** from android (The Android Open Source Project)
- **ContainerHelper.java** from android (The Android Open Source Project)
- **MapCollections.java** from android (The Android Open Source Project)

Some of these classes have been slightly edited to ignore warnings eclipse shows and to adapt the packages they're placed in.
