
# ZooKeeper Cluster

## Clone Ubuntu Server 16.04 Base with Java, NodeJS
1. Right click on machine and select clone.
2. Name the node as ```UbuntuServer1604 Cluster Node 1```.
3. Click on next.
4. Select full clone and click Clone button.
5. Update MAC Address if required.

## Update Hosts File
1. Open hosts file.
	```
	sudo nano /etc/hosts
	```
2. Add cluster machines to file.
	```
	192.168.1.211	node01
	192.168.1.212	node02
	192.168.1.213	node03
	192.168.1.214	node04
	```

## Download ZooKeeper
```
# Create Folders
mkdir -p $HOME/softwares/download/apache/zookeeper
mkdir -p $HOME/softwares/installation/apache

# Download ZooKeeper
cd $HOME/softwares/download/apache/zookeeper
wget http://www-us.apache.org/dist/zookeeper/zookeeper-3.4.11/zookeeper-3.4.11.tar.gz

# Unpack Tar File
tar -xf zookeeper-3.4.11.tar.gz -C .
mv zookeeper-3.4.11 zookeeper
mv zookeeper $HOME/softwares/installation/apache
```

## Add ZOOKEEPER_HOME to .bashrc
```
cd
echo '' >> .bashrc
echo 'export ZOOKEEPER_HOME='"$HOME"'/softwares/installation/apache/zookeeper' >> .bashrc
source .bashrc
```

## Create Folders required for ZooKeeper
```
mkdir -p $HOME/softwares/installation/apache/zookeeper/data
mkdir -p $HOME/softwares/installation/apache/zookeeper/logs
```

## Create Configuration File
```
# Create File
touch $ZOOKEEPER_HOME/conf/zoo.cfg

# Add content to file
echo 'tickTime=2000' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'dataDir='"$HOME"'/softwares/installation/apache/zookeeper/data' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'dataLogDir='"$HOME"'/softwares/installation/apache/zookeeper/logs' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'clientPort=2181' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'initLimit=5' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'syncLimit=2' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'server.1=192.168.1.211:2888:3888' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'server.2=192.168.1.212:2888:3888' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'server.3=192.168.1.213:2888:3888' >> $ZOOKEEPER_HOME/conf/zoo.cfg
echo 'server.4=192.168.1.214:2888:3888' >> $ZOOKEEPER_HOME/conf/zoo.cfg
```

## Create More Machines
1. Shutdown the first virtual machine.
2. Make three more copies of the first virtual machine.
3. Modify the MAC address of the three newly created machines.
4. Start all instances.

## Create myid File
### Create File
```
touch $HOME/softwares/installation/apache/zookeeper/data/myid
```
### Write ID to File
1. Node 1
	```
	sh  -c  "echo '1' > $HOME/softwares/installation/apache/zookeeper/data/myid"
	```
2. Node 2
	```
	sh  -c  "echo '2' > $HOME/softwares/installation/apache/zookeeper/data/myid"
	```
3. Node 3
	```
	sh  -c  "echo '3' > $HOME/softwares/installation/apache/zookeeper/data/myid"
	```
4. Node 4
	```
	sh  -c  "echo '4' > $HOME/softwares/installation/apache/zookeeper/data/myid"
	```

## ZooKeeper Commands
1. ZooKeeper Start
	```
	$ZOOKEEPER_HOME/bin/zkServer.sh start
	```
2. ZooKeeper Status
	```
	$ZOOKEEPER_HOME/bin/zkServer.sh status
	```
3. ZooKeeper Stop
	```
	$ZOOKEEPER_HOME/bin/zkServer.sh stop
	```
