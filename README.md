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
sudo mysql
```

Une fois connecter a la bdd, on crée une base de donnée "mycook" et un utilisateur.

```
CREATE DATABASE 'mycook';
CREATE USER 'mycook'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'mycook'@'localhost';
```