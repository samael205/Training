# Ubuntu Server 16.04 Setup

## Create Machine

### Download Ubuntu Server [Click here](https://www.ubuntu.com/download/alternative-downloads)
<div>
	<div align="center">
		<img src="images/Image_01.png" />
	</div>
</div>

### Use Transmission to Download File
<div>
	<div align="center">
		<img src="images/Image_02.png" />
	</div>
</div>

### Click Open
<div>
	<div align="center">
		<img src="images/Image_03.png" />
	</div>
</div>

### Open Oracle VM VirtualBox
<div>
	<div align="center">
		<img src="images/Image_04.png" />
	</div>
</div>

### Click on New in menu bar
<div>
	<div align="center">
		<img src="images/Image_05.png" />
	</div>
</div>

### Name the server
<div>
	<div align="center">
		<img src="images/Image_06.png" />
	</div>
</div>

### Set the memory allocated to machine
<div>
	<div align="center">
		<img src="images/Image_07.png" />
	</div>
</div>

### Create a virtual hard disk
<div>
	<div align="center">
		<img src="images/Image_08.png" />
	</div>
</div>

### Select virtual hard disk type
<div>
	<div align="center">
		<img src="images/Image_09.png" />
	</div>
</div>

### Set fixed size for virtual hard disk
<div>
	<div align="center">
		<img src="images/Image_10.png" />
	</div>
</div>

### Set size for virtual hard disk
<div>
	<div align="center">
		<img src="images/Image_11.png" />
	</div>
</div>

### Machine created
<div>
	<div align="center">
		<img src="images/Image_12.png" />
	</div>
</div>

### Click on machine settings
<div>
	<div align="center">
		<img src="images/Image_13.png" />
	</div>
</div>

### Settings dialog box
<div>
	<div align="center">
		<img src="images/Image_14.png" />
	</div>
</div>

### Modify network settings, select bridged adapter, set mac address
<div>
	<div align="center">
		<img src="images/Image_15.png" />
	</div>
</div>

### Modify storage settings, select optical drive
<div>
	<div align="center">
		<img src="images/Image_16.png" />
	</div>
</div>

### Select OS image
<div>
	<div align="center">
		<img src="images/Image_17.png" />
	</div>
</div>

### Click on OK
<div>
	<div align="center">
		<img src="images/Image_18.png" />
	</div>
</div>

### Start the Virtual Machine
<div>
	<div align="center">
		<img src="images/Image_19.png" />
	</div>
</div>

### Select Language
<div>
	<div align="center">
		<img src="images/Image_20.png" />
	</div>
</div>

### Select Install Ubuntu Server
<div>
	<div align="center">
		<img src="images/Image_21.png" />
	</div>
</div>

### Select Language
<div>
	<div align="center">
		<img src="images/Image_22.png" />
	</div>
</div>

### Select Location
<div>
	<div align="center">
		<img src="images/Image_23.png" />
	</div>
</div>

### Configure Keyboard
<div>
	<div align="center">
		<img src="images/Image_24.png" />
	</div>
</div>

### Enter a Hostname
<div>
	<div align="center">
		<img src="images/Image_25.png" />
	</div>
</div>

### Enter full name for user
<div>
	<div align="center">
		<img src="images/Image_26.png" />
	</div>
</div>

### Enter Username
<div>
	<div align="center">
		<img src="images/Image_27.png" />
	</div>
</div>

### Enter Password
<div>
	<div align="center">
		<img src="images/Image_28.png" />
	</div>
</div>

### Re-enter Password
<div>
	<div align="center">
		<img src="images/Image_29.png" />
	</div>
</div>

### If Password is weak, following prompt is displayed, you can choose to ignore this warning
<div>
	<div align="center">
		<img src="images/Image_30.png" />
	</div>
</div>

### Encrypt home directory if required
<div>
	<div align="center">
		<img src="images/Image_31.png" />
	</div>
</div>

### Configure clock
<div>
	<div align="center">
		<img src="images/Image_32.png" />
	</div>
</div>

### Partition Disks, Prompt 1
<div>
	<div align="center">
		<img src="images/Image_33.png" />
	</div>
</div>

### Partition Disks, Prompt 2
<div>
	<div align="center">
		<img src="images/Image_34.png" />
	</div>
</div>

### Partition Disks, Prompt 3
<div>
	<div align="center">
		<img src="images/Image_35.png" />
	</div>
</div>

### Enter HTTP Proxy Information
<div>
	<div align="center">
		<img src="images/Image_36.png" />
	</div>
</div>

### Configure Automatic Updates
<div>
	<div align="center">
		<img src="images/Image_37.png" />
	</div>
</div>

### Select Softwares
<div>
	<div align="center">
		<img src="images/Image_38.png" />
	</div>
</div>

### Install GRUB Loader
<div>
	<div align="center">
		<img src="images/Image_39.png" />
	</div>
</div>

### Finish Installation
<div>
	<div align="center">
		<img src="images/Image_40.png" />
	</div>
</div>

### Login to Machine
<div>
	<div align="center">
		<img src="images/Image_41.png" />
	</div>
</div>

### Machine Running
<div>
	<div align="center">
		<img src="images/Image_42.png" />
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

