# Tasca S1.01 - Herencia i Polimorfisme - Nivell 1 - Exercici 2 

**Descripció**: Aquest exercici tracta sobre les diferencies que existeixen entre les variables static final, final i static. Es realitzarán proves per anar veient quina es la diferència i s'explicarà una mica de teoría per diferenciar entre aquestos 3.

## Classe cotxe

**Descripció**: S'ha creat la classe Car amb les variables static final, static i final, i s'ha creat diferents métodes per anar practicant i veient la diferència entre aquestes 3 diferents formes de declarar una variable.

1. Quin d'aquests atributs pot ser inicialitzat des del constructor? Només es podrá inicialitzar en el constructor la variable final, ja que es una variable que pertany a cada instància, llavors cada vegada que s'inicia una instància nova li podem donar un valor a la variable final. Aquesta variable no es pot modificar i només estará present en aquella instància. Si afegim la variable static al constructor, aquesta variable si es pot modificar al llarg del programa, pero aquesta variable va lligada a la classe. Llavors si la fiquem dintre del constructor, per a cada instància estarem modificant el valor d'aquesta variable i aixó es un error de lógica.
2. Quin no es pot modificar mai? La variable que no es pot modificar mai es la variable static final, pertany a la classe i no a la instància, se li dona un valor al inici on es declara la variable o sino al bloc static també es pot inicialitzar. Es una variable constant de la classe i no es pot modificar.
3. Quin afecta totes les instàncies de la classe? La variable que afecta a totes les instàncies son les variables static i static final, ja que pertanyen a la classe. La variable final afecta només a la instància on està declarada, no afectarà a les altres instàncies. En canvi les variables static i static final si afectaràn perque pertanyen a la classe i es poden utilitzar en qualsevol instàncie que s'hagi creat, amb l'unica diferencia que la variable static es pot modificar al llarg del programa i la variable static final no es pot modificar, una vegada declarada ja no es pot modificar el valor.


