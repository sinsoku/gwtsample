GWT Sample
===========

[![Build Status](https://buildhive.cloudbees.com/job/sinsoku/job/gwtsample/badge/icon)](https://buildhive.cloudbees.com/job/sinsoku/job/gwtsample/)

プロジェクトの作成方法
-----------------------
```bash
$ mvn archetype:generate \
  -DarchetypeGroupId=org.codehaus.mojo \
  -DarchetypeArtifactId=gwt-maven-plugin \
  -DarchetypeVersion=2.5.0
```

起動方法
---------
**Development Mode**
```bash
$ mvn gwt:run
```
ランチャー起動後、 "Launch Default Browser" から GWT Application の動作を確認できる。

**Super Dev Mode**
```bash
$ mvn generate-sources run:codeserver
```
super dev mode の場合、別途 development mode を起動させる必要がある。

起動後、それぞれ下記のURLで GWT Application の動作を確認できる。

* GWT App in development mode: <http://127.0.0.1:8888/>
* code server: <http://localhost:9876/>

Eclipseでプロジェクトをインポートする
--------------------------------------
```bash
$ mvn eclipse:eclipse
$ mvn gwt:eclipse
```
