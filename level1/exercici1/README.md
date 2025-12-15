# Tasca S1.01 - Herencia i Polimorfisme

**Descripció**: Exercicis de la tasca 1 on es practica les classes i métodes abstractes, a més de, les càrregues de classes i els blocs estàtics (variable static, bloc estàtic, bloc d'inicialització i métode estatic)

## Instrument musical

**Descripció**: S'ha creat una classe abstracta Instrument on les altres classes hereten d'aquesta. Com es abstracta, en cada instància s'ha modificat el métode play() per a que en cada instància tingui un comportament diferent (polimorfisme).

## Càrrega de classes i blocs estàtics

**Descripció**: S'ha afegit en la classe Instrument un bloc static, un bloc d'inicialització i un métode static per veure el comportament que tenen. També s'ha afegit una variable static per veure que pertany a la classe i veure el seu comportament.

1. Què és un bloc d'inicialització (sense static)? Un bloc d'inicialització s'escriu amb la sintaxis {} sense cap paraula davant. Aquest bloc actua cada vegada s'inicia una nova instància de la classe. Per exemple, si inicialitzo 3 instàncies diferentes, com a la part 1 del exercici, per cada instància sortirà el que estigui escrit en el bloc d'inicialització. El bloc d'inicialització pertany a la instància i no a la classe.

2. Quan s'executa? S'executa cada vegada que s'inicia una instància.

3. Quina diferència hi ha entre aquest i un bloc static? El bloc static pertany a la classe i s'executarà només quan s'inicialitzi la classe. En canvi, el bloc d'inicialització pertany a la instància, i cada vegada que s'inicii una nova instància el codi dintre del bloc d'inicialització s'executarà.




