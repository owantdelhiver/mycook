# Installation sous windows

## Prérequis
OS : windows 10

## Ubuntu
VM ubuntu 22.04 via windows store

``` 
sudo apt update 
sudo apt-get update
```

## vs code

```
sudo apt install apt-transport-https
sudo apt install code
```

## Java 17

```
sudo apt install openjdk-17-jdk openjdk-17-jre

```

## Maven 3.9

```
sudo apt install maven
```

## Git

```
sudo apt-get install git
```

Ajouter votre clé ssh dans votre projet si cela n'est pas déjà fait

```
ssh-keygen
```

## mysql 8.0

Dans le terminal linux
```
sudo apt install mysql-server
sudo systemctl start mysql.service

sudo mysql
```

Une fois connecter a la bdd, on crée une base de donnée "mycook" et un utilisateur.

```
CREATE DATABASE 'mycook';
CREATE USER 'mycook'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'mycook'@'localhost';
```

#### Installation de phpmyadmin pour avoir une connection bdd via navigateur

```
sudo apt install php libapache2-mod-php
sudo apt install phpmyadmin
```

http://localhost:80/phpmyadmin

Se connecter avec le user "mycook"

## Installation du projet

Certaines commandes ne sont pas à éxecuter selon votre environnement

```
cd ~/
mkdir dev
mkdir dev/source
cd dev/source
git clone git@github.com:owantdelhiver/mycook.git
```

Un dossier vient d'être créer "mycook" avec tout le code

```
cd mycook
```

Pour lancer le projet

```
./mvnw clean install
./mvnw spring-boot:run
```