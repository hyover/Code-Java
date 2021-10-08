Algo tempsDeCuisson
#Affiche le temps de cuisson selon le choix de la viande, de son poid et son mode de cuisson

Variable meat : entier
Variable weight : entier
Variable cooking : entier

#Coefficient de cuisson
Constante coefficient <- réel

Constante boeuf : entier <- 1 
Constante agneaux : entier <- 2

Constante bleu : entier <- 1
Constante aPoint : entier <- 2
Constante bienCuit : entier <- 3

Constante uneMinute : entier <- 60

Constante bleuA : réel <- 15/400
Constante bleuB : réel <- 10/500
Constante aPointA : réel <- 17/500
Constante aPointB : réel <- 25/400
Constante bienCuitA :  réel <- 40/400
Constante bienCuitB : réel <- 25/500

	début
		
		#Choix de la viande
		écrire("Choisssisez votre viande en tapant 1 ou 2")
		écrire(boeuf & "- Boeuf")
		écrire(agneaux & "- Agneaux")
		meat <- saisir()

		#Poid de la viande
		weight <- saisir("Quel le poids en gramme de votre viande ?")

		#Choix de la cuisson
		écrire("Choisssisez votre cuisson en tapant 1, 2 ou 3")
		écrire(bleu & "- Bleu")
		écrire(aPoint & "- A point")
		écrire(bienCuit & "- Bien cuit")

		#Condition de cuisson selon viande et poid et méthode
		Si meat = boeuf Alors
			Selon cooking
				cas bleu : coefficient <- bleuB
				cas aPoint : coefficient <- aPointB
				autre : coefficient <- bienCuitB
			FSelon
		Sinon 
			Selon cooking
				cas bleu : coefficient <- bleuA
				cas bleu : coefficient <- aPointA
				autre : coefficient <- bienCuitA
			FSelon
		FSi

		écrire("Le temps de cuisson est de " & weight*coefficient*uneMinute & "secondes")
	fin



