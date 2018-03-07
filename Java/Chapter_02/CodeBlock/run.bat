rd /s /q bin
mkdir bin
javac -d bin -sourcepath src src\CodeBlock.java
java -cp bin CodeBlock
pause
rd /s /q bin
