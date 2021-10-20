Algo payslip
#Display gross salary according to number of hours worked and hourly rate 

#Fields
Variable name, firstName : texte
Variabele statut, nbOfChildren : entier
Variable nbHours, hourlyRate, nbHours50, nbHours60, csgImp, csgnImp, assMal, assVie, assCho, retCmp, cotAgf, prime, totalCot : réel
Variable grossSalary : réel <- 0
Variable netSalary : réel

Constante serviceAgent : entier <- 1
Constante clerk : entier <- 2
Constante exectutive : entier <- 3

Constante increasedRate50 : réel <- 50.00/100
Constante increasedRate60 : réel <- 60.00/100

Constante thresholdIncrease50 : réel <- 169
Constante thresholdIncrease60 : réel <- 180

Constante csgImpRate : réel <- 3,49/100
Constante csgnImpRate : réel <- 6,15/100
Constante assMalRate : réel <- 0,95/100
Constante assVieRate : réel <- 8,44/100
Constante assChoRate : réel <- 3,05/100
Constante retCmpRate : réel <- 3,81/100
Constante cotAgfRate : réel <- 1,02/100

	Début

		#Entering the information necessary to establish the pay slip
		écrire("Nom de la personne ?")
		nom	<- saisir()
		écrire("Prénom de la personne ?")
		prénom <- saisir()
		écrire("Statut ?")
		écrire(serviceAgent & " - Agent de service")
		écrire(clerk & " - Employé de bureau")
		écrire(exectutive & " - Cadre")
		statut <- saisir()
		écrire("Nombre d'heures travaillés ?")
		nbHours <- saisir()
		écrire("Taux horraire ?")
		hourlyRate <- saisi()
		écrire("Nombre d'enfants ?")
		nbOfChildren <- saisir()

		#Display of the pay slip header
		écrire("Bulletin de " & firstName & " " & name)
		Si statut = exectutive Alors
			écrire ("Statut : Cadre")
		Sinon
			Si statut = clerk Alors
				écrire("Statut : Employé de bureau")
			Sinon
				écrire("Statut : Agent de service")
			Fsi 
		Fsi 

		#Calculation of gross salary
		nbHours60 <- nbHours - thresholdIncrease60;
		Si nbHours60 > 0 Alors
			grossSalary <- nbHours60 * (thresholdIncrease60 + 1) * hourlyRate
			nbHours <- nbHours - nbHours60;

		Fsi 

		nbHours50 <- nbHours - thresholdIncrease50;
		Si nbHours50 > 0 Alors
			grossSalary <- grossSalary + nbHours50 * (thresholdIncrease50 + 1) * hourlyRate
			nbHours <- nbHours - nbHours50;

		Fsi 

		grossSalary <- grossSalary + nbHours * hourlyRate

		écrire("Salaire brut : " & grossSalary & " € (" & nbHours " h sans majoration, " & nbHours50 & " h avec une majoration de " & 
				increasedRate50 * 100 & "%, " & nbHours60 & "h avec une majoration de " & increasedRate60 * 100 & "%")

		#Calculation of employee contribution
		écrire("Calcul des cotisations :")

		écrire(" - Contribution pour le remboursement de la dette sociale et contribution sociale généralisée imposable")
		csgImp <- grossSalary * csgImpRate
		écrire(grossSalary & "€ x " & csgImpRate * 100 & "% = " & csgImp & "€")

		écrire(" - Contribution sociale généralisée non imposable")
		csgnImp <- grossSalary * csgnImpRate
		écrire(grossSalary & "€ x " & csgnImpRate * 100 & "% = " & csgnImp & "€")

		écrire(" - Assurance maladie") 
   		assMal <- grossSalary * assMalRate
  		écrire(grossSalary & "€ × " & assMalRate * 100 & "% = " & assMal & "€") 
 
 		écrire(" - Assurance vieillesse") 
  		assVie <- grossSalary * assVieRate
  		écrire(grossSalary & "€ × " & assVieRate * 100 & "% = " & assVie & "€") 
 
  		écrire(" - Assurance chômage") 
  		assCho <- grossSalary * assChoRate
   		écrire(grossSalary & "€ × " & assChoRate * 100 & "% = " & assCho & "€") 
 
 	    écrire(" - Retraite complémentaire (IRCEM)") 
  		retCmp <- grossSalary * retCmpRate
 		écrire(grossSalary & "€ × " & retCmpRate * 100 & "% = " & retCmp & "€") 
 
  		écrire(" - Cotisation AGFF") 
  		cotAgf <- grossSalary * cotAgfRate
   		écrire(grossSalary & "€ × " & cotAgfRate * 100 & "% = " & cotAgf & "€")

   		totalCot <- csgImp + csgnImp + assMal + assVie + assCho + retCmp + cotAgf
   		écrire("Total des cotisations salariales : " & totalCot & "€")

   		netSalary <- grossSalary - totalCot
   		écrire("Salaire : " & netSalary & "€")

   		#Premium calculation
   		Selon nbOfChildren
   			cas 0 : prime <- 0
   			cas 1 : prime <- 20
   			cas 2 : prime <- 50
   			autre : prime <- 70 + 20 * (nbOfChildren - 2)
   		FSelon

   		écrire(" - Prime familiale : " & prime & "€")
   		netSalary <- netSalary + prime
   		écrire("Salaire net à payer : " & netSalary)
   	 




































