Algoritmo "Acordar"

Var

despertador, encontrouChinelos: caractere

Inicio

Escreval("Despertador toca!")
Escreval("Abrir os olhos")
Escreval("Desligar o despertador")

repita
Escreval("Despertador está desligado?")
leia(despertador)
ate (despertador = "sim")

Escreval("Muito bem, sentar na cama e procurar os chinelos")
Escreval("...")
Escreval("Encontrou os chinelos?")
leia(encontrouChinelos)

se encontrouChinelos = "sim" entao
   Escreval("Levantar e ir escovar os dentes")
senao
     Escreval("Levantar sem os chinelos")
fimse

Fimalgoritmo