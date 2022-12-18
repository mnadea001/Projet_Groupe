# Projet_Groupe

# Matilde NADEAU - Arnaud BOYER - Djibril FALL

## Le projet :

Projet Morpion en Java JDK 19 avec test Unitaire JUNIT 5.

## Les Hooks :

## Les classes :

### Classe Main

Cette classe sert uniquemen à instancier un partie (Game). Dans une futur version du projet cette classe peut contenir toute un logique d'instanciation de player, le compte de point d'une partie à une autre voire d'un "tournoi" s'il y a plusieurs players.

### Classe Game

Contient toute la logique de jeu :

- Déroulement d'un round
- Utilisation de la classe Rules pour les conditions de victoires

### Classe Board

Contient le "dessin" d'une table de jeu et 9 instances de Cases. Le Tableau est mis à jour puis montrer à chaque tour dans le game grâce à sa fonction show().

### Classe Case

Une classe très simple mais assez puissante puisqu'elle permet non seulement de modifier le caractère contenu dans la case (caractère espace, X ou O) mais de tester si la case a déjà été jouée et de renvoyer une exception le cas échéant.

### Classe Rules

Une classe dédiée au test de victoire.
