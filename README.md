# Myriad Test Project

## Accès à la base de données H2 (pour les tests)

1. Accéder à la console H2 en utilisant le lien suivant : [http://localhost:8080/h2-console](http://localhost:8080/h2-console).

2. Assurez-vous de configurer le champ "JDBC URL" avec la valeur suivante : `jdbc:h2:file:./src/main/resources/data`.

3. Utilisez le mot de passe : `password`.

## Exécution du projet

1. Pour exécuter le projet, ouvrez le fichier `com/myriad/myriadTest/MyriadTestApplication.java`.

2. Recherchez l'icône de lecture (flèche verte) à côté de la méthode `main`, ou cliquez avec le bouton droit de la souris et sélectionnez "Run".

## Appel de la fonction d'enregistrement

Vous pouvez utiliser un outil comme Insomnia ou Postman pour créer un nouvel utilisateur en utilisant l'endpoint suivant : [http://localhost:8081/api/auth](http://localhost:8081/api/auth).

Exemple de corps de la requête :

```json
{
    "username": "zola",
    "birthdate": "1999-05-15",
    "countryofresidence": "France",
    "number": "+3334567890",
    "gender": "Male"
}
```
## Consultation des détails des utilisateurs

Pour afficher les détails d'un utilisateur spécifique, accédez à l'URL : http://localhost:8081/api/users/{userId}.

Pour afficher la liste de tous les utilisateurs, accédez à l'URL : http://localhost:8081/api/users/all.