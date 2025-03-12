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

Le contrôleur va gérer l'interaction entre la vue et le modèle (Master, NetworkManager).

#### Responsabilités

- Démarrer le serveur (Maître).
- Gérer l’envoi de l’image et des tâches aux esclaves.
- Récupérer et mettre à jour l’image après traitement.


### 2. Métier

Le modèle est responsable du découpage de l’image, de la gestion des sockets et du traitement distribué.

#### Parent.java (Serveur)

Écoute les connexions des esclaves.
Envoie une sous-image et une tâche à chaque esclave.
Récupère les sous-images traitées et les réassemble.

#### Child.java (Client)

Attend une connexion avec le maître.
Reçoit une sous-image et applique le traitement demandé.
Renvoie la sous-image traitée au maître.