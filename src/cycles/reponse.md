-Exo 5 

Redéfinir une méthode signifie réécrire une méthode déjà définie dans une classe mère dans une classe fille, en conservant la même signature .

-Exo 6 

Dans VeloElec, les méthodes redéfinies sont :
getPuissance(double FrequenceCoupsDePedale)
to string() 

-Exo 7 

L'annotation @Override indique que la méthode redéfinit une méthode de la classe mère.


-Exo 8 

S’assure que la méthode redéfinit bien une méthode existante de la classe mère.
Évite les erreurs de frappe
Indique clairement qu’une méthode redéfinit une méthode héritée.
Si la méthode de la classe mère est modifiée ou supprimée, Java signalera une erreur.
Obligatoire pour une redéfinition correcte.

-Exo10

super.getPuissance(FrequenceCoupsDePedale) permet d'accéder à la méthode de la classe parente Velo pour récupérer un résultat de base avant de l'enrichir ou de le modifier dans la classe dérivée VeloElec.