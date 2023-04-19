# Activité N°1 Part 1 : Mise en oeuvre de l'injection des dépendances

#### Architecture du projet :
<img width="505" alt="Screen1" src="https://user-images.githubusercontent.com/106871413/232954757-6485d6c8-3851-4d53-8ef5-cd4292eb51f1.png">
- Le package dao contient l'interface IDao et la classe DaoImpl qui implémente cette interface :
<img width="214" alt="Screen2" src="https://user-images.githubusercontent.com/106871413/232954968-f404a5da-dd4e-424b-a5b2-1fe7a78befe6.png">
<img width="208" alt="Screen3" src="https://user-images.githubusercontent.com/106871413/232955195-e2ee7529-393a-40f0-b565-1a363e48a3b0.png">
<img width="474" alt="Screen4" src="https://user-images.githubusercontent.com/106871413/232955220-5a1b7254-3837-49f7-abb3-18fad7938224.png">
- Le package ext contient les classes DaoImpl2 et DaoImplVWS :
<img width="214" alt="Screen5" src="https://user-images.githubusercontent.com/106871413/232955299-a4f61547-104c-48b1-a459-e8bcd11315a7.png">
<img width="601" alt="Screen6" src="https://user-images.githubusercontent.com/106871413/232955386-09c836f0-2124-42ff-a89f-c88af6059084.png">
<img width="389" alt="Screen7" src="https://user-images.githubusercontent.com/106871413/232955442-61c4c398-0ee6-4ca8-9c14-6d698ae4bf26.png">
- Le package metier contient l'interface IMetier et la classe MetierImpl qui implémente cette interface :
<img width="210" alt="Screen8" src="https://user-images.githubusercontent.com/106871413/232955502-6c375200-5f53-4be9-bd5e-586e4f194471.png">
<img width="258" alt="Screen9" src="https://user-images.githubusercontent.com/106871413/232955522-9cecf6cc-eef8-4430-9825-9518cfb71e8d.png">
<img width="413" alt="10" src="https://user-images.githubusercontent.com/106871413/232955563-c15a2de0-c941-40df-ac10-9deb46e760f1.png">
- Le package pres contient les classes Presentation et pres2 :
<img width="508" alt="11" src="https://user-images.githubusercontent.com/106871413/232955657-5d283597-9783-47bf-9bd7-4c2cbc98d2ab.png">
<img width="450" alt="12" src="https://user-images.githubusercontent.com/106871413/232955674-e2b0979d-1bdb-4e9a-a741-6c4425a2b77d.png">
- Le fichier config.txt :
<img width="206" alt="13" src="https://user-images.githubusercontent.com/106871413/232955786-8b72fea9-452c-44a4-899f-c9c82c9d7526.png">
- Résultats d'injection des dépendances par instanciation statique :
<img width="899" alt="14" src="https://user-images.githubusercontent.com/106871413/232956086-d219a006-0288-490c-b1f9-5c34409151df.png">
- Résultats d'injection des dépendances par instanciation dynamique :
<img width="932" alt="17" src="https://user-images.githubusercontent.com/106871413/232956145-d93a74be-41d5-458f-ba9e-7fdeb0309e22.png">

