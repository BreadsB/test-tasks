call runcrud.bat
if "%ERRORLEVEL%" == "0" goto runchrome
echo "Error at compiling runcrud.bat"
goto fail

:runchrome
echo "Running Chrome"
cd C:\Program Files\Google\Chrome\Application
start chrome.exe http://localhost:8080/crud/v1/tasks/
if "%ERRORLEVEL%" == "0" goto finish
echo "Couldn't run Chrome"
goto fail

:finish
echo.
echo "Everythins is done!"

:fail
echo.
echo "Errors occurred. Stopping program!"