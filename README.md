# mycook

## Prérequis
OS : windows 10

## Outils
VM ubuntu via windows store

``` 
sudo apt update 
sudo apt-get update
```

installer code, java 17, maven 3.9, git, 

### mysql 8.0

Dans le terminal linux
```
sudo apt update
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
