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
```bash
$ mvn gwt:run
```

Eclipseでプロジェクトをインポートする
--------------------------------------
```bash
$ mvn eclipse:eclipse
$ mvn gwt:eclipse
```
