SETCONSOLE /minimize
rd /s /q bin
mkdir bin
javac -d bin -sourcepath src src\com\rahulmadbhavi\downloadmanager\controller\DownloadManager.java
java -cp bin com.rahulmadbhavi.downloadmanager.controller.DownloadManager
rd /s /q bin
