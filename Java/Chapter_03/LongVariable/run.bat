rd /s /q bin
mkdir bin
javac -d bin -sourcepath src src\Light.java
java -cp bin Light
pause
rd /s /q bin
