rd /s /q bin
mkdir bin
javac -d bin -sourcepath src src\com\rahulmadbhavi\training\JButtonDemo.java
javaw.exe -Djava.security.policy=java.policy.applet -classpath bin sun.applet.AppletViewer Demo.applet
rd /s /q bin