# Organisation du projet

## Tâches 

### 🟢 Tâches faites

### 🟡 Tâches à revoir (bugs, améliorations à apporter)

### 🔴 Tâches à faire

- Ajout de packages
- IHM
- Relation mère-fille


# Code

## Relation mère-fille

### 1. Contrôleur

#### Responsabilités

Initialiser Metier et Vue
Faire passerelle des actions entre Metier et Vue

### 2. Métier

#### Metier.java

Démarrer le serveur (Parent.java)

#### Parent.java (Serveur)

Écoute les connexions des client.
Envoie une sous-image et une tâche à chaque client.
Récupère les sous-images traitées et les réassemble.

#### Child.java (Client)

Attend une connexion avec le parent.
Reçoit une sous-image et applique le traitement demandé.
Renvoie la sous-image traitée au parent.


### 3. Vue

Reçoit les données de Controleur et les met à jour