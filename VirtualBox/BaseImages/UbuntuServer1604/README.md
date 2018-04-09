# Ubuntu Server 16.04 Setup

## Create Machine

### Open Oracle VM VirtualBox
<div>
	<div align="center">
		<img src="images/Image_01.png" />
	</div>
</div>

### Click on New in menu bar
<div>
	<div align="center">
		<img src="images/Image_02.png" />
	</div>
</div>

### Name the server
<div>
	<div align="center">
		<img src="images/Image_03.png" />
	</div>
</div>

### Set the memory allocated to machine
<div>
	<div align="center">
		<img src="images/Image_04.png" />
	</div>
</div>

### Create a virtual hard disk
<div>
	<div align="center">
		<img src="images/Image_05.png" />
	</div>
</div>

### Select virtual hard disk type
<div>
	<div align="center">
		<img src="images/Image_06.png" />
	</div>
</div>

### Set fixed size for virtual hard disk
<div>
	<div align="center">
		<img src="images/Image_07.png" />
	</div>
</div>

### Set size for virtual hard disk
<div>
	<div align="center">
		<img src="images/Image_08.png" />
	</div>
</div>

### Machine created
<div>
	<div align="center">
		<img src="images/Image_09.png" />
	</div>
</div>

### Click on machine settings
<div>
	<div align="center">
		<img src="images/Image_10.png" />
	</div>
</div>

### Settings dialog box
<div>
	<div align="center">
		<img src="images/Image_11.png" />
	</div>
</div>

### Modify network settings, select bridged adapter, set mac address
<div>
	<div align="center">
		<img src="images/Image_12.png" />
	</div>
</div>

### Modify storage settings, select optical drive
<div>
	<div align="center">
		<img src="images/Image_13.png" />
	</div>
</div>

### Select OS image
<div>
	<div align="center">
		<img src="images/Image_14.png" />
	</div>
</div>

### Click on OK
<div>
	<div align="center">
		<img src="images/Image_15.png" />
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

