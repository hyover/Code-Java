

Fonction max(a : réel, b : réel) Retourne réel 
# Retourne la plus grande des deux valeurs passées en paramètre 
Variable plusGrand : réel 
Début 
 Si a > b Alors 
   plusGrand <- a 
 Sinon 
   plusGrand <- b 
 FSi 
 Retourner plusGrand 
Fin 
 
Fonction compare(a : réel, b : réel) Retourne entier 
# Retourne une valeur pour indiquer l'ordre des deux valeurs 
# passées en paramètre 
# 0 indique que les deux valeurs sont égales. 
# 1 indique que la première valeur est la plus grande. 
# -1 indique que la seconde valeur est la plus grande. 
Variable ret : entier 
Début 
 Si a = b Alors  
   ret <- 0 
 Sinon 
   Si a > b Alors 
     ret <- 1 
   Sinon 
     ret <- -1 
   FSi 
 FSi 
 Retourner ret 
Fin 
 
Algo TestFonctions 
# Teste les fonctions compare et max 
Variable val1, val2, maximum : réel 
Variable rep    : entier 
Début 
 val1 <- saisir("Entrer une première valeur") 
 val2 <- saisir("Entrer une seconde valeur") 
 maximum <- max(val1, val2) 
 écrire("Le maximum de " & val1 & " et " & val2 & " est " & maximum) 
  rep <- compare(val1, val2) 
 Si rep = 0 Alors 
   écrire("Les deux valeurs sont égales") 
 Sinon 
   Si rep > 0 Alors 
     écrire("La première valeur est la plus grande") 
   Sinon 
     écrire("La seconde valeur est la plus grande") 
   FSi 
 FSi 
Fin 