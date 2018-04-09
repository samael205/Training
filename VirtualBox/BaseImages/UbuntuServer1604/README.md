# Ubuntu Server 16.04 Setup

## Create Machine

### Open Oracle VM VirtualBox
<div>
	<div align="center">
		<img src="images/Image_01.png" />
	</div>
</div>

## Update Server
```
sudo apt-get update
sudo apt-get upgrade -y
sudo apt-get dist-upgrade -y
```

## Install Java

### Download and Install Java
```
sudo apt-get update
sudo apt-get install software-properties-common -y
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java9-installer -y
sudo add-apt-repository --remove ppa:webupd8team/java -y
```

### Add to .bashrc
```
cd
echo '' >> .bashrc
echo 'export JAVA_HOME=/usr/lib/jvm/java-9-oracle' >> .bashrc
echo 'export PATH=$PATH:$JAVA_HOME/bin' >> .bashrc
source .bashrc
```

### Check Installation
```
java -version
javac -version
```

## Install Node.js
### Download and Install Node.js
```
sudo apt-get update
sudo apt-get install nodejs -y
sudo apt-get install npm -y
sudo ln -s `which nodejs` /usr/bin/node
```

### Check Installation
```
node -v
npm -v
```

