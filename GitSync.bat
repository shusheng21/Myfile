@echo off

cd /d "%~dp1"

echo %cd%

git pull origin master

git add .

git commit -m "%date% %time%"

git push origin master