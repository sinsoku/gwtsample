@echo off
cd /d %~dp0\..\
start cmd /c mvn gwt:run
start cmd /c mvn generate-sources gwt:run-codeserver
exit

