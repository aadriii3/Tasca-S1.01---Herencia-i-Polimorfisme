# Tasca S1.01 - Herencia i Polimorfisme

**Descripció**: L'objectiu d'aquest exercici es saber fer us de les classes abstractes i les seves subclasses, saver com funciona la càrrega d classes i els blocs estàtics i també saver quin es l'ús exacte de quan declarem variables static, static final i final.

## Tecnologies
- Java
- Git i Github

## Nivell 1 - Exercici1 

**Descripció**: Exercicis de la tasca 1 on es practica i métodes abstractes, a més de, les cárregues de classes i els blocs estàtics (variable static, bloc estàtic, bloc d'inicialtzació i métode estatic)

### Instrument musical

**Descripció**: S'ha creat una classe abstracta Instrument on les altres classes hereten d'aquesta. Com es abstracta, en cada instància s'ha modificat el métode play() per a que en cada instància tingui un comportament diferent (polimorfisme).

### Càrrega de classes i blocs estàtics

**Descripció**: S'ha afegit en classe Instrument un bloc static, un bloc d'inicialització i un métode static per veure el comportament que tenen. També s'ha afegit una variable static per veure que pertany a la classe i veure el seu comportament.
1. Què és un bloc d'inicialització (sense static)? Un bloc d'inicialització s'escriu amb la sintaxis {} sense cap paraula davant. Aquest bloc actua cada vegada s'inicia una nova instància de la classe. Per exemple, si inicialitzo 3 instàncies diferentes, com la part 1 del exercici, per cada instància sortirà el que estigui escrit en el bloc d'inicilalització. El bloc d'inicialització pertany a la instància i no a la classe.
2. Quan s'executa? S'executa cada vegada que s'inicia una instància.
3. Quina diferència hi ha entre aquest i un bloc static? El bloc static pertany a la classe i s'executarà només quan s'inicialitzi la classe. En canvi, el bloc d'inicialització pertany a la instància, i cada vegada que s'inicii una nova instància el codi dintre del bloc d'inicialització s'executarà.

## Nivell 1 - Exercici 2

**Descripció**: Aquest exercici tracta sobre les diferencies que existeixen entre les variables static final, final i static. Es realitzarán proves per anar veient quina es la diferència i s'explicarà una mica de teoría per diferenciar entre aquestos 3.

### Classe cotxe

**Descripció**: S'ha creat la classe Car amb les variables static final, static i final, i s'ha creat diferents métodes per anar practicant i veient la diferència entre aquests 3 diferents formes de declarar una variable.

1. Quin d'aquests atributs pot ser inicialitzat des del constructor? Només es podrá inicialitzar en el constructor la variable final, ja que es una variable que pertany a cada instància, llavors cada vegada que s'inicia una instància nova li podem donar un valor a la variable final. Aquesta variable no es pot modificar i només estará present en aquella instància. Si afegim la variable static al constructor, aquesta variable si es pot modificar al llarg del programa, pero aquesta variable va lligada a la classe. Llavors si la fiquem dintre del constructor, per a cada instància estarem modificant el valor d'aquesta variable i aixó es un error de lógica.
2. Quin no es pot modificar mai? La variable que no es pot modificar mai es la variable static final, pertany a la classe i no a la instància, se li dona un valor al inici on es declara la variable o sino al bloc static també es pot inicialitzar. Es una variable constant de la classe i no es pot modificar.
3. Quin afecta totes les instàncies de la classe? La variable que afecta a totes les instàncies son les variables static i static final, ja que pertanyen a la classe. La variable final afecta només a la instància on està declarada, no afectarà a les altres instàncies. En canvi les variables static i static final si afectaràn perque pertanyen a la classe i es poden utilitzar en qualsevol instàncie que s'hagi creat, amb l'unica diferencia que la variable static es pot modificar al llarg del programa i la variable static final no es pot modificar, una vegada declarada ja no es pot modificar el valor.

## Nivell 2

### Exercici 1 – Smartphone amb múltiples funcionalitats

**Descripció**: En aquest exercici es practicarà l'herència de classes amb l'implementació d'interfícies.

## Nivell 3 - Exercici1 - Redacció de notícies esportives.

**Descripció**: S'ha de dissenyar un sistema per a una redacció de noticies esp>

### Implementacions:

S'ha implementat la classe abstracta News, les subclasses de noticies de futbol>

