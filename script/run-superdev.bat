@echo off
cd /d %~dp0\..\
start cmd /c mvn gwt:run
start cmd /c mvn generate-sources gwt:run-codeserver
start cmd /c mvn sass:watch
exit