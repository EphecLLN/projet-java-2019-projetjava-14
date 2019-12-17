Ozorai Tom <br>
Degives Florian <br>
Leveau Arnaud <br>
# CAHIER DES CHARGES :
## GROUPE 14
### TOUCHE-COULE-EXPLOSE
#### Contexte :
Dans le cadre du cours de développement informatique orienté objet, nous souhaitons créer
une application utilitaire ou un jeu en Java. Nous souhaitons également fonctionner avec
GitHub. <br>
#### Objectif :
Mettre en pratique nos connaissances en Java afin de créer une application fonctionnelle.
Utiliser nos connaissances en GitHub afin de créer une plateforme en ligne contenant le
projet et de pouvoir faire un travail collaboratif entre étudiants.
#### Contraintes :
- L’application doit respecter l’architecture MVC avec deux interfaces utilisateurs (une
interface console et une interface graphique, éventuellement web)
- L’application doit comporter une communication réseau.
- L’application doit utiliser au moins une structure de données du framework Java
Collection (HashMap, List, ...).
- Implémentation du code via GitHub. <br>
#### Description :
Nous souhaitons créer un jeux vidéo inspiré du célèbre jeu de société « touché-coulé ». Nous
allons cependant y a jouter des bonus rendant le jeu un peu plus complet.
Le jeu se joue à 2 l’un contre l’autre, les 2 joueurs commencent par placer leurs bateaux de
tailles différentes :
- 1 bateau de 5 cases
- 1 bateau de 4 cases
- 2 bateaux de 3 cases
- 1 bateau de 2 cases

Les joueurs sont libres de les placer verticalement ou horizontalement sur une grille de 10 x
10. <br>
Vient ensuite le tour de jeu, un joueur aléatoire commence par indiquer une ligne x de 1 à 10
et ensuite une colonne y 1 à 10. <br>
S’il touche un bateau, il y a touché et il recommence à choisir une case.<br>
S’il manque, il y a coulé et c’est à l’autre joueur de dire une position.<br>
Un bateau est coulé lorsque tout les cases ou il a été posé ont été touchées (2 cases pour le
bateau de 3, 3 pour celui de 3 cases, etc) <br>
Les bonus fonctionnent comme ceci : <br>
Si le joueur fait 2 touchés d’affilés, il obtient une bombe plus puissante de 2x2. <br>
S’il fait 3 touchés d’affilés, il obtient une croix de 3 de longueur et de largeur. <br>
La croix se positionne à partir du milieu et la bombe de 2x2 est positionné avec le coin en bas
à gauche.<br>
La partie se termine lorsque tous les bateaux d’un des joueurs sont coulés.<br>

