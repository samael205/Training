rd /s /q bin
mkdir bin
javac -d bin -sourcepath src src\HelloWorld.java
java -cp bin HelloWorld
pause
rd /s /q bin
