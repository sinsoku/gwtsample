GWT Sample
===========

[![Build Status](https://buildhive.cloudbees.com/job/sinsoku/job/gwtsample/badge/icon)](https://buildhive.cloudbees.com/job/sinsoku/job/gwtsample/)

�v���W�F�N�g�̍쐬���@
-----------------------
```bash
$ mvn archetype:generate \
  -DarchetypeGroupId=org.codehaus.mojo \
  -DarchetypeArtifactId=gwt-maven-plugin \
  -DarchetypeVersion=2.5.0
```

�N�����@
---------
**Development Mode**
```bash
$ mvn gwt:run
```
�����`���[�N����A "Launch Default Browser" ���� GWT Application �̓�����m�F�ł���B

**Super Dev Mode**
```bash
$ mvn compile run:codeserver
```
super dev mode �̏ꍇ�A�ʓr development mode ���N��������K�v������B
�N����A���ꂼ�ꉺ�L��URL�� GWT Application �̓�����m�F�ł���B

* GWT App in development mode: http://127.0.0.1:8888/
* code server: http://localhost:9876/

Eclipse�Ńv���W�F�N�g���C���|�[�g����
--------------------------------------
```bash
$ mvn eclipse:eclipse
$ mvn gwt:eclipse
```
