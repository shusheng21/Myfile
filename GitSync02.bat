@echo off
cd /d "%~dp0"
echo 当前目录: %cd%
echo 正在从GitHub仓库拉取更新...
git pull origin master
if errorlevel 1 (
echo 错误: 拉取失败！
pause
exit /b 1
)
echo 正在添加所有更改...
git add .
if errorlevel 1 (
echo 错误: 添加文件失败！
pause
exit /b 1
)
echo 正在提交更改...
git commit -m "%date% %time%"
if errorlevel 1 (
echo 提示: 没有要提交的更改。
) else (
echo 提交成功！
)
echo 正在推送到GitHub仓库...
git push origin master
if errorlevel 1 (
echo 错误: 推送失败！
pause
exit /b 1
)
echo.
echo ========================================
echo 执行成功！
echo ========================================
echo.
echo 所有操作已完成，笔记已成功同步到GitHub。
echo.
pause